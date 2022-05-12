package com.alex.mapper;

public class cou {
    private String cno    ;
    private String cname  ;
    private String credit ;
    private String ptime  ;
    private String teacher;

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public String getPtime() {
        return ptime;
    }

    public void setPtime(String ptime) {
        this.ptime = ptime;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "cou{" +
                "cno='" + cno + '\'' +
                ", cname='" + cname + '\'' +
                ", credit='" + credit + '\'' +
                ", ptime='" + ptime + '\'' +
                ", teacher='" + teacher + '\'' +
                '}';
    }
}
