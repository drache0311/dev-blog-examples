package examples.blog.dev.devlog.traffic.service;

import examples.blog.dev.devlog.traffic.domain.SampleData;
import examples.blog.dev.devlog.traffic.store.TrafficStore;
import jakarta.transaction.Transactional;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultAsyncService implements AsyncService {
    private final TrafficStore trafficStore;

    public DefaultAsyncService(TrafficStore trafficStore) {
        this.trafficStore = trafficStore;
    }

    @Override
    @Transactional
    @Async
    public void handlingTrafficAtAsync(List<SampleData> sampleDataList) {
        sampleDataList.stream().map(SampleData::toEntity).forEach(trafficStore::createData);
    }
}
