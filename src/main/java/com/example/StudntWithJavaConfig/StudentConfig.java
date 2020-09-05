package com.example.StudntWithJavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.StudntWithJavaConfig.Student;
import com.example.StudntWithJavaConfig.Student.gender;
@Configuration
public class StudentConfig {
	@Bean
	public Student getStudent()
	{
		return new Student("Soumik",22,01,gender.Male);
	}
	@Bean
	public Student getStudent1()
	{
		return new Student("Paul",10,02,gender.Male);
	}
	
	@Bean
	public ClassRoom getClassRoom()
	{
		return new ClassRoom();
	}
	

}
