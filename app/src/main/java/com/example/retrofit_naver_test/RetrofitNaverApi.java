package com.example.retrofit_naver_test;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RetrofitNaverApi {

    @GET("v1/search/book.json")
    Call<String> getSearchResult(
            @Header("X-Naver-Client-Id") String id,
            @Header("X-Naver-Client-Secret") String pw,
            @Query("query") String query,
            @Query("display") int display,
            @Query("start") int start

    );
}
