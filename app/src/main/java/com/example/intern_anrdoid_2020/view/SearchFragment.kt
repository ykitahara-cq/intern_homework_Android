package com.example.intern_anrdoid_2020.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.example.intern_anrdoid_2020.R
import com.example.intern_anrdoid_2020.model.response.QiitaArticleResponse
import java.util.*

class SearchFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val actionBar = (activity as AppCompatActivity?)!!.supportActionBar
        actionBar!!.setTitle(R.string.search_view)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val v = inflater.inflate(R.layout.fragment_search, container, false)
        return setup(v)
    }

    private fun setup(v: View): View {
        val searchButton = v.findViewById<View>(R.id.search_button) as Button
        searchButton.setOnClickListener { view: View? ->
            val searchkay = getView()!!.findViewById<EditText>(R.id.edit_search).text.toString()
            QiitaListRepository.listArticle(PAGE, PER_PAGE, searchkay).observe(viewLifecycleOwner, Observer { qiitaListResponse: ArrayList<QiitaArticleResponse?>? ->
                qiitaListResponse?.let { showQiitaListFragment(it) }
            })
        }
        return v
    }

    private fun showQiitaListFragment(qiitaArticleResponse: ArrayList<QiitaArticleResponse?>) {
        val fragmentTransaction = fragmentManager!!.beginTransaction()
        fragmentTransaction.replace(R.id.search_layout_frame, QiitaListFragment.Companion.newInstance(qiitaArticleResponse))
                .addToBackStack(null)
                .commit()
    }

    companion object {
        private const val PAGE = 1
        private const val PER_PAGE = 10
    }
}
