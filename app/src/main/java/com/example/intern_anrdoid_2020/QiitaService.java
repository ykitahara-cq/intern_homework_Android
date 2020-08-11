package com.example.intern_anrdoid_2020;

import com.example.intern_anrdoid_2020.response.QiitaArticleResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface QiitaService {

    @GET("/items")
    Call<QiitaArticleResponse> getQiitaArticle(@Query("page") int page, @Query("per_page") int per_page, @Query("query") String query);
}
