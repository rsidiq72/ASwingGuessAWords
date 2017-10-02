/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.guessagamewords;

import java.util.Arrays;

/**
 *
 * @author user
 */
public class BankSoal {
    
    private String basicWord;
    private String soal;
    private String hint;
    private String jawaban;

    public BankSoal() {
    }
            
    public BankSoal(String basicWord, String hint) {
        this.basicWord = basicWord;
        this.hint = hint;
    }

    
    
    public String createSoal(){
        String kataKunci = basicWord.toUpperCase(); // to uppercase berfungsi untuk merubah huruf kecil menjadi kapital       
        char[] vokal = {'A','I','U','E','O'};
        
        for (int i = 0; i < vokal.length ; i++) {
            kataKunci = kataKunci.replace(vokal[i], '_');
        }
        return kataKunci;
        
    }
    
    public boolean cekJawaban() {
        boolean hasil = false; //defaultnya buat cek jawaban itu atau perbandingan pasti false
        if(jawaban.equalsIgnoreCase(basicWord)){ // jadi cukup bikin kondisi benernya aja, terus di return deh
            hasil = true;
        }
        return hasil;
    }   
    
    /**
     * @return the basicWord
     */
    public String getBasicWord() {
        return basicWord;
    }

    /**
     * @param basicWord the basicWord to set
     */
    public void setBasicWord(String basicWord) {
        this.basicWord = basicWord;
    }

    /**
     * @return the soal
     */
    public String getSoal() {
        return soal;
    }

    /**
     * @param soal the soal to set
     */
    public void setSoal(String soal) {
        this.soal = soal;
    }

    /**
     * @return the hint
     */
    public String getHint() {
        return hint;
    }

    /**
     * @param hint the hint to set
     */
    public void setHint(String hint) {
        this.hint = hint;
    }

    /**
     * @return the jawaban
     */
    public String getJawaban() {
        return jawaban;
    }

    /**
     * @param jawaban the jawaban to set
     */
    public void setJawaban(String jawaban) {
        this.jawaban = jawaban;
    }
    
}
