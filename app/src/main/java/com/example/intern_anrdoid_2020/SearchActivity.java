package com.example.intern_anrdoid_2020;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class SearchActivity extends AppCompatActivity {

    public static Intent createIntent(Context context) {
        return new Intent(context, SearchActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        showsSearchFragment();
        setupBottomNavigation();
    }

    private void showsSearchFragment() {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.search_layout_frame, new SearchFragment())
                           .addToBackStack(null)
                           .commit();

    }

    private void setupBottomNavigation() {
        BottomNavigationView bottomNavigationView = findViewById(R.id.navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener((@NonNull MenuItem item) -> {
            item.setChecked(true);
            switch (item.getItemId()) {
                case R.id.nav_list:
                    showsSearchFragment();
                    return true;
            }
            return false;
        });
    }
}
