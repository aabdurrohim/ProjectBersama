package com.company;

public class MenuPerpustakaan {
    public void pinjamBuku(String pinjam, int counter){
        if (counter == 0){
            System.out.println("Anda akan meminjam buku "+pinjam);
        }
        else{
            System.out.println("Anda tidak dapat meminjam lebih dari 1 buku sekaligus");
        }
    }
    public String[] ListBuku() {
        String[] ListBuku = {"1. Bumi Manusia", "2. Anak Semua Bangsa", "3. Jejak langkah", "4. Rumah Kaca"};
        return ListBuku;
    }
    public void kembaliBuku(String pinjam, int counter){
        if (counter == 0){
            System.out.println("Anda tidak sedang meminjam buku apapun");
        }else{
            System.out.println("Anda mengembalikan buku "+pinjam);
        }
    }
}
