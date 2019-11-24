package com.proyecto.easyfood.ui.informeasistencia;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InformeAsistenciaViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public InformeAsistenciaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Informe de Asistencia");
    }

    public LiveData<String> getText() {
        return mText;
    }
}