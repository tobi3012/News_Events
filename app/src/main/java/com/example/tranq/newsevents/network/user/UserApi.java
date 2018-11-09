package com.example.tranq.newsevents.network.user;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface UserApi {
    @FormUrlEncoded
    @POST("doRegister")
    Call<ResponseBody> createUser(
      @Field("name") String fullName,
      @Field("email") String email,
      @Field("password") String password
    );
}
