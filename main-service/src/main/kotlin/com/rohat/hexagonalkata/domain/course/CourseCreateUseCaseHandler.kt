package com.rohat.hexagonalkata.domain.course

import com.rohat.hexagonalkata.domain.course.port.CoursePersistancePort
import com.rohat.hexagonalkata.domain.course.usecase.CreateCourse

class CourseCreateUseCaseHandler(
    private val coursePersistancePort: CoursePersistancePort,
) {

    fun createCourse(createCourse: CreateCourse) {

    }
}