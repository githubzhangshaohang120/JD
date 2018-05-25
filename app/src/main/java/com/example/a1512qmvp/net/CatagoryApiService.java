package com.example.a1512qmvp.net;

import com.example.a1512qmvp.bean.CatagoryBean;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface CatagoryApiService {
    @GET("product/getCatagory")
    Observable<CatagoryBean> getCatagory();

}
