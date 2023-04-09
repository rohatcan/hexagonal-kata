package com.rohat.hexagonalkata.domain.movie.port

import com.rohat.hexagonalkata.domain.movie.model.Episode

interface MoviePort {
    fun getEpisode(): Episode
}