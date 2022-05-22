/*
        Nama : Kiki Mulyadi
        NIM : 10119191
        Kelas : IF-5
        Tanggal pengerjaan : 20 Mei 2022
*/
package com.example.a10119191_uts_myselfapp.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.a10119191_uts_myselfapp.R;

public class Fragment3 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup)inflater
                .inflate(R.layout.page3,container
                        , false);

        return rootView;
    }
}
