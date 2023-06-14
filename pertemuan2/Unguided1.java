package com.Florean_Desvita_Cindirahayu.pbo.pertemuan2;

import java.util.Scanner;
public class Unguided1 {
        public static void main(String[] args) {
            // username dan password yang benar
            String usernameBenar = "Florean";
            String passwordBenar = "Florean123";

            // menerima input username dan password dari pengguna
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();

            // memeriksa apakah username dan password benar
            if (username.equals(usernameBenar) && password.equals(passwordBenar)) {
                System.out.println("Login berhasil silakan masuk");
            } else if (username.isEmpty() || password.isEmpty()) {
                System.out.println("Silakan login dengan username dan password yang sah!");
            } else {
                System.out.println("Username dan password Anda salah");
            }

            // menutup scanner
            scanner.close();
        }
    }

