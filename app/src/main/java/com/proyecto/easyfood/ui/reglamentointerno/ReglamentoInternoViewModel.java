package com.proyecto.easyfood.ui.reglamentointerno;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ReglamentoInternoViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ReglamentoInternoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Reglamento Interno");
    }

    public LiveData<String> getText() {
        return mText;
    }
}