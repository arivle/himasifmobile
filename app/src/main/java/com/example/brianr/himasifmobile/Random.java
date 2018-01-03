package com.example.brianr.himasifmobile;

import java.util.ArrayList;

/**
 * Created by Brian R on 03/01/2018.
 */

public class Random {
    int sisa;
    int jumlah;
    int kelompok;
    int setiap;

    public Random(int jumlah, int kelompok, int setiap, int sisa) {
        this.sisa = sisa;
        this.jumlah = jumlah;
        this.kelompok = kelompok;
        this.setiap = setiap;
    }
    public StringBuffer hitung() {
        ArrayList<Integer> a = new ArrayList<>();
        StringBuffer Result = new StringBuffer();
        try {
//            long St = System.nanoTime();

//            writer = new PrintWriter("Hasil.txt", "UTF-8");

            for (int i = 0; i < jumlah; i++) {
                a.add(i + 1);
            }
            int num = 1;
            Result.append("Jumlah Mahasiswa       : " + a.size()+"\n");
            Result.append("Jumlah Kelompok        : " + kelompok+"\n");
            Result.append("Jumlah Setiap Kelompok : " + setiap+"\n");
            Result.append("Sisa Anggota Kelompok  : " + sisa+"\n\n");
//            Result.append("\n------------------------------\n");
            if (sisa > 0) {
                for (int i = num; i <= sisa; i++) {
                    Result.append("Kelompok - " + i + "\n");
                    for (int j = 0; j < setiap + 1; j++) {
                        if (a.isEmpty()) {
                            continue;
                        }
                        int x = (int) (Math.random() * a.size());
                        Result.append(a.get(x) + "\n");
                        a.remove(x);
                    }
                    num = i + 1;
                    Result.append("\n");
                }
            }
            for (int i = num; i <= kelompok; i++) {
                Result.append("Kelompok - " + i + "\n");
                for (int j = 0; j < setiap; j++) {
                    if (a.isEmpty()) {
                        continue;
                    }
                    int x = (int) (Math.random() * a.size());
                    Result.append(a.get(x) + "\n");
                    a.remove(x);
                }
                Result.append("\n");
            }

//            Long Ed = System.nanoTime();
//            Result.append("\n\n------------------------------\n\n");
//            String time = String.format("Time Case : %.3f Seconds \n",(float)(Ed - St) / 1000000000);
//            Result.append(time);
//            Time(St, Ed);

//            writer.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
//        File open = new File("Hasil.txt");
//        System.out.println(Result.toString());

        return Result;
    }
}