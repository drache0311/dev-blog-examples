package examples.blog.dev.devlog.traffic.service;

import examples.blog.dev.devlog.traffic.domain.SampleData;
import examples.blog.dev.devlog.traffic.store.TrafficStore;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultTrafficService implements TrafficService {
    private final TrafficStore trafficStore;
    private final AsyncService asyncService;

    public DefaultTrafficService(TrafficStore trafficStore, AsyncService asyncService) {
        this.trafficStore = trafficStore;
        this.asyncService = asyncService;
    }

    @Override
    @Transactional
    public void handlingTrafficAtOneTransaction(List<SampleData> sampleDataList) {
        sampleDataList.stream().map(SampleData::toEntity).forEach(trafficStore::createData);
    }

    @Override
    public void handlingTrafficAtEachTransaction(List<SampleData> sampleDataList) {
        sampleDataList.stream().map(SampleData::toEntity).forEach(trafficStore::createData);
    }

    @Override
    public void handlingTrafficAtAsync(List<SampleData> sampleDataList) {
        int BATCH_SIZE = 10000;

        for (int i = 0; i < sampleDataList.size(); i += BATCH_SIZE) {
            int end = Math.min(i + BATCH_SIZE, sampleDataList.size());
            List<SampleData> batch = sampleDataList.subList(i, end);
            asyncService.handlingTrafficAtAsync(batch);
        }
    }

    @Override
    @Transactional
    public void handlingTrafficAtParallel(List<SampleData> sampleDataList) {
        sampleDataList.parallelStream().map(SampleData::toEntity).forEach(trafficStore::createData);
    }
}
