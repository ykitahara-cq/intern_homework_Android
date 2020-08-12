package com.example.intern_anrdoid_2020.view;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.intern_anrdoid_2020.R;
import com.example.intern_anrdoid_2020.model.response.QiitaArticleResponse;

import java.util.ArrayList;


public class QiitaListFragment extends Fragment {
    private static final String QIITA_ARTICLES = "qiitaArticles";

    private ArrayList<QiitaArticleResponse> qiitaArticles = new ArrayList<>();

    public static QiitaListFragment newInstance(ArrayList<QiitaArticleResponse> response) {
        QiitaListFragment fragment = new QiitaListFragment();
        Bundle args = new Bundle();
        args.putSerializable(QIITA_ARTICLES, response);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            qiitaArticles = (ArrayList<QiitaArticleResponse>) getArguments().getSerializable(QIITA_ARTICLES);
        }
        ActionBar actionBar = ((AppCompatActivity) getActivity()).getSupportActionBar();
        actionBar.setTitle(R.string.Article_view);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_qiita_list, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        setupRecyclerView();
    }

    private void setupRecyclerView() {

        RecyclerView recyclerView = getView().findViewById(R.id.rv_menu);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getView().getContext());

        recyclerView.setLayoutManager(layoutManager);

        QiitaListViewAdapter adapter = new QiitaListViewAdapter(qiitaArticles);

        recyclerView.setAdapter(adapter);

        DividerItemDecoration decorator = new DividerItemDecoration(getContext(), layoutManager.getOrientation());
        recyclerView.addItemDecoration(decorator);

        adapter.setOnClickItemListener((qiitaArticles)-> {
            startActivity(WebViewActivity.createIntent(getView().getContext(), qiitaArticles.url));
        });
    }
}
