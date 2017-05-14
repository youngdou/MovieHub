package actPlus.business.dao;

import actPlus.business.entities.Activity;

import java.util.List;

/**
 * Created by young on 16-11-24.
 */
public interface ActivityDao {

    public List<Activity> findPageByactType(int start, int pageSize, String actType);

    public void create(final Activity activity);

    public void deleteById(final Integer id);

    public Activity update(final Activity activity);

    public Activity findById(final Integer id);

    public List<Activity> findPageByactPub(int start, int pageSize, String actPub);

    public List<Activity> findPages(int start, int pageSize);

    public List<Activity> findAllByActpub(final String pubname);
}
