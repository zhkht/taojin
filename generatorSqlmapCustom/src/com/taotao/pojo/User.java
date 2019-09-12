package com.taotao.pojo;

public class User {
    private String uusername;

    private String upassword;

    private String uaccess;

    public String getUusername() {
        return uusername;
    }

    public void setUusername(String uusername) {
        this.uusername = uusername == null ? null : uusername.trim();
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword == null ? null : upassword.trim();
    }

    public String getUaccess() {
        return uaccess;
    }

    public void setUaccess(String uaccess) {
        this.uaccess = uaccess == null ? null : uaccess.trim();
    }
}