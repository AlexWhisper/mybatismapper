package com.alex.test;

import com.alex.mapper.StudentMapper;
import com.alex.pojo.Student;
import com.alex.pojo.sc;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) throws IOException {
        String resource="mybatis-config.xml";
        InputStream in = Resources.getResourceAsStream(resource);
        SqlSessionFactory ssf=new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlsession=ssf.openSession();
        StudentMapper studentMapper=sqlsession.getMapper(StudentMapper.class);
//        Student stu=studentMapper.selectById(2);
        //System.out.println(stu);

//        stu.setName("托塔李天王");
//        studentMapper.inserStu(stu);
//        System.out.println(stu);
//        int n=studentMapper.countAll();
//        System.out.println(n);

//        List<Student> list=studentMapper.findStudent();
//        System.out.println(list);
        int age1=22,age2=32;
//        List<Student> list=studentMapper.betweenage(age1,age2);
//        List<Student> list=studentMapper.selectage(age1);

//        List<Student> list =studentMapper.nophone();
//        List<Student> list =studentMapper.fromage();
//        List<Student> list =studentMapper.agemax();


//        List<Student> list =studentMapper.classavgAge();
//        List<Student> list =studentMapper.fromwhere();
//        List<Student> list1=studentMapper.fromwhere2("翻斗花园","女");
//        List<Student> list1=studentMapper.maxagename();
//        List<Student> list2=studentMapper.agebigerzs("Alex");
//        List<Student> list3=studentMapper.ageadd();
//        List<Student> list =studentMapper.snbn();
//        List<Student> list1=studentMapper.
        //List<sc> list =studentMapper.selecttttt("60","S001");
//        List<sc> list =studentMapper.twocou("c001","c002");
//        List<sc> list = studentMapper.t1f2("s001","s003");
//        List<sc> list=studentMapper.cnogradeb60();
//        List<sc> list=studentMapper.ba60();
        List<sc> list1=studentMapper.b();






            System.out.println(list1);



    }
}
