/*
        Nama : Kiki Mulyadi
        NIM : 10119191
        Kelas : IF-5
        Tanggal pengerjaan : 20 Mei 2022
*/
package com.example.a10119191_uts_myselfapp.dailyactivity;

import com.example.a10119191_uts_myselfapp.R;

import java.util.ArrayList;

public class Friends_Data {
    private static String[] data_nama = {
            "Fikri Akbari Karim",
            "Albee AKbar FIllah",
            "Reza Kurnia",
            "Fajar Pirman Sutisna",
            "Yazid Iskandar"
    };


    private static int[] data_img = {
            R.drawable.fikri,
            R.drawable.albe,
            R.drawable.reza,
            R.drawable.fajarp,
            R.drawable.yazid
    };

    public static ArrayList<Friends> getListData() {
        ArrayList<Friends> list = new ArrayList<>();
        for (int position = 0; position<data_nama.length; position++) {
            Friends friends = new Friends();
            friends.setNama(data_nama[position]);
            friends.setFoto(data_img[position]);
            list.add(friends);
        }
        return list;
    }
}
