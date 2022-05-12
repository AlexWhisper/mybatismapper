package com.alex.pojo;

public class stu {
   private String sno      ;
   private String sname    ;
   private String sex      ;
   private String mno      ;
   private String birdate  ;
   private String memo     ;

   public String getSno() {
      return sno;
   }

   public void setSno(String sno) {
      this.sno = sno;
   }

   public String getSname() {
      return sname;
   }

   public void setSname(String sname) {
      this.sname = sname;
   }

   public String getSex() {
      return sex;
   }

   public void setSex(String sex) {
      this.sex = sex;
   }

   public String getMno() {
      return mno;
   }

   public void setMno(String mno) {
      this.mno = mno;
   }

   public String getBirdate() {
      return birdate;
   }

   public void setBirdate(String birdate) {
      this.birdate = birdate;
   }

   public String getMemo() {
      return memo;
   }

   public void setMemo(String memo) {
      this.memo = memo;
   }

   @Override
   public String toString() {
      return "stu{" +
              "sno='" + sno + '\'' +
              ", sname='" + sname + '\'' +
              ", sex='" + sex + '\'' +
              ", mno='" + mno + '\'' +
              ", birdate='" + birdate + '\'' +
              ", memo='" + memo + '\'' +
              '}';
   }
}
