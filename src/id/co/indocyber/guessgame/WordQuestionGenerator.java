/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.guessgame;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author user
 */
public class WordQuestionGenerator {

    public static WordModel[] createQuestion() {
        WordModel soal1 = new WordModel("Pondok Indah", "Daerah di jakarta selatan");
        WordModel soal2 = new WordModel("Sudirman", "Nama jendral dan jadi jalan utama di Jakarta");
        WordModel soal3 = new WordModel("Tugu tani", "Patung dekat monas");
        WordModel soal4 = new WordModel("Citos", "Mall di selatan jakarta");
        WordModel soal5 = new WordModel("Gandaria city", "Mall anak muda");
        WordModel[] bankSoal = {soal1, soal2, soal3, soal4, soal5};
        return bankSoal;
    }

    public static List<WordModel> createQuestionInCollection() {
        WordModel soal1 = new WordModel("Pondok Indah", "Daerah di jakarta selatan");
        WordModel soal2 = new WordModel("Sudirman", "Nama jendral dan jadi jalan utama di Jakarta");
        WordModel soal3 = new WordModel("Tugu tani", "Patung dekat monas");
        WordModel soal4 = new WordModel("Citos", "Mall di selatan jakarta");
        WordModel soal5 = new WordModel("Gandaria city", "Mall anak muda");
        List<WordModel> bankSoal = new ArrayList<>();
        bankSoal.add(soal1);
        bankSoal.add(soal2);
        bankSoal.add(soal3);
        bankSoal.add(soal4);
        bankSoal.add(soal5);
        return bankSoal;

    }

    public static List<WordModel> createQuestionFromFile(String filename) throws FileNotFoundException, IOException {
        File file = new File(filename);
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        List<WordModel> bankSoal = new ArrayList<>();
        String line = null;
        while ((line = reader.readLine()) != null) {
            String splitLine[] = line.split(","); 
            WordModel model = new WordModel(splitLine[0].trim(), splitLine[1].trim()); 
            bankSoal.add(model);
        }

        return bankSoal;
    }

}
