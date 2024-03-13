package com.advpro.profiling.tutorial.repository;

import com.advpro.profiling.tutorial.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * @author muhammad.khadafi
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query(value = "SELECT STRING_AGG(name, ', ') AS concatenated_names FROM students", nativeQuery = true)
    String getConcatenatedNames();

    @Query(value= "SELECT * FROM students ORDER BY gpa DESC LIMIT 1", nativeQuery = true)
    Student findTopByOrderByGpaDesc();
}