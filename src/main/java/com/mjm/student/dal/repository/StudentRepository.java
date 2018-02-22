package com.mjm.student.dal.repository;

import com.mjm.student.dal.entities.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
