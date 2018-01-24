package cn.cabbsir.curd.bean;

import java.util.Date;

public class MaterialOrder {
    private Integer moid;

    private Date modate;

    private Integer moorder;

    private String mostate;

    public Integer getMoid() {
        return moid;
    }

    public void setMoid(Integer moid) {
        this.moid = moid;
    }

    public Date getModate() {
        return modate;
    }

    public void setModate(Date modate) {
        this.modate = modate;
    }

    public Integer getMoorder() {
        return moorder;
    }

    public void setMoorder(Integer moorder) {
        this.moorder = moorder;
    }

    public String getMostate() {
        return mostate;
    }

    public void setMostate(String mostate) {
        this.mostate = mostate == null ? null : mostate.trim();
    }
}