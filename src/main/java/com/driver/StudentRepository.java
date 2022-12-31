package com.driver;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class StudentRepository {

	HashMap<String, Student> studentDb = new HashMap<>();

	HashMap<String, Teacher> teacherDb = new HashMap<>();

	HashMap<String, List<String>> teacherStudentDb = new HashMap<>();

	public void addStudentToDb(Student student){
		String studentName = student.getName();
		studentDb.put(studentName, student);
	}

	public void addTeacherToDb(Teacher teacher){
		String teacherName = teacher.getName();
		teacherDb.put(teacherName, teacher);
	}

	public void addStudentTeacherPair(String teacherName, String studentName) {
		if (!teacherStudentDb.containsKey(teacherName)) {
			List<String> studentList = new ArrayList<>();
			teacherStudentDb.put(teacherName, studentList);
		}
		teacherStudentDb.get(teacherName).add(studentName);
	}

	public Student getStudentByName(String studentName){
			if(studentDb.containsKey(studentName))
				return studentDb.get(studentName);
			return null;
	}

	public Teacher getTeacherByName(String teacherName){
			if (teacherDb.containsKey(teacherName))
				return teacherDb.get(teacherName);
		return null;
	}

	public List<String> getStudentsByTeacherName(String teacherName){
			return teacherStudentDb.get(teacherName);
	}

	public List<String> getAllStudents(){
		List<String> allStudents = new ArrayList<>();

		for(String names : studentDb.keySet()){
			allStudents.add(names);
		}
		return allStudents;
	}

	public void deleteTeacherByName(String teacherName){
		teacherStudentDb.remove(teacherName);
	}

	public void deleteAllTeachers(){

		for(String records : teacherStudentDb.keySet()){
			teacherStudentDb.remove(records);
		}
	}
}
