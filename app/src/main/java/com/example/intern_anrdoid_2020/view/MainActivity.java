package com.example.intern_anrdoid_2020.view;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.intern_anrdoid_2020.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showLoginFragment();

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(R.string.login_view);
    }

    private void showLoginFragment() {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_layout_frame, new LoginFragment())
                           .addToBackStack(null)
                           .commit();
    }
}
