package com.example.intern_anrdoid_2020;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.intern_anrdoid_2020.response.QiitaArticleResponse;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class QiitaListRepository {
    private static final String LOG_TAG = QiitaListRepository.class.getSimpleName();

    public static LiveData<ArrayList<QiitaArticleResponse>> listArticle(int page, int per_page, String query) {
        MutableLiveData<ArrayList<QiitaArticleResponse>> data = new MutableLiveData<ArrayList<QiitaArticleResponse>>();

        QiitaService qiitaService = HttpClient.getQiitaService();

        qiitaService.getQiitaArticle(page, per_page, query).enqueue(new Callback<ArrayList<QiitaArticleResponse>>() {
            @Override
            public void onResponse(Call<ArrayList<QiitaArticleResponse>> call, Response<ArrayList<QiitaArticleResponse>> response) {
                if (response.isSuccessful()) {
                    data.postValue(response.body());
                } else {
                    data.postValue(null);
                }
            }

            @Override
            public void onFailure(Call<ArrayList<QiitaArticleResponse>> call, Throwable t) {
                data.postValue(null);
                Log.e(LOG_TAG, "API連携に失敗:" + t.getMessage());
            }
        });
        return data;
    }
}
