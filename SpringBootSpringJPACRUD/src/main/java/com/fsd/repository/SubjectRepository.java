package com.fsd.repository;

import org.springframework.data.repository.CrudRepository;

import com.fsd.model.Subject;

public interface SubjectRepository extends CrudRepository<Subject, Long> {

}