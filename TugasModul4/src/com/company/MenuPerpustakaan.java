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
}
