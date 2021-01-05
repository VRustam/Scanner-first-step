package Ders_3.Tapsiriq;

import java.util.Scanner;

public class Scaner {
    public static void main(String[] args) {
        Scanner axtar = new Scanner(System.in);

        System.out.println("Zehmet olmasa Voen ve parolu daxil edin .");
        System.out.println("Voeni daxil edin .");
        int voen= axtar.nextInt();
        System.out.println("\n");
        System.out.println("Parolu qeyd edin");
        int password = axtar.nextInt();

        if(voen == 2552 && password == 1991){
            System.out.println("Siz ugurla daxil oldunuz");
        }else{
            if(voen != 2552 && password != 1991){
                System.err.println("parol ve sifreniz sehdir");
            }else if(voen != 2552){
                System.err.println("Voen sehvdir");
            }else{
                System.out.println(" Parol sehvdir");
            }
        }

    }
}
