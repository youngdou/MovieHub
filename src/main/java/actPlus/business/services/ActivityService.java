package actPlus.business.services;

import actPlus.business.dao.ActivityDao;
import actPlus.business.entities.Activity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by young on 16-11-24.
 */
@Service
@Transactional
public class ActivityService {
    @Autowired private ActivityDao activityDao;

    public List<Activity> findPageByactType(int start, int pageSize, String actType) {
        return  activityDao.findPageByactType(start, pageSize, actType);
    }
    public ActivityService() {
        super();
    }

    public Activity findById(Integer id) {
        return activityDao.findById(id);
    }

    public void create(final Activity activity) {
        //同时创建activityMeta，保持一致
        activityDao.create(activity);

    }

    public List<Activity> findPageByactPub(int start, int pageSize, String actPub) {
        return activityDao.findPageByactPub(start, pageSize, actPub);
    }

    public List<Activity> findAllByActpub(String pubname) {
        return activityDao.findAllByActpub(pubname);
    }

    public List<Activity> findPage(int start, int pageSize) {
        return activityDao.findPages(start, pageSize);
    }


}
