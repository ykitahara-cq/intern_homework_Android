package com.example.intern_anrdoid_2020.view;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.intern_anrdoid_2020.R;
import com.example.intern_anrdoid_2020.model.response.QiitaArticleResponse;

import java.util.ArrayList;

public class SearchFragment extends Fragment {

    private static final int PAGE = 1;
    private static final int PER_PAGE = 10;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = ((AppCompatActivity) getActivity()).getSupportActionBar();
        actionBar.setTitle(R.string.search_view);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_search, container, false);
        return setup(v);
    }

    private View setup(View v) {

        Button searchButton = (Button) v.findViewById(R.id.search_button);
        searchButton.setOnClickListener((View view) -> {
            String searchkay = getView().<EditText>findViewById(R.id.edit_search).getText().toString();
            QiitaListRepository.listArticle(PAGE, PER_PAGE, searchkay).observe(getViewLifecycleOwner(), (qiitaListResponse) -> {
                if (qiitaListResponse != null) {
                    showQiitaListFragment(qiitaListResponse);
                }
            });
        });
        return v;
    }

    private void showQiitaListFragment(ArrayList<QiitaArticleResponse> qiitaArticleResponse) {
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.search_layout_frame, QiitaListFragment.newInstance(qiitaArticleResponse))
                           .addToBackStack(null)
                           .commit();
    }
}
