package com.company;
import java.util.Scanner;

public class PeminjamanBukuPerpustakaan {
    static void Menu(){
        System.out.println("Pilih layanan kami");
        String []Menu = {"1. Lihat Daftar Buku", "2. Pinjam Buku", "3. Pengembalian Buku", "4. Buku Yang Dipinjam", "5. Keluar"};
        for (int i = 0; i <= 4 ; i++) {
            System.out.println(Menu[i]);
        }
    }
    static void ListBuku(){
        System.out.println("Daftar buku : ");
        String []ListBuku = {"1. Bumi Manusia", "2. Anak Semua Bangsa", "3. Jejak langkah", "4. Rumah Kaca"};
        for (int i = 0; i <= 3 ; i++) {
            System.out.println(ListBuku[i]);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true){
            Menu();
            System.out.print("Pilih menu : ");
            int pilih = input.nextInt();
            switch (pilih){
                case 1 :
                    ListBuku();
                    break;
                case 2 :
                    break;
                case 3 :
                    break;
                case 4 :
                    break;
                case 5 :
                    System.exit(0);
                    break;
            }

        }
    }
}
dsahfjashdkjashkjdha
