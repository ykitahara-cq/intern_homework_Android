package com.example.intern_anrdoid_2020;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class SearchActivity extends AppCompatActivity {

    public static Intent createIntent(Context context) {
        return new Intent(context, SearchActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        showsSearchFragment();
    }

    private void showsSearchFragment() {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.search_layout_frame, new SearchFragment())
                           .addToBackStack(null)
                           .commit();

    }
}
