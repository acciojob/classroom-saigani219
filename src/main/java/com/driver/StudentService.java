package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	public void addStudent(Student student){

		studentRepository.addStudentToDb(student);
	}

	public void addTeacher(Teacher teacher){
		studentRepository.addTeacherToDb(teacher);
	}

	public void deleteAllTeachers() {
		studentRepository.deleteAllTeachers();
	}

	public void deleteTeacherByName(String teacher) {
		studentRepository.deleteTeacherByName(teacher);
	}

	public void addStudentTeacherPair(String teacher, String student) {
		studentRepository.addStudentTeacherPair(teacher, student);
	}

	public Student getStudentByName(String name) {

		return studentRepository.getStudentByName(name);
	}

	public List<String> getAllStudents() {
		return studentRepository.getAllStudents();
	}

	public Teacher getTeacherByName(String name) {
		return studentRepository.getTeacherByName(name);
	}

	public List<String> getStudentsByTeacherName(String teacher) {
		return studentRepository.getStudentsByTeacherName(teacher);
	}
}
