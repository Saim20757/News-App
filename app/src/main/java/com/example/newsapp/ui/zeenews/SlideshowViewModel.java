package com.example.newsapp.ui.zeenews;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SlideshowViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public SlideshowViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Zee news" +
                " fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}