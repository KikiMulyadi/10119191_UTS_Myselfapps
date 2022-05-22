/*
        Nama : Kiki Mulyadi
        NIM : 10119191
        Kelas : IF-5
        Tanggal pengerjaan : 20 Mei 2022
*/
package com.example.a10119191_uts_myselfapp.gallery;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a10119191_uts_myselfapp.R;
import com.makeramen.roundedimageview.RoundedImageView;

import java.util.List;

public class Gallery_Adapter extends RecyclerView.Adapter<Gallery_Adapter.GalleryViewHolder> {

    private List<Gallery_Item> gallery_items;

    public Gallery_Adapter(List<Gallery_Item> gallery_items) {this.gallery_items = gallery_items; }

    @NonNull
    @Override
    public Gallery_Adapter.GalleryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new GalleryViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.gallery_item, parent, false)
        );
    }

    @Override
    public void onBindViewHolder(@NonNull Gallery_Adapter.GalleryViewHolder holder, int position) {
        holder.setPostImage(gallery_items.get(position));
    }

    @Override
    public int getItemCount() { return gallery_items.size(); }

    public class GalleryViewHolder extends RecyclerView.ViewHolder {
        RoundedImageView imageView;

        public GalleryViewHolder(@NonNull View ItemView) {
            super(ItemView);
            imageView = ItemView.findViewById(R.id.gallery_item_layout);
        }

        public void setPostImage(Gallery_Item gallery_item) {
            imageView.setImageResource(gallery_item.getImage());
        }
    }
}
