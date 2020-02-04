package com.statinsti.app;

public class Livetrade {
    private String brr,srr,ltt,tc,pl,email;

    public Livetrade(){

    }

    public Livetrade(String brr, String srr, String ltt, String tc, String pl, String email) {
        this.brr = brr;
        this.srr = srr;
        this.ltt = ltt;
        this.tc = tc;
        this.pl = pl;
        this.email = email;
    }

    public String getBrr() {
        return brr;
    }

    public String getSrr() {
        return srr;
    }

    public String getLtt() {
        return ltt;
    }

    public String getTc() {
        return tc;
    }

    public String getPl() {
        return pl;
    }

    public String getEmail() {
        return email;
    }
}
