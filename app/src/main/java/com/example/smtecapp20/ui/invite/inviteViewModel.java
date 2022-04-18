package com.example.smtecapp20.ui.invite;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class inviteViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public inviteViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Invite your friends...");
    }

    public LiveData<String> getText() {
        return mText;
    }
}














