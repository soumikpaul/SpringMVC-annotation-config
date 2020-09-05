package com.example.StudntWithJavaConfig;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ClassRoom {
//	List<Student> l=new ArrayList<Student>();
	@Autowired
	@Qualifier("getStudent")
	public Student student1;
	
	@Autowired
	@Qualifier("getStudent1")
	public Student student2;
//	l.add(student1);
//	l.
//	
	
	public void display()
	{
//		for(int i=0;i<s.size();i++)
//			System.out.println(s.get(i).toString());
		System.out.println(student1.toString());
		System.out.println(student2.toString());

	}

}
