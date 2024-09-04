package com.klef.jfsd.sdp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.sdp.model.Admin;
import com.klef.jfsd.sdp.model.Course;
import com.klef.jfsd.sdp.model.Faculty;
import com.klef.jfsd.sdp.model.Student;
import com.klef.jfsd.sdp.repository.AdminRepository;
import com.klef.jfsd.sdp.repository.CourseRepository;
import com.klef.jfsd.sdp.repository.FacultyRepository;
import com.klef.jfsd.sdp.repository.StudentRepository;

@Service
public class AdminServiceImpl implements AdminService 
{
	
	@Autowired
	FacultyRepository facultyRepository;
	
	@Autowired
	CourseRepository courseRepository;
	
	@Autowired
	StudentRepository studentRepository;
	@Autowired
	AdminRepository adminRepository;

	@Override
	public String addFaculty(Faculty f) {
		facultyRepository.save(f);
		return "Faculty Addedd Successfully ...";
	}

	@Override
	public String addCourse(Course c) {
		courseRepository.save(c);
		return "Course Added Successfully";
	}

	@Override
	public List<Course> viewAllCourses() {
		
		return courseRepository.findAll();
	}

	@Override
	public String addStudent(Student st) {
		studentRepository.save(st);
		return "Student Added Successfully";
	}

	@Override
	public List<Faculty> viewAllFaculty() {
		
		return facultyRepository.findAll();
	}

	@Override
	public List<Student> viewAllStudents() {
		
		return studentRepository.findAll();
	}

	@Override
	public Admin adminLogin(String ausername, String apassword) {
		
		return adminRepository.adminLogin(ausername, apassword);
	}

	@Override
	public Admin checkAdminUsername(String username) {
		
		return adminRepository.checkAdminUsername(username);
	}

}
