/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10116413.latihan46.tandanyakamu;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 * NAMA         : HARRY APRIADI
 * KELAS        : PBOULANG
 * NIM          : 10116413
 * DESKRIPSI    : program ini menampilkan siapa kamu * 
 */
public class PboUlang10116413Latihan46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);

        Age objAge = new Age(2019);
        System.out.print("Masukan tahun Lahir Anda : ");
        objAge.setYearBirth(scan.nextInt());
        System.out.println("");

        System.out.println("====Hasil Perhitungan Umur====");
        System.out.println("Tahun Lahir Anda " + objAge.getYearBirth());
        System.out.println("Hari ini Tahun : " + objAge.getYearNow());
        System.out.println("Umur kamu sampai saat ini adalah "
                + objAge.hitungUmur() + " tahun ");
        System.out.println("Tandanya Kamu "
                + objAge.tandanyaKamu(objAge.hitungUmur()));
    }

}
