package com.fsd.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.fsd.model.Subject;
import com.fsd.repository.SubjectRepository;

@Service
@Transactional
public class SubjectServiceImpl implements ISubjectService{

	@Autowired
	SubjectRepository subjectRepository;
	
	public void deleteSubject(Subject subject) {
		subjectRepository.delete(subject);		
	}

	public Subject searchSubject(long subjectId) {
		return subjectRepository.findById(subjectId).get();
	}

	public List<Subject> getAllSubjects() {
		return (List<Subject>) subjectRepository.findAll();
	}

	
}
