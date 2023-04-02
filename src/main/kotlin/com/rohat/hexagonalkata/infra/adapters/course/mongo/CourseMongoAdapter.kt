package com.rohat.hexagonalkata.infra.adapters.course.mongo

import com.rohat.hexagonalkata.domain.course.port.CoursePersistancePort
import com.rohat.hexagonalkata.infra.adapters.course.mongo.repository.CourseMongoRepository

class CourseMongoAdapter(
    private val courseMongoRepository: CourseMongoRepository,
) : CoursePersistancePort {

}