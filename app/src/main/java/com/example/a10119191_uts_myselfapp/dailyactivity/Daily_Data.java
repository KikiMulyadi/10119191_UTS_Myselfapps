/*
        Nama : Kiki Mulyadi
        NIM : 10119191
        Kelas : IF-5
        Tanggal pengerjaan : 20 Mei 2022
*/
package com.example.a10119191_uts_myselfapp.dailyactivity;

import java.util.ArrayList;

public class Daily_Data {
    private static String[] data_kegiatan = {
            "Bangun Tidur",
            "Mandi",
            "Makan",
            "Kuliah",
            "Main Game",
            "Makan Malam",
            "Tidur"
    };

    public static ArrayList<Daily> getListData() {
        ArrayList<Daily> list = new ArrayList<>();
        for (int position = 0; position < data_kegiatan.length; position++) {
            Daily daily = new Daily();
            daily.setKegiatan(data_kegiatan[position]);
            list.add(daily);
        }
        return list;
    }
}
