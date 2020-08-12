package com.example.intern_anrdoid_2020.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.intern_anrdoid_2020.R;
import com.example.intern_anrdoid_2020.model.response.QiitaArticleResponse;

import java.util.List;

public class QiitaListViewAdapter extends RecyclerView.Adapter<QiitaListViewAdapter.QiitaListViewHolder> {

    private List<QiitaArticleResponse> listData;

    private OnClickItemListener listener;

    public interface OnClickItemListener {
        void onClickQiitaListData(QiitaArticleResponse item);
    }

    public void setOnClickItemListener(OnClickItemListener listener) {
        this.listener = listener;
    }

    public static class QiitaListViewHolder extends RecyclerView.ViewHolder {

        private ImageView ivQiitaImage;
        private TextView tvQiitaTitle;
        private TextView tvQiitaLgtm;

        private QiitaListViewHolder(View itemView) {
            super(itemView);
            ivQiitaImage = itemView.findViewById(R.id.iv_book_image);
            tvQiitaTitle = itemView.findViewById(R.id.tv_book_title);
            tvQiitaLgtm = itemView.findViewById(R.id.tv_book_price_tax);
        }
    }

    public QiitaListViewAdapter(List<QiitaArticleResponse> qiitaListData) {
        this.listData = qiitaListData;
    }

    @NonNull
    @Override
    public QiitaListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_qiita_list, parent, false);
        return new QiitaListViewHolder(v);
    }

    @Override
    public void onBindViewHolder(QiitaListViewHolder holder, int position) {

        QiitaArticleResponse qiitaArticleResponse = listData.get(position);

        holder.tvQiitaTitle.setText(qiitaArticleResponse.title);
        holder.tvQiitaLgtm.setText(String.valueOf(qiitaArticleResponse.likesCount));
        Glide.with(holder.ivQiitaImage.getContext()).load(qiitaArticleResponse.user.profileImageUrl).into(holder.ivQiitaImage);
        holder.itemView.setOnClickListener((View v) -> {
            if (position == RecyclerView.NO_POSITION) {
                return;
            }
            if (listener != null) {
                listener.onClickQiitaListData(qiitaArticleResponse);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }
}
