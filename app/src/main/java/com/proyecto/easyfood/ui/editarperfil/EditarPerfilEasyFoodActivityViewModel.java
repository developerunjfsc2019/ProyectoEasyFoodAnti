package com.proyecto.easyfood.ui.editarperfil;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EditarPerfilEasyFoodActivityViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public EditarPerfilEasyFoodActivityViewModel() {

    }

    public LiveData<String> getText() {
        return mText;
    }
}