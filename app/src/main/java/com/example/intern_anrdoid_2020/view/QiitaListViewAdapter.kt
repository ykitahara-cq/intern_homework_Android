package com.example.intern_anrdoid_2020.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.intern_anrdoid_2020.R
import com.example.intern_anrdoid_2020.model.response.QiitaArticleResponse
import com.example.intern_anrdoid_2020.view.QiitaListViewAdapter.QiitaListViewHolder

class QiitaListViewAdapter(private val listData: List<QiitaArticleResponse>?) : RecyclerView.Adapter<QiitaListViewHolder>() {

    lateinit var listener: OnItemClickListener

    interface OnItemClickListener {
        fun onItemClickListener(item: QiitaArticleResponse)
    }

        fun setOnItemClickListener(listener: OnItemClickListener) {
        this.listener = listener
    }

    class QiitaListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ivQiitaImage: ImageView
        val tvQiitaTitle: TextView
        val tvQiitaLgtm: TextView

        init {
            ivQiitaImage = itemView.findViewById(R.id.iv_book_image)
            tvQiitaTitle = itemView.findViewById(R.id.tv_book_title)
            tvQiitaLgtm = itemView.findViewById(R.id.tv_book_price_tax)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QiitaListViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.row_qiita_list, parent, false)
        return QiitaListViewHolder(v)
    }

    override fun onBindViewHolder(holder: QiitaListViewHolder, position: Int) {
        val qiitaArticleResponse = listData!![position]
        holder.tvQiitaTitle.text = qiitaArticleResponse.title
        holder.tvQiitaLgtm.text = qiitaArticleResponse.likesCount.toString()
        Glide.with(holder.ivQiitaImage.context).load(qiitaArticleResponse.user?.profileImageUrl).into(holder.ivQiitaImage)
        holder.itemView.setOnClickListener { v: View? ->
            if (position == RecyclerView.NO_POSITION) {
                return@setOnClickListener
            }
            if (listener != null) {
                listener!!.onItemClickListener(qiitaArticleResponse)
            }
        }
    }

    override fun getItemCount(): Int {
        return listData!!.size
    }

}
