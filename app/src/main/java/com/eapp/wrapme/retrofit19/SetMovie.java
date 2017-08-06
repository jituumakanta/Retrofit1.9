package com.eapp.wrapme.retrofit19;

import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

/**
 * Created by jitu on 8/6/2017.
 */

public interface SetMovie {
    /**
     *
     * @param callback
     * @param movie_name
     * @param movie_link
     */
    @FormUrlEncoded
    @POST("/movie/set_movie.php")
    public void insertData(@Field("movie_name") String movie_name, @Field("movie_link") String movie_link,Callback<Response> callback);

}
