package com.umg.apirest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.umg.apirest.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	public ReponseEntity<List<Student>> getAllStudents(){
		return new ResponseEntity<>(studentRepository.findAll(), HttpStatus.OK);
	}
	
	public ResponseEntity<?> getStudent(Long id){
		Optional<Student> student = studentRepository.findById(id);
		if(student.isP)
	}
	
}
