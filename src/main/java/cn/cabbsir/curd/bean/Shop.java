package cn.cabbsir.curd.bean;

public class Shop {
    private Integer sid;

    private String susername;

    private String spassword;

    private String slocation;

    private Integer srank;

    private String sphonenumber;

    public void Shop(){}

    public Shop(Integer sid, String susername, String spassword, String slocation, Integer srank, String sphonenumber) {
        this.sid = sid;
        this.susername = susername;
        this.spassword = spassword;
        this.slocation = slocation;
        this.srank = srank;
        this.sphonenumber = sphonenumber;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSusername() {
        return susername;
    }

    public void setSusername(String susername) {
        this.susername = susername == null ? null : susername.trim();
    }

    public String getSpassword() {
        return spassword;
    }

    public void setSpassword(String spassword) {
        this.spassword = spassword == null ? null : spassword.trim();
    }

    public String getSlocation() {
        return slocation;
    }

    public void setSlocation(String slocation) {
        this.slocation = slocation == null ? null : slocation.trim();
    }

    public Integer getSrank() {
        return srank;
    }

    public void setSrank(Integer srank) {
        this.srank = srank;
    }

    public String getSphonenumber() {
        return sphonenumber;
    }

    public void setSphonenumber(String sphonenumber) {
        this.sphonenumber = sphonenumber == null ? null : sphonenumber.trim();
    }
}