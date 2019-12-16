package br.com.zup.OnboardingZup.response;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface Service {

        @POST("/zupper")
        Call<UserResults> getUserResults(@Query("userName")String userName, @Query("userEmail")String userEmail,
                                         @Query("userPod")String userPod, @Query("userProject")String userProject, @Query("userLocation") String userLocation);
}
