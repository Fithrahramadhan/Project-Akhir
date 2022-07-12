package com.wew.moviecatalogues

import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {

    @GET("/3/movie/upcoming?api_key=780e413700e2a82e7653b261a5ea0cc1")
    fun getMovieList(): Call<MovieResponse>
}