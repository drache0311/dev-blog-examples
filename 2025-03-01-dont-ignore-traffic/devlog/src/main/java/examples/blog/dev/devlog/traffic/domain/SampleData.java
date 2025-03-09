package examples.blog.dev.devlog.traffic.domain;

import examples.blog.dev.devlog.traffic.domain.entity.TrafficEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class SampleData {
    private String oneStringValue;
    private long oneLongValue;
    private BigDecimal oneBigDecimalValue;
    private boolean oneBooleanValue;
    private String twoStringValue;
    private long twoLongValue;
    private BigDecimal twoBigDecimalValue;
    private boolean twoBooleanValue;

    public TrafficEntity toEntity() {
        return TrafficEntity.builder()
                .oneStringValue(this.oneStringValue)
                .oneLongValue(this.oneLongValue)
                .oneBigDecimalValue(this.oneBigDecimalValue)
                .oneBooleanValue(this.oneBooleanValue)
                .twoStringValue(this.twoStringValue)
                .twoLongValue(this.twoLongValue)
                .twoBigDecimalValue(this.twoBigDecimalValue)
                .twoBooleanValue(this.twoBooleanValue)
                .build();
    }
}
