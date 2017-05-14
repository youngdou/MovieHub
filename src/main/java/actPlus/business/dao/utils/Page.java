package actPlus.business.dao.utils;

import actPlus.business.entities.Activity;

import java.util.List;

/**
 * Created by AAAAA on 2016/11/26.
 */
public class Page {
    private List<Activity> activityList;
    private int pageSize;
    private int PageNo;

    public List<Activity> getActivityList() {
        return activityList;
    }

    public void setActivityList(List<Activity> activityList) {
        this.activityList = activityList;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNo() {
        return PageNo;
    }

    public void setPageNo(int pageNo) {
        PageNo = pageNo;
    }
}
