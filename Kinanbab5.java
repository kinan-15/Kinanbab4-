/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kinanbab5;

/**
 *
 * @author PC 32 - LAB R1
 */
public class Kinanbab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int sebelum = 20;
        int sesudah = ++sebelum;
        System.out.println("Sebelum Increment : 20");
        System.out.println("Sesudah Increment : " + sesudah);

        System.out.println();

        // Decrement
        sebelum = 9;
        sesudah = --sebelum;
        System.out.println("Sebelum Decrement : 9");
        System.out.println("Sesudah Decrement : " + sesudah);

        System.out.println();

        // Negasi
        int a = 2;
        int b = -a;
        System.out.println("Sebelum Negasi : 2");
        System.out.println("Sesudah Negasi : " + b);

        System.out.println();

        // Operasi Aritmatika
        System.out.println("Penambahan 10 + 2 : " + (10 + 2));
        System.out.println("Pengurangan 10 - 2 : " + (10 - 2));
        System.out.println("Perkalian 16 * 2 : " + (16 * 2));
        System.out.println("Pembagian 16 / 2 : " + (16 / 2));
        System.out.println("Sisa bagi 16 % 2 : " + (16 % 2));

        System.out.println();

        // Operator Relasi
        System.out.println("Apakah 10 kurang dari 15 : " + (10 < 15));
        System.out.println("Apakah 15 lebih besar dari 10 : " + (15 > 10));
        System.out.println("Apakah 3 sama dengan 3 : " + (3 == 3));
        System.out.println("Apakah 2 tidak sama dengan 3 : " + (2 != 3));
        System.out.println("Apakah 2 lebih kecil atau sama dengan 3 : " + (2 <= 3));
        System.out.println("Apakah 5 lebih besar atau sama dengan 3 : " + (5 >= 3));

        System.out.println();

        // Operator Logika
        System.out.println("true AND true : " + (true && true));
        System.out.println("true AND false : " + (true && false));
        System.out.println("true OR false : " + (true || false));
        System.out.println("false OR false : " + (false || false));
    }

    }
    
}
