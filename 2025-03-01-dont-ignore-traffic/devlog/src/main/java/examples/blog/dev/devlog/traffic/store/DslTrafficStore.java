package examples.blog.dev.devlog.traffic.store;

import com.querydsl.jpa.impl.JPAQueryFactory;
import examples.blog.dev.devlog.traffic.domain.entity.TrafficEntity;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
public class DslTrafficStore implements TrafficStore {
    private JPAQueryFactory jpaQueryFactory;
    private EntityManager entityManager;

    public DslTrafficStore(EntityManager entityManager) {
        this.entityManager = entityManager;
        this.jpaQueryFactory = new JPAQueryFactory(entityManager);
    }

    @Override
    @Transactional
    public void createData(TrafficEntity trafficEntity) {
        entityManager.persist(trafficEntity);
    }
}
