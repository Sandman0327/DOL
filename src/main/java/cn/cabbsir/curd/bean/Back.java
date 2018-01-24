package cn.cabbsir.curd.bean;

import java.util.Date;

public class Back {
    private Integer bid;

    private Date bdate;

    private String bsource;

    private Integer bmoney;

    private Integer border1;

    private Integer border2;

    private Integer border3;

    private String bstate;

    private Integer bsid;

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public Date getBdate() {
        return bdate;
    }

    public void setBdate(Date bdate) {
        this.bdate = bdate;
    }

    public String getBsource() {
        return bsource;
    }

    public void setBsource(String bsource) {
        this.bsource = bsource == null ? null : bsource.trim();
    }

    public Integer getBmoney() {
        return bmoney;
    }

    public void setBmoney(Integer bmoney) {
        this.bmoney = bmoney;
    }

    public Integer getBorder1() {
        return border1;
    }

    public void setBorder1(Integer border1) {
        this.border1 = border1;
    }

    public Integer getBorder2() {
        return border2;
    }

    public void setBorder2(Integer border2) {
        this.border2 = border2;
    }

    public Integer getBorder3() {
        return border3;
    }

    public void setBorder3(Integer border3) {
        this.border3 = border3;
    }

    public String getBstate() {
        return bstate;
    }

    public void setBstate(String bstate) {
        this.bstate = bstate == null ? null : bstate.trim();
    }

    public Integer getBsid() {
        return bsid;
    }

    public void setBsid(Integer bsid) {
        this.bsid = bsid;
    }
}