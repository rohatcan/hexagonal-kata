package com.rohat.hexagonalkata.infra.adapters.course.mongo.repository

import com.rohat.hexagonalkata.infra.adapters.course.mongo.entity.CourseEntity
import org.springframework.data.mongodb.repository.MongoRepository

interface CourseMongoRepository : MongoRepository<CourseEntity, String>{
}