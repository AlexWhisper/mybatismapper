package com.alex.pojo;

public class sc {
    private String sno;
    private String cno;
    private String grade;

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "sc{" +
                "sno='" + sno + '\'' +
                ", cno='" + cno + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
