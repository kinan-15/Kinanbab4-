/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kinanbab6a;

import javax.swing.JOptionPane;

/**
 *
 * @author PC 32 - LAB R1
 */
public class Kinanbab6a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String temp = JOptionPane.showInputDialog(null,
                "Masukan Angka", "Menentukan Ganjil Genap",
                JOptionPane.QUESTION_MESSAGE);
        int input = Integer.parseInt(temp);

        if ((input % 2) == 0) {
            JOptionPane.showMessageDialog(null, "Angka : "
                    + input + " adalah bilangan GENAP", "Informasi",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Angka : "
                    + input + " adalah bilangan GANJIL", "Informasi",
                    JOptionPane.INFORMATION_MESSAGE);
        }

        // Program Menentukan Kategori Umur
        String umur = JOptionPane.showInputDialog(null, "Kamu umur berapa ?");
        int umurInt = Integer.parseInt(umur);

        if (umurInt <= 5) {
            JOptionPane.showMessageDialog(null, "Balita");
        } else if (umurInt >= 6 && umurInt <= 11) {
            JOptionPane.showMessageDialog(null, "Anak - anak");
        } else if (umurInt >= 12 && umurInt <= 25) {
            JOptionPane.showMessageDialog(null, "Remaja");
        } else {
            JOptionPane.showMessageDialog(null, "Dewasa");
        }

        // Program Menentukan Nilai (A/B/C/D)
        String nilai = JOptionPane.showInputDialog(null, "Masukan nilai (A/B/C/D):");
        switch (nilai.toUpperCase()) {
            case "A" -> JOptionPane.showMessageDialog(null, "Sangat Baik.");
            case "B" -> JOptionPane.showMessageDialog(null, "Baik.");
            case "C" -> JOptionPane.showMessageDialog(null, "Cukup.");
            case "D" -> JOptionPane.showMessageDialog(null, "Jelek.");
            default -> JOptionPane.showMessageDialog(null, "Salah memasukan nilai!");
        }
    }

    }
    

