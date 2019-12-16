package br.com.zup.OnboardingZup.ui;

import android.app.Application;
import android.text.LoginFilter;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import br.com.zup.OnboardingZup.model.UserRepository;
import br.com.zup.OnboardingZup.response.Repositories.UserResponse;

public class UserVIewModel extends AndroidViewModel {

    private UserRepository mUserRepository;
    private LiveData<UserResponse> mUserResponseLiveData;

    public UserVIewModel (@NonNull Application application){
        super(application);
            mUserRepository = new UserRepository();
            this.mUserResponseLiveData = mUserRepository.getUserRepository("","","","","",);

    }

}
