package br.com.zup.OnboardingZup.response.Repositories;

import android.os.Bundle;

import br.com.zup.OnboardingZup.ui.view.HomeActivity;
import retrofit2.http.GET;

public class UserResponse extends Bundle {

    @GET
    HomeActivity.ExtraData()
}
