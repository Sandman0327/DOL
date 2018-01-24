package cn.cabbsir.curd.bean;

import java.util.Date;

public class Distribution {
    private Integer did;

    private Date ddate;

    private Integer dmoney;

    private Integer dorder1;

    private Integer dorder2;

    private Integer dorder3;

    private String dstate;

    private String dlocation;

    private Integer dsid;

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Date getDdate() {
        return ddate;
    }

    public void setDdate(Date ddate) {
        this.ddate = ddate;
    }

    public Integer getDmoney() {
        return dmoney;
    }

    public void setDmoney(Integer dmoney) {
        this.dmoney = dmoney;
    }

    public Integer getDorder1() {
        return dorder1;
    }

    public void setDorder1(Integer dorder1) {
        this.dorder1 = dorder1;
    }

    public Integer getDorder2() {
        return dorder2;
    }

    public void setDorder2(Integer dorder2) {
        this.dorder2 = dorder2;
    }

    public Integer getDorder3() {
        return dorder3;
    }

    public void setDorder3(Integer dorder3) {
        this.dorder3 = dorder3;
    }

    public String getDstate() {
        return dstate;
    }

    public void setDstate(String dstate) {
        this.dstate = dstate == null ? null : dstate.trim();
    }

    public String getDlocation() {
        return dlocation;
    }

    public void setDlocation(String dlocation) {
        this.dlocation = dlocation == null ? null : dlocation.trim();
    }

    public Integer getDsid() {
        return dsid;
    }

    public void setDsid(Integer dsid) {
        this.dsid = dsid;
    }
}