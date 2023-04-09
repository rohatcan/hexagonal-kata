package com.rohat.hexagonalkata.infra.adapters.rick.graphql

import com.expediagroup.graphql.client.spring.GraphQLWebClient
import com.rick.graphql.GetEpisodes
import com.rohat.hexagonalkata.domain.movie.model.Episode
import com.rohat.hexagonalkata.domain.movie.port.MoviePort
import kotlinx.coroutines.runBlocking

class RickGraphqlAdapter : MoviePort {

    fun test(){
        val client = GraphQLWebClient(url = "https://rickandmortyapi.graphcdn.app")
        runBlocking {
            client.execute(GetEpisodes(GetEpisodes.Variables(page = 0, filter = null)))
        }

    }

    override fun getEpisode(): Episode {
        TODO("Not yet implemented")
    }
}