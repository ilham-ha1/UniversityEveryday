package com.example.universityeveryday;

import java.util.ArrayList;

public class UniversityData {
    private static String[] universityNames = {
      "IPB","ITB","UDAYANA","UGM","UI","UNDIP","UM","UNNES",
            "UNPAD","UNSRI","UNY","UPI"
    };

    private static String[] universityDetail ={
            "IPB adalah sebuah fakultas pertanian pada Universitas Indonesia. Pada tanggal 1 September 1963",
            "Institut Teknologi Bandung adalah sebuah perguruan tinggi negeri yang berkedudukan di Kota Bandung.",
            "Universitas Udayana (disingkat sebagai Unud) [ butuh rujukan] adalah perguruan tinggi negeri di yang berada di Jimbaran, Kabupaten Badung, Bali, Indonesia",
            "Universitas Gadjah Mada lahir dari kancah perjuangan revolusi kemerdekaan bangsa Indonesia. Didirikan pada periode awal kemerdekaan, UGM didaulat sebagai Balai Nasional Ilmu Pengetahuan dan Kebudayaan bagi penyelenggaraan pendidikan tinggi nasional",
            "Universitas Indonesia disingkat sebagai UI, adalah sebuah perguruan tinggi di Indonesia.Kampus utamanya terletak di bagian Utara dari Depok, Jawa Barat tepat di perbatasan antara Depok dengan wilayah Jakarta Selatan, sementara kampus utama lainnya terdapat di Salemba, Jakarta Pusat.",
            "Universitas Diponegoro disingkat sebagai Undip adalah sebuah perguruan tinggi negeri di Indonesia yang berlokasi di Semarang, Jawa Tengah, Indonesia. ",
            "Universitas Negeri Malang, disingkat UM, merupakan perguruan tinggi negeri yang terletak di Malang dan Blitar, Jawa Timur, Indonesia. Universitas yang didirikan pada tanggal 18 Oktober 1954 ini",
            "Universitas Negeri Semarang adalah salah satu Perguruan Tinggi Negeri di Indonesia yang kini dipimpin Rektor Prof. Dr. Fathur Rokhman, M.Hum. ",
            "Universitas Padjadjaran adalah sebuah perguruan tinggi negeri di Jawa Barat, Indonesia.Kampus utama Unpad, terutama untuk Program Sarjana, berada di Jatinangor, Kabupaten Sumedang, Jawa Barat",
            "Universitas Sriwijaya (disingkat UNSRI) adalah sebuah Perguruan Tinggi Negeri di Sumatra Selatan, Indonesia.",
            "Lembaga Pengembangan dan Penjaminan Mutu Pendidikan Universitas Negeri Yogyakarta (LPPMP UNY) adalah salah satu bagian dari struktur utama di lingkungan Universitas Negeri Yogyakarta. LPPMP UNY berdiri tahun 2011, berdasarkan Peraturan Menteri Pendidikan Nasional Republik Indonesia, Nomor 23 tahun 2011",
            "Universitas Pendidikan Indonesia (UPI) adalah sebuah perguruan tinggi negeri yang kampus utamanya berkedudukan di Kota Bandung, Jawa Barat, Indonesia."
    };

    private static int[] universityImages = {
        R.drawable.ipb,
            R.drawable.itb,
            R.drawable.udayana,
            R.drawable.ugm,
            R.drawable.ui,
            R.drawable.undip,
            R.drawable.um,
            R.drawable.unnes,
            R.drawable.unpad,
            R.drawable.unsri,
            R.drawable.uny,
            R.drawable.upi
    };

    static ArrayList<University> getListData(){
        ArrayList<University> list = new ArrayList<>();
        for (int position = 0; position< universityNames.length; position++){
            University university = new University();
            university.setName(universityNames[position]);
            university.setDetail(universityDetail[position]);
            university.setPhoto(universityImages[position]);
            list.add(university);
        }
        return list;
    }

}
