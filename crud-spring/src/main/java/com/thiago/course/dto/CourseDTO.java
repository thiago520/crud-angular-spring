package com.thiago.course.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Used as response object that represents a Course
 */
public record CourseDTO(
        @JsonProperty("_id") Long id,
        String name, String category, List<LessonDTO> lessons) {
}
