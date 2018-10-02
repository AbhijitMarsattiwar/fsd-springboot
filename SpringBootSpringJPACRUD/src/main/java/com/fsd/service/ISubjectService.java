package com.fsd.service;

import java.util.List;

import com.fsd.model.Subject;

public interface ISubjectService {

	public void deleteSubject(Subject subject);	
	public Subject searchSubject(long subjectId);
	
	public List<Subject> getAllSubjects();
}
