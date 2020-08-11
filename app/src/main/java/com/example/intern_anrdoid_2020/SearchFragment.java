package com.example.intern_anrdoid_2020;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.intern_anrdoid_2020.response.QiitaArticleResponse;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SearchFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SearchFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String searchKey;
    private String mParam2;


    public SearchFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param searchKey Parameter 1.
     * @return A new instance of fragment SearchFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SearchFragment newInstance(String searchKey) {
        SearchFragment fragment = new SearchFragment();
        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, searchKey);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_search, container, false);
        return setup(v);
    }

    private View setup(View v) {

        Button searchButton = (Button) v.findViewById(R.id.search_button);
        searchButton.setOnClickListener((View view) -> {
            String searchkay = getView().<EditText>findViewById(R.id.edit_search).getText().toString();
            QiitaListRepository.listArticle(1,5, searchkay).observe(getViewLifecycleOwner(), qiitaListResponse -> {
                // TODO: qiitaListのレスポンス情報を含める
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
