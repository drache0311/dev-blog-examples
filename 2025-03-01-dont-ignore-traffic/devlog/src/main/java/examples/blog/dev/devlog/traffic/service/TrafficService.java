package examples.blog.dev.devlog.traffic.service;

import examples.blog.dev.devlog.traffic.domain.SampleData;

import java.util.List;

public interface TrafficService {
    void handlingTrafficAtOneTransaction(List<SampleData> sampleDataList);

    void handlingTrafficAtEachTransaction(List<SampleData> sampleDataList);

    void handlingTrafficAtAsync(List<SampleData> sampleDataList);

    void handlingTrafficAtParallel(List<SampleData> hugeDataList);
}
