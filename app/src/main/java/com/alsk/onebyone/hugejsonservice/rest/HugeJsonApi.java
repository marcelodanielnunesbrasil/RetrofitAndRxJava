package com.alsk.onebyone.hugejsonservice.rest;

import io.reactivex.Flowable;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Streaming;

// https://raw.githubusercontent.com/zemirco/sf-city-lots-json/master/citylots.json
public interface HugeJsonApi {

    String SERVICE_ENDPOINT = "https://raw.githubusercontent.com";

    @Streaming
    @GET("/zemirco/sf-city-lots-json/master/citylots.json")
    Flowable<Response<ResponseBody>> get();
}
