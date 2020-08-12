package com.example.intern_anrdoid_2020;

import com.example.intern_anrdoid_2020.model.response.QiitaArticleResponse;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface QiitaService {

    @GET("items")
    @Headers("Content-Type: application/json")
    Call<ArrayList<QiitaArticleResponse>> getQiitaArticle(@Query("page") int page,
                                                          @Query("per_page") int per_page,
                                                          @Query("query") String query);
}
