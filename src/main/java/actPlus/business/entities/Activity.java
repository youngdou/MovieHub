package actPlus.business.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by young on 16-11-23.
 */

//Activity是经过审查通过的活动
//待审查的活动在AuditingActs
//过期的活动在ClosedActs

@Entity
public class Activity implements Serializable {
    @Id
    private Integer actId;

    private String actType;
    private String actName;
    private String actTime;
    private String actLoc;
    private String actIntru;
    private String actPub;
    private String actFor;
    private String actJoin;
    private Date actDDL;
    private String actDetail;
    private String posterName;
    private String qrName;
    private String PEChapter;
    private String welTime;
    private String otherAw;
    private String actDem;
    private Integer peopleLimit;

    private boolean isAuthen;

    public Activity() {}

    public Activity(Integer actId, String actType, String actName, String actTime, String actLoc, String actIntru, String actPub, String actFor, String actJoin, Date actDDL, String actDetail, String posterName, String qrName, String PEChapter, String welTime, String otherAw, String actDem, Integer peopleLimit) {
        this.actId = actId;
        this.actType = actType;
        this.actName = actName;
        this.actTime = actTime;
        this.actLoc = actLoc;
        this.actIntru = actIntru;
        this.actPub = actPub;
        this.actFor = actFor;
        this.actJoin = actJoin;
        this.actDDL = actDDL;
        this.actDetail = actDetail;
        this.posterName = posterName;
        this.qrName = qrName;
        this.PEChapter = PEChapter;
        this.welTime = welTime;
        this.otherAw = otherAw;
        this.actDem = actDem;
        this.peopleLimit = peopleLimit;
    }


    public boolean isAuthen() {
        return isAuthen;
    }

    public void setAuthen(boolean authen) {
        isAuthen = authen;
    }

    public String getQrName() {
        return qrName;
    }

    public void setQrName(String qrName) {
        this.qrName = qrName;
    }

    public Integer getPeopleLimit() {
        return peopleLimit;
    }

    public void setPeopleLimit(Integer peopleLimit) {
        this.peopleLimit = peopleLimit;
    }

    public Integer getActId() {
        return actId;
    }

    public void setActId(Integer actId) {
        this.actId = actId;
    }

    public String getActType() {
        return actType;
    }

    public void setActType(String actType) {
        this.actType = actType;
    }

    public String getActName() {
        return actName;
    }

    public void setActName(String actName) {
        this.actName = actName;
    }

    public String getActTime() {
        return actTime;
    }

    public void setActTime(String actTime) {
        this.actTime = actTime;
    }

    public String getActLoc() {
        return actLoc;
    }

    public void setActLoc(String actLoc) {
        this.actLoc = actLoc;
    }

    public String getActIntru() {
        return actIntru;
    }

    public void setActIntru(String actIntru) {
        this.actIntru = actIntru;
    }

    public String getActPub() {
        return actPub;
    }

    public void setActPub(String actPub) {
        this.actPub = actPub;
    }

    public String getActFor() {
        return actFor;
    }

    public void setActFor(String actFor) {
        this.actFor = actFor;
    }

    public String getActJoin() {
        return actJoin;
    }

    public void setActJoin(String actJoin) {
        this.actJoin = actJoin;
    }

    public Date getActDDL() {
        return actDDL;
    }

    public void setActDDL(Date actDDL) {
        this.actDDL = actDDL;
    }

    public String getActDetail() {
        return actDetail;
    }

    public void setActDetail(String actDetail) {
        this.actDetail = actDetail;
    }

    public String getPosterName() {
        return posterName;
    }

    public void setPosterName(String posterName) {
        this.posterName = posterName;
    }

    public String getPEChapter() {
        return PEChapter;
    }

    public void setPEChapter(String PEChapter) {
        this.PEChapter = PEChapter;
    }

    public String getWelTime() {
        return welTime;
    }

    public void setWelTime(String welTime) {
        this.welTime = welTime;
    }

    public String getOtherAw() {
        return otherAw;
    }

    public void setOtherAw(String otherAw) {
        this.otherAw = otherAw;
    }

    public String getActDem() {
        return actDem;
    }

    public void setActDem(String actDem) {
        this.actDem = actDem;
    }
}
