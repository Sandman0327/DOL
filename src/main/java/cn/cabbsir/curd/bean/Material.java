package cn.cabbsir.curd.bean;

import java.util.Date;

public class Material {
    private Integer mid;

    private Date mbegin;

    private Date mend;

    private String mstate;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Date getMbegin() {
        return mbegin;
    }

    public void setMbegin(Date mbegin) {
        this.mbegin = mbegin;
    }

    public Date getMend() {
        return mend;
    }

    public void setMend(Date mend) {
        this.mend = mend;
    }

    public String getMstate() {
        return mstate;
    }

    public void setMstate(String mstate) {
        this.mstate = mstate == null ? null : mstate.trim();
    }
}