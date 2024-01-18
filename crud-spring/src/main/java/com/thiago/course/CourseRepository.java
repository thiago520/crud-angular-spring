package com.thiago.course;

import com.thiago.course.enums.Status;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {

    Page<Course> findByStatus(Pageable pageable, Status status);

    List<Course> findByName(String name);
}
