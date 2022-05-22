/*
        Nama : Kiki Mulyadi
        NIM : 10119191
        Kelas : IF-5
        Tanggal pengerjaan : 20 Mei 2022
*/
package com.example.a10119191_uts_myselfapp.dailyactivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a10119191_uts_myselfapp.R;

import java.util.ArrayList;

public class Daily_Adapter extends RecyclerView.Adapter<Daily_Adapter.ListViewHolder> {
    private ArrayList<Daily> dailyList;

    public Daily_Adapter(ArrayList<Daily> list) {this.dailyList = list; }

    @NonNull
    @Override
    public Daily_Adapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.daily_item, parent, false);
        return new Daily_Adapter.ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Daily_Adapter.ListViewHolder holder, int position) {
        Daily daily = dailyList.get(position);
        holder.kegiatan.setText(daily.getKegiatan());

    }

    @Override
    public int getItemCount() { return dailyList.size(); }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        TextView kegiatan;

        ListViewHolder(View itemview) {
            super(itemview);
            kegiatan = itemview.findViewById(R.id.kegiatan);
        }
    }
}
