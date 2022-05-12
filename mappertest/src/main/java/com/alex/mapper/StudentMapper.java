package com.alex.mapper;

import com.alex.pojo.Student;
import com.alex.pojo.sc;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;

public interface StudentMapper {
    List<Student> nophone();

    Student selectById(int id);
    int inserStu(Student s);
    int countAll();


    int maxAge();
    int minAge();
    int avgAge();

    List<Student> findStudent();
    List<Student> eql22();
   List<Student> above22();
   List<Student> blow22();
   List<Student> not22();
   List<Student> betweenage(int age1,int age2);

   List<Student> selectage(int age);

    List<Student> fromage();

    List<Student> agemax();

    List<Student> classavgAge();

    List<Student> fromwhere();

    List<Student> fromwhere2(String add,String sex);

    List<Student> maxagename();

    List<Student> agebigerzs(String name);

    List<Student> ageadd();

    List<Student> snbn();

    List<sc> selecttttt(@Param("grade") String grade,@Param("sno") String sno);

    List<sc> twocou(@Param("cno1") String cno1, @Param("cno2") String cno2);

    List<sc> t1f2(@Param("sno1") String sno1, @Param("sno2") String sno2);

    List<sc> cnogradeb60();

    List<sc> ba60();

    List<sc> b();
}
