package com.alex.pojo;

public class depart {
    private String did     ;
    private String dname   ;
    private String dmanager;

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDmanager() {
        return dmanager;
    }

    public void setDmanager(String dmanager) {
        this.dmanager = dmanager;
    }

    @Override
    public String toString() {
        return "depart{" +
                "did='" + did + '\'' +
                ", dname='" + dname + '\'' +
                ", dmanager='" + dmanager + '\'' +
                '}';
    }
}
