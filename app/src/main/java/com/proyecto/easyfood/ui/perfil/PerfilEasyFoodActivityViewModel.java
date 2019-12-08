package com.proyecto.easyfood.ui.perfil;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PerfilEasyFoodActivityViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PerfilEasyFoodActivityViewModel() {

    }

    public LiveData<String> getText() {
        return mText;
    }
}