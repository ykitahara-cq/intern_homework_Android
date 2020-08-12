package com.example.intern_anrdoid_2020.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.intern_anrdoid_2020.R
import com.example.intern_anrdoid_2020.model.response.QiitaArticleResponse
import java.util.*

class QiitaListFragment : Fragment() {
    private var qiitaArticles: ArrayList<QiitaArticleResponse>? = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null) {
            qiitaArticles = arguments!!.getSerializable(QIITA_ARTICLES) as ArrayList<QiitaArticleResponse>?
        }
        val actionBar = (activity as AppCompatActivity?)!!.supportActionBar
        actionBar!!.setTitle(R.string.Article_view)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_qiita_list, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        val recyclerView: RecyclerView = view!!.findViewById(R.id.rv_menu)
        val layoutManager = LinearLayoutManager(view!!.context)
        recyclerView.layoutManager = layoutManager
        val adapter = QiitaListViewAdapter(qiitaArticles)
        recyclerView.adapter = adapter
        val decorator = DividerItemDecoration(context, layoutManager.orientation)
        recyclerView.addItemDecoration(decorator)
//        adapter.setOnClickItemListener { qiitaArticles: QiitaArticleResponse ->
//            startActivity(WebViewActivity.Companion.createIntent(view!!.context, qiitaArticles.url)) }
    }

    companion object {
        private const val QIITA_ARTICLES = "qiitaArticles"
        fun newInstance(response: ArrayList<QiitaArticleResponse?>?): QiitaListFragment {
            val fragment = QiitaListFragment()
            val args = Bundle()
            args.putSerializable(QIITA_ARTICLES, response)
            fragment.arguments = args
            return fragment
        }
    }
}
