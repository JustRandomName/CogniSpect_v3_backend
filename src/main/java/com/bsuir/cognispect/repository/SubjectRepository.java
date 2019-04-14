package com.bsuir.cognispect.repository;

import com.bsuir.cognispect.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;


@Repository
public interface SubjectRepository extends JpaRepository<Subject, UUID> {
    Optional<Subject> findSubjectByName(String subjectName);

    boolean existsByName(String subjectName);
}
