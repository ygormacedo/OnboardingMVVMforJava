package br.com.zup.OnboardingZup.model;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import br.com.zup.OnboardingZup.response.ApiService;
import br.com.zup.OnboardingZup.response.UserResults;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserRepository {

    public LiveData<UserResults> getUserRepository(String name, String email, String pod, String project, String location){
    final MutableLiveData<UserResults> data = new MutableLiveData<>();

        ApiService.getInstance().getUserResults(name, email,pod, project, location).enqueue(new Callback<UserResults>() {
            @Override
            public void onResponse(Call<UserResults> call, Response<UserResults> response) {
            if (response.isSuccessful()) {
                data.setValue(response.body());
            }
            }

            @Override
            public void onFailure(Call<UserResults> call, Throwable t) {
                data.setValue(null);
            }
        });
        return data;
    }
}
