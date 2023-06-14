package com.Florean_Desvita_Cindirahayu.pbo.pertemuan2;

import java.util.Scanner;
public class Unguided2 {
        public static void main(String[] args) {
            // menerima input nama dari pengguna
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan nama Anda: ");
            String nama = scanner.nextLine();

            // menerima input gaji, tunjangan, dan pajak dari pengguna
            System.out.print("Masukkan gaji Anda: ");
            double gaji = scanner.nextDouble();
            System.out.print("Masukkan tunjangan Anda: ");
            double tunjangan = scanner.nextDouble();
            double pajak = 7.65;

            // menghitung gaji bersih
            double gajiKotor = gaji + tunjangan;
            double pajakNegara = gajiKotor * pajak / 100;
            double gajiBersih = gajiKotor - pajakNegara;

            // mencetak hasil perhitungan gaji bersih
            System.out.println("Gaji yang diterima oleh " + nama + " adalah sebagai berikut:");
            System.out.println("Gaji kotor: " + gajiKotor);
            System.out.println("Pajak negara: " + pajakNegara);
            System.out.println("Gaji bersih: " + gajiBersih);
            System.out.println("Total gaji bersih dari " + nama + " yang diterima yaitu " + gajiBersih);

            // menutup scanner
            scanner.close();
        }
    }

