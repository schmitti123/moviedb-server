package de.schmitti.moviedb

import org.springframework.web.bind.annotation.*

@RestController()
@RequestMapping("/api/movies")
class MovieController(val repository: MovieRepository) {

    @GetMapping("")
    fun findAll() = repository.findAll()

    @GetMapping("/{id}")
    fun findByName(@PathVariable id: String) = repository.findById(id)

    @PostMapping("")
    fun create(@RequestBody movie: Movie) = repository.save(movie)

    @PutMapping("/{id}")
    fun edit(@RequestBody movie: Movie) = repository.save(movie)

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: String) = repository.delete(id)


}