/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.guessagamewords;

/**
 *
 * @author user
 */
public class StringProp {
    
    public static void main(String[] args) {
        
        String nama = "Matt Robin";
        char[] vokal = {'a','i','u','e','o'};
        System.out.println(nama);
        
        for (int i = 0; i < vokal.length ; i++) {
            nama = nama.replace(vokal[i], '_');
        }
        System.out.println(nama);
        
//        char idx5 = nama.charAt(5); // ambil 1 karakter pada index ke 5
//        System.out.println(idx5);
//        int uni5 = nama.codePointAt(5); // dalam bentuk unicode
//        System.out.println(uni5);
//        
//        int a = 'c';
//        char d = 65535;
//        
//        System.out.println(Character.getNumericValue('R')); // dalam bentuk code ascii
    }
    
}
