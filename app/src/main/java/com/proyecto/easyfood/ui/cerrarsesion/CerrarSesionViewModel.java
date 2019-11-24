package com.proyecto.easyfood.ui.cerrarsesion;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CerrarSesionViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CerrarSesionViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Rederigir al Lobby");
    }

    public LiveData<String> getText() {
        return mText;
    }
}