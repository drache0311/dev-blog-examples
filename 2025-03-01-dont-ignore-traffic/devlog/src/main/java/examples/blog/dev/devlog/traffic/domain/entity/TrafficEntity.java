package examples.blog.dev.devlog.traffic.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
@Table(name = "TRAFFIC")
public class TrafficEntity {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "ONE_STRING")
    private String oneStringValue;
    @Column(name = "ONE_LONG")
    private long oneLongValue;
    @Column(name = "ONE_BIGDECIMAL")
    private BigDecimal oneBigDecimalValue;
    @Column(name = "ONE_BOOLEAN")
    private boolean oneBooleanValue;
    @Column(name = "TWO_STRING")
    private String twoStringValue;
    @Column(name = "TWO_LONG")
    private long twoLongValue;
    @Column(name = "TWO_BIGDECIMAL")
    private BigDecimal twoBigDecimalValue;
    @Column(name = "TWO_BOOLEAN")
    private boolean twoBooleanValue;
}
