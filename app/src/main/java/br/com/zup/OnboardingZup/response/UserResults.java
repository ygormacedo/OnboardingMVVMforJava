package br.com.zup.OnboardingZup.response;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class UserResults implements Parcelable {

    @SerializedName("userName")
    private String userName;
    @SerializedName("userEmail")
    private Double userEmail;
    @SerializedName("userPod")
    private String userPod;
    @SerializedName("userProject")
    private String userProject;
    @SerializedName("userLocation")
    private String userLocation;

    public UserResults() {
    }

    public UserResults(String userName, Double userEmail, String pod, String project, String userLocation) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPod = pod;
        this.userProject = project;
        this.userLocation = userLocation;
    }

    protected UserResults(Parcel in) {
        userName = in.readString();
        userPod = in.readString();
        userProject = in.readString();
        userName = in.readString();
        userLocation = in.readString();

    }

    public static final Creator<UserResults> CREATOR = new Creator<UserResults>() {
        @Override
        public UserResults createFromParcel(Parcel in) {
            return new UserResults(in);
        }

        @Override
        public UserResults[] newArray(int size) {
            return new UserResults[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeString(userName);
        dest.writeString(userPod);
        dest.writeString(userProject);
        dest.writeString(userLocation);
        dest.writeString(String.valueOf(userEmail));

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Double getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(Double userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPod() {
        return userPod;
    }

    public void setUserPod(String userPod) {
        this.userPod = userPod;
    }

    public String getUserProject() {
        return userProject;
    }

    public void setUserProject(String userProject) {
        this.userProject = userProject;
    }

    public String getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(String userLocation) {
        this.userLocation = userLocation;
    }

    public static Creator<UserResults> getCREATOR() {
        return CREATOR;
    }
}
