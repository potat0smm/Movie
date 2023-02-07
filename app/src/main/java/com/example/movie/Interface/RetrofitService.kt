package com.example.movie.Interface

import com.example.movie.Model.Movie
import retrofit2.Call
import retrofit2.http.GET

interface RetrofitService {

    @GET("marvel")
    fun getMovieList(): Call<MutableList<Movie>>

}