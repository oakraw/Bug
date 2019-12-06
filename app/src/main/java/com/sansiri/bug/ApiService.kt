package com.sansiri.bug

import io.reactivex.Observable
import retrofit2.http.GET

interface ApiService {
    @GET("posts")
    fun getPosts(): Observable<Post>
}