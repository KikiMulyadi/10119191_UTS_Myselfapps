/*
        Nama : Kiki Mulyadi
        NIM : 10119191
        Kelas : IF-5
        Tanggal pengerjaan : 20 Mei 2022
*/
package com.example.a10119191_uts_myselfapp.music;

import java.util.ArrayList;

public class Music_Data {
    private static String[] data_musik = {
            "Rosemary - Super Girl",
            "Tipe-x - Genit",
            "Souljah - Tak Selalu",
            "Peterpen - Mimpi Yang Sempurna",
            "Utopia - Hujan"
    };

    public static ArrayList<Music_Item> getListData() {
        ArrayList<Music_Item> list = new ArrayList<>();
        for (int position = 0; position <data_musik.length; position++) {
            Music_Item mi = new Music_Item();
            mi.setMusicList(data_musik[position]);
            list.add(mi);
        }
        return list;
    }
}
