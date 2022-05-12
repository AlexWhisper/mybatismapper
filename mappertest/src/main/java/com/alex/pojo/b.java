package com.alex.pojo;

public class b {
    private String sname;
    private String grade;

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "b{" +
                "sname='" + sname + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
