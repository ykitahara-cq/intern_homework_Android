package com.example.intern_anrdoid_2020;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.intern_anrdoid_2020.response.QiitaArticleResponse;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link QiitaListFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class QiitaListFragment extends Fragment {
    private static final String ARG_PARAM1 = "qiitaArticles";

    private List<QiitaArticleResponse> qiitaArticles = new ArrayList<>();


    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param response qiitaArticle.
     * @return A new instance of fragment QiitaListFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static QiitaListFragment newInstance(ArrayList<QiitaArticleResponse> response) {
        QiitaListFragment fragment = new QiitaListFragment();
        Bundle args = new Bundle();
        args.putSerializable(ARG_PARAM1, response);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            qiitaArticles = (List<QiitaArticleResponse>) getArguments().getSerializable(ARG_PARAM1);
        }
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

    }
}
