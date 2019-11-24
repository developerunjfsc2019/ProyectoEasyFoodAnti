package com.proyecto.easyfood.ui.reglamentointerno;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.proyecto.easyfood.R;

public class ReglamentoInternoFragment extends Fragment {

    private ReglamentoInternoViewModel reglamentoInternoViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        reglamentoInternoViewModel =
                ViewModelProviders.of(this).get(ReglamentoInternoViewModel.class);
        View root = inflater.inflate(R.layout.fragment_reglamentointerno, container, false);
        final TextView textView = root.findViewById(R.id.text_reglamentointerno);
        reglamentoInternoViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}