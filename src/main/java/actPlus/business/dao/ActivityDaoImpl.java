package actPlus.business.dao;

import actPlus.business.entities.Activity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by young on 16-11-24.
 */
@Repository
public class ActivityDaoImpl extends AbstractJpaDAO<Activity> implements ActivityDao {

    @PersistenceContext
    EntityManager entityManager;

    private ActivityDaoImpl() {
        super();
        setClazz(Activity.class);
    }

    public List<Activity> findPageByactType(int start, int pageSize, String actType) {
        String sql = "from Activity a where a.actType = ?1 ORDER BY actId DESC";
        Query query = entityManager.createQuery(sql,Activity.class);
        query.setParameter(1, actType);
        query.setFirstResult(start);
        query.setMaxResults(pageSize);

        return query.getResultList();
    }

    public List<Activity> findPageByactPub(int start, int pageSize, String actPub) {
        String sql = "from Activity a where a.actPub = ?1 ORDER BY actId DESC";
        Query query = entityManager.createQuery(sql,Activity.class);
        query.setParameter(1, actPub);
        query.setFirstResult(start);
        query.setMaxResults(pageSize);

        return query.getResultList();
    }

    public  List<Activity> findPages(int start, int pageSize) {
        String sql = "from Activity a  ORDER BY actDDL DESC";
        Query query = entityManager.createQuery(sql,Activity.class);
        query.setFirstResult(start);
        query.setMaxResults(pageSize);
        return query.getResultList();
    }

    @Override
    public List<Activity> findAllByActpub(String pubname) {
        String sql = "from Activity a where a.actPub = ?1 order by a.pubTime DESC";
        Query query = entityManager.createQuery(sql, Activity.class);
        query.setParameter(1, pubname);

        return query.getResultList();
    }
}
