package examples.blog.dev.devlog.traffic.store;

import examples.blog.dev.devlog.traffic.domain.entity.TrafficEntity;

public interface TrafficStore {
    void createData(TrafficEntity trafficEntity);
}
