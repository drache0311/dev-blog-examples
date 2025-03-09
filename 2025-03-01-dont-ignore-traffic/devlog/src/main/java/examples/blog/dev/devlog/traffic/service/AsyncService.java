package examples.blog.dev.devlog.traffic.service;

import examples.blog.dev.devlog.traffic.domain.SampleData;

import java.util.List;

public interface AsyncService {
    void handlingTrafficAtAsync(List<SampleData> sampleDataList);
}
