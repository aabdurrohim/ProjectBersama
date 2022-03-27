package com.company;
import java.util.Scanner;

public class PeminjamanBukuPerpustakaan {
    static void Menu(){
        System.out.println("Pilih layanan kami");
        String []Menu = {"1. Pinjam Buku", "2. Pengembalian Buku", "3. Buku yang Dipinjam", "4. Keluar"};
        for (int i = 0; i <= 3 ; i++) {
            System.out.println(Menu[i]);
        }
    }
    public static void main(String[] args) {
        MenuPerpustakaan listMenu = new MenuPerpustakaan();
        Scanner input = new Scanner(System.in);
        int pilihBuku = 0, counter = 0, pilihMenu;
        String pinjam = "";
        String[] listBuku = listMenu.ListBuku();
        System.out.println("Peminjaman dan Pengembalian Buku Perpustakaan");
        while (true){
            System.out.println("---------------------");
            Menu();
            System.out.println("---------------------");
            System.out.print("Pilih menu : ");
            pilihMenu = input.nextInt();
            switch (pilihMenu)
                case 1 :
                    System.out.println("---------------------");
                    System.out.println("Daftar Buku");
                    for (int i = 0; i <= 3 ; i++) {
                        System.out.println(listBuku[i]);
                    }
                    System.out.print("Masukkan nomor buku yang ingin dipinjam: ");
                    pilihBuku = input.nextInt();
                    if(pinjam == "") {
                        pinjam = listBuku[pilihBuku - 1];
                    }
                    listMenu.pinjamBuku(pinjam, counter);
                    if(pinjam != "") {
                        counter++;
                    }
                    break;
                case 2 :
                    System.out.println("---------------------");
                    listMenu.kembaliBuku(pinjam, counter);
                    counter = 0;
                    break;
                case 3 :
                    System.out.println("--------------------");
                    System.out.println("Anda sedang meminjam buku "+listMenu.cekPinjam(pinjam, counter));
                    break;
                case 4 :
                    System.exit(0);
                    break;
            }

        }
    }
}

