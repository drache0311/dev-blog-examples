package examples.blog.dev.devlog.traffic.controller;

import examples.blog.dev.devlog.traffic.domain.SampleData;
import examples.blog.dev.devlog.traffic.service.DefaultTrafficService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TrafficController {

    private final DefaultTrafficService trafficService;

    public TrafficController(DefaultTrafficService trafficService) {
        this.trafficService = trafficService;
    }

    @PostMapping("/traffic/one")
    public void makeTrafficAtOneTransaction(@RequestBody List<SampleData> hugeDataList) {
        trafficService.handlingTrafficAtOneTransaction(hugeDataList);
    }

    @PostMapping("/traffic/async")
    public void makeTrafficAtAsync(@RequestBody List<SampleData> hugeDataList) {
        trafficService.handlingTrafficAtAsync(hugeDataList);
    }

    @PostMapping("/traffic/parallel")
    public void makeTrafficAtParallel(@RequestBody List<SampleData> hugeDataList) {
        trafficService.handlingTrafficAtParallel(hugeDataList);
    }

    @PostMapping("/traffic/each")
    public void makeTrafficAtEachTransaction(@RequestBody List<SampleData> hugeDataList) {
        trafficService.handlingTrafficAtEachTransaction(hugeDataList);
    }
}
