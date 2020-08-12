package com.example.intern_anrdoid_2020.view;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.example.intern_anrdoid_2020.R;


public class LoginFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_login, container, false);

        return showSearchActivity(v);
    }

    private View showSearchActivity(View v) {

        Button loginButton = (Button) v.findViewById(R.id.login_button);
        loginButton.setOnClickListener((View view) -> {
            startActivity(SearchActivity.createIntent(getView().getContext()));
        });
        return v;
    }
}
