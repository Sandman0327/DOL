package cn.cabbsir.curd.bean;

import java.util.Date;

public class Production {
    private Integer poid;

    private Integer posid;

    private Date podate;

    private Integer pomoney;

    private Integer poorder1;

    private Integer poorder2;

    private Integer poorder3;

    private String postate;

    public Integer getPoid() {
        return poid;
    }

    public void setPoid(Integer poid) {
        this.poid = poid;
    }

    public Integer getPosid() {
        return posid;
    }

    public void setPosid(Integer posid) {
        this.posid = posid;
    }

    public Date getPodate() {
        return podate;
    }

    public void setPodate(Date podate) {
        this.podate = podate;
    }

    public Integer getPomoney() {
        return pomoney;
    }

    public void setPomoney(Integer pomoney) {
        this.pomoney = pomoney;
    }

    public Integer getPoorder1() {
        return poorder1;
    }

    public void setPoorder1(Integer poorder1) {
        this.poorder1 = poorder1;
    }

    public Integer getPoorder2() {
        return poorder2;
    }

    public void setPoorder2(Integer poorder2) {
        this.poorder2 = poorder2;
    }

    public Integer getPoorder3() {
        return poorder3;
    }

    public void setPoorder3(Integer poorder3) {
        this.poorder3 = poorder3;
    }

    public String getPostate() {
        return postate;
    }

    public void setPostate(String postate) {
        this.postate = postate == null ? null : postate.trim();
    }
}