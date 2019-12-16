package br.com.zup.OnboardingZup.ui.view;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.request.target.ThumbnailImageViewTarget;

import java.util.List;

import br.com.zup.OnboardingZup.response.UserResults;

public class ContentAdapater extends RecyclerView.Adapter<ContentAdapater.ContentHolder> {

    private List<UserResults> userResults;

    public ContentAdapater(List<UserResults> UserResults)(this.UserResults = UserResults;)
}
