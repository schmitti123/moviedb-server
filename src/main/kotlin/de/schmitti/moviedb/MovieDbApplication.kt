package de.schmitti.moviedb

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * Created by mschmitt on 03.09.17.
 */
@SpringBootApplication
open class MovieDbApplication {

}

fun main(args: Array<String>) {
    SpringApplication.run(MovieDbApplication::class.java, *args)
}