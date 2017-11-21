package de.schmitti.moviedb

import org.springframework.data.annotation.Id

class Movie constructor()
{
    @Id
    var id: String? = null

    var title: String = ""
    var genre: String = ""
    var imageData: String = ""
    var medium: String = ""

}