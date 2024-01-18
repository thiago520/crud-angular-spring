package com.thiago.course.dto;

import com.thiago.course.enums.Category;
import com.thiago.shared.validation.ValueOfEnum;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import java.util.List;

/**
 * Used as request object that represents a Course.
 */
public record CourseRequestDTO(
        @NotBlank @NotNull @Length(min = 5, max = 200) String name,
        @NotBlank @NotNull @ValueOfEnum(enumClass = Category.class) String category,
        @NotNull @NotEmpty @Valid List<LessonDTO> lessons) {
}
