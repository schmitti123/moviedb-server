package de.schmitti.moviedb

import org.springframework.data.mongodb.repository.MongoRepository

interface MovieRepository : MongoRepository<Movie, String> {
    fun findById(id: String): Movie
}