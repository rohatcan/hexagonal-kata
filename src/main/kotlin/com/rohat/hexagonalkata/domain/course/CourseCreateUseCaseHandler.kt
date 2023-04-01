package com.rohat.hexagonalkata.domain.course

import com.rohat.hexagonalkata.domain.course.port.CoursePort
import com.rohat.hexagonalkata.domain.course.usecase.CreateCourse

class CourseCreateUseCaseHandler(
    private val coursePort: CoursePort,
) {

    fun createCourse(createCourse: CreateCourse) {

    }
}