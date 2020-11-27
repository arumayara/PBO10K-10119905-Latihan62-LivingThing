/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119905.Latihan62.LivingThing;

/**
 *
 * @author
 * NAMA : Abraham Rumayara
 * NIM : 10119905
 * Kelas : IF10K
 * Deskripsi : Mnempilkan konsep abstraksi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LivingThing objHuman = new Human();
        objHuman.walk("Rizki Adam Kurniawan");
        objHuman.breath("Rizki Adam Kurniawan");
        objHuman.eat("Rizki Adam Kurniawan");
    }
    
}
