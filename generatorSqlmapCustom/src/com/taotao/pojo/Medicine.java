package com.taotao.pojo;

public class Medicine {
    private String mno;

    private String mname;

    private String mmode;

    private String mefficacy;

    private Integer mid;

    public String getMno() {
        return mno;
    }

    public void setMno(String mno) {
        this.mno = mno == null ? null : mno.trim();
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname == null ? null : mname.trim();
    }

    public String getMmode() {
        return mmode;
    }

    public void setMmode(String mmode) {
        this.mmode = mmode == null ? null : mmode.trim();
    }

    public String getMefficacy() {
        return mefficacy;
    }

    public void setMefficacy(String mefficacy) {
        this.mefficacy = mefficacy == null ? null : mefficacy.trim();
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }
}