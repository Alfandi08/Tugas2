package com.tugas2.alfandi;

import java.util.ArrayList;
import java.util.Scanner;

public class DataMahasiswa {
    public static void main(String[] args) {
        ArrayList<String> nama = new ArrayList<>();
        ArrayList<String> Stambuk = new ArrayList<>();
        ArrayList<String> alamat = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nAplikasi Data Mahasiswa");
            System.out.println("==========");

            System.out.println("1.Tambahkan data mahasiswa");
            System.out.println("2.Tampilkan  data mahasiswa");
            System.out.println("3.Cari data mahasiswa");
            System.out.println("4.Hapus data mahasiswa");
            System.out.println("5.Keluar");

            System.out.print("\nPilih Menu : ");
            pilih = input.nextInt();

            if (pilih == 1) {
                System.out.print("Masukan nama : ");
                String NAMA = input.next();
                nama.add(NAMA);

                System.out.print("Masukan stambuk : ");
                String STAMBUK = input.next();
                Stambuk.add(STAMBUK);

                System.out.print("Masukan alamat : ");
                String ALAMAT = input.next();
                alamat.add(ALAMAT);
            }
                else if (pilih == 2) {
                System.out.println("\nData Mahasiswa");
                for (int i = 0; i < Stambuk.size(); i++) {
                    System.out.println(1 + 1 +"." + Stambuk.get(i));
                }
                System.out.println("\nPilih Menu (3) utuk melhat data ");

            }
                else if (pilih == 3) {
                System.out.print("Data nomor yang ingin dicari : ");
                int cari = input.nextInt();
                if (cari == 1){
                    System.out.println("\nnama : " + nama.get(0));
                    System.out.println("\nSTAMBUK : " + Stambuk.get(0));
                    System.out.println("\nALAMAT : " + alamat.get(0));
                }
                else if (cari == 2){
                System.out.println("\nnama : " + nama.get(1));
                System.out.println("\nSTAMBUK : " + Stambuk.get(1));
                System.out.println("\nALAMAT : " + alamat.get(1));
            }
                else if (cari == 3){
            System.out.println("\nnama : " + nama.get(2));
            System.out.println("\nSTAMBUK : " + Stambuk.get(2));
            System.out.println("\nALAMAT : " + alamat.get(2));

        }
                else if (cari == 4){
            System.out.println("\nnama : " + nama.get(3));
            System.out.println("\nSTAMBUK : " + Stambuk.get(3));
            System.out.println("\nALAMAT : " + alamat.get(3));

        }
            else if (cari == 5){
            System.out.println("\nnama : "+nama.get(4));
            System.out.println("\nSTAMBUK : "+Stambuk.get(4));
            System.out.println("\nALAMAT : "+alamat.get(4));
    }
    else{
            System.err.println("Data tidak ada!");
            }
            }
                else if (pilih == 4) {
                System.out.println("\ndata Mahasiswa");
                for (int i = 0; i < Stambuk.size(); i++) {
                    System.out.println(i + 1 + "." + Stambuk.get(i));
                }
                System.out.print("\nMasukan Stambuk untuk menghapus data : ");
                String STAMBUK = input.next();
                Stambuk.remove(STAMBUK);
            }
                else  if (pilih == 5){
                    System.out.println("Thanks");
            }
                else {
                    System.out.println("Menu Tidak tersedia");
            }
        } while (pilih != 5);
    }
}
