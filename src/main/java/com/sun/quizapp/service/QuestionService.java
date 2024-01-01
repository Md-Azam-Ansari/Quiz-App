package com.sun.quizapp.service;

import java.util.ArrayList;
import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.sun.quizapp.dao.QuestionDAO;
import com.sun.quizapp.model.Question;

@Service
public class QuestionService {

	@Autowired
	QuestionDAO questionDao;
	
	public ResponseEntity<List<Question>> getAllQuestions() {
		
		try {
		return new ResponseEntity<>(questionDao.findAll(), HttpStatus.OK);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
	}

	public ResponseEntity<List<Question>> getQuestionsByCategory(String category) {
		try {
		return new ResponseEntity<>(questionDao.findByCategory(category), HttpStatus.OK);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
	}

	public ResponseEntity<String> addQuestion(Question question) {
		try {
		questionDao.save(question);
		return new ResponseEntity<>("success", HttpStatus.CREATED);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<String>("An error occurred", HttpStatus.BAD_REQUEST);
	}

	public ResponseEntity<String> deleteQuestionById(int id) {
		try {
		Question question = questionDao.findById(id).get();
		questionDao.delete(question);
		return new ResponseEntity<>("success", HttpStatus.CREATED);
		}catch(Exception e) {
			e.printStackTrace();
		}
	return new ResponseEntity<String>("An error occurred", HttpStatus.BAD_REQUEST);
	}
	
	

}
