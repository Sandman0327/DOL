package cn.cabbsir.curd.bean;

import java.util.Date;

public class Sell {
    private Integer seid;

    private Date sedate;

    private Integer sesale;

    public Integer getSeid() {
        return seid;
    }

    public void setSeid(Integer seid) {
        this.seid = seid;
    }

    public Date getSedate() {
        return sedate;
    }

    public void setSedate(Date sedate) {
        this.sedate = sedate;
    }

    public Integer getSesale() {
        return sesale;
    }

    public void setSesale(Integer sesale) {
        this.sesale = sesale;
    }
}