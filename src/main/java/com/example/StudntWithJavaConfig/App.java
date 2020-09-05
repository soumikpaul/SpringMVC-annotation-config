package com.example.StudntWithJavaConfig;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
//	List<Student> l=new ArrayList<Student>(); 

	ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
	ClassRoom clr=context.getBean(ClassRoom.class);
//	Student st1=context.getBean("getStudent",Student.class);
//	Student st2=context.getBean("getStudent1",Student.class);
//	st1.setAge(22);
//	st1.setName("Soumik");
//	st1.setStdId(1);
//	l.add(st1);
//	st2.setAge(10);
//	st2.setName("Paul");
//	st2.setStdId(2);
//	l.add(st2);
	clr.display();

    }
}
