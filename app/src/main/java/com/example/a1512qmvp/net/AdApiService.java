package com.example.a1512qmvp.net;

import com.example.a1512qmvp.bean.AdBean;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface AdApiService {
   
    @GET("ad/getAd")
    Observable<AdBean> getAd();
}
