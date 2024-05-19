

import java.util.LinkedList;


public class Tugas1 {

    public static void main(String[] args) {
        System.out.println("Nama: MUHAMMAD ALWI AZIZ");
        System.out.println("NIM: 049634497");

        ///Soal no 1
        // int jumlahBaris;
        // jumlahBaris = 5;
        // System.out.println("Jumlah Baris: " + jumlahBaris);

        ///Soal no 2
        // String kalimatBaru = "Deklarasi Tipe data String";
        // System.out.println("Kalimat: " + kalimatBaru);

        ///soal no 3
        // int empatAngka[] = {07, 10,20,23};
        // for (int i = 0; i < empatAngka.length; i++) {
        //     System.out.println("Angka ke-" + i + ": " + empatAngka[i]);
        // }

        String alfabet [][] = new String[3][3];
        alfabet[0][0] = "p";
        alfabet[0][1] = "s";
        alfabet[0][2] = "n";
        alfabet[1][0] = "w";
        alfabet[1][1] = "l";
        alfabet[1][2] = "b";
        alfabet[2][0] = "f";
        alfabet[2][1] = "r";
        alfabet[2][2] = "e";
        
        for(String[] baris : alfabet){
            for(String kolom : baris){
                System.out.print(kolom + " ");
            }
            System.out.println();
        }

        // //soal no 5
        LinkedList<Integer> listAngka = new LinkedList<>();
        listAngka.add(26);
        listAngka.add(8);
        listAngka.add(23);
        listAngka.add(24);
        listAngka.add(16);
        System.out.println("List Angka: " + listAngka);
    }
}
