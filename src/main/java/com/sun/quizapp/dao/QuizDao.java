package com.sun.quizapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sun.quizapp.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz, Integer> {

}
