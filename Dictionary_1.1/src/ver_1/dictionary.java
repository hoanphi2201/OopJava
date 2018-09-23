/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ver_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


/**
 *
 * @author phixuanhoan
 */
public class dictionary {
    public static final int FILE_OPEN = 1;
    public static final int FILE_SAVE = 2;
    private static boolean change = false;
    
    // Thuộc tính của lớp dictionary
    public static ArrayList<newWord> listWord = new ArrayList();
    private int totalWord;
    
    public int getTotalWord(){
        return totalWord;
    }
    public void setTotalWord(int totalWord){
        this.totalWord = totalWord;
    }
    public boolean existWord(String word){
        for(int i = 0; i < listWord.size(); i++){
            if(listWord.get(i).getSpelling().equals(word)){
                return true; // đã tồn tại
            }
        }
        return false;

    }
    public void readFile(File file) throws IOException {
        FileReader fr = new FileReader(file);
        try (BufferedReader br = new BufferedReader(fr)) {
            String line = null;
            while ((line = br.readLine()) != null) {
                
                newWord word = new newWord();
                String spelling = line;
                String explain = br.readLine();
                String transcription = br.readLine();
                String example = br.readLine();
                String explainExample = br.readLine();
                
                spelling = spelling.substring(0, spelling.length() -1);
                explain = explain.substring(0, explain.length() -1);
                transcription = transcription.substring(0, transcription.length() -1);
                example = example.substring(0, example.length() -1);
                explainExample =explainExample.substring(0, explainExample.length() -1);
                word.setSpelling(spelling);
                word.setExplain(explain);
                word.setTranscription(transcription);
                word.setExample(example);
                word.setExplainExample(explainExample);
                
                listWord.add(word);
            }
            try {
                br.close();
                fr.close();

            } catch (IOException ex) {
                Logger.getLogger(formMain.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     * Hàm này để viết ra file
     *
     * @param file
     * @throws IOException
     */
    public void writeFile(File file) throws IOException {
        file.createNewFile();
        BufferedWriter bw;
        try (FileWriter fw = new FileWriter(file)) {
            bw = new BufferedWriter(fw);
            for (int i = 0; i < listWord.size(); i++) {
                bw.write(listWord.get(i).getSpelling() + "\n");
                bw.write(listWord.get(i).getExplain() + "\n");
                bw.write(listWord.get(i).getTranscription() + "\n");
                bw.write(listWord.get(i).getExample() + "\n");
                bw.write(listWord.get(i).getExlainExample() + "\n");
            }
            bw.close();
            fw.close();
        }

    }

    /**
     * Hàm này để mở file chooser lên để đọc hoặc ghi file
     *
     * @param title tiêu đề cho chooser
     * @param type loại mở hay lưu
     * @param order
     * @throws IOException
     */
    public void operateFile(String title, int type, int order) throws IOException {
        JFileChooser chooser = new JFileChooser();
        int choose = -1;
        chooser.setDialogTitle(title);
        switch (type) {
            case FILE_OPEN:
                choose = chooser.showOpenDialog(null);
                break;
            case FILE_SAVE:
                choose = chooser.showSaveDialog(null);
                break;
        }
        if (choose == JFileChooser.APPROVE_OPTION) {

            File file = chooser.getSelectedFile();
            switch (type) {
                case FILE_OPEN: {
                    try {
                        readFile(file);
                        change = true;
                    } catch (IOException ex) {
                        Logger.getLogger(formMain.class
                                .getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
                case FILE_SAVE:
                    int result = 0;
                    if (order == 1) {
                        result = JOptionPane.showConfirmDialog(null, "Bạn có muốn lưu file?");
                    }
                    if (result == JOptionPane.OK_OPTION) {
                        writeFile(file);
                    }

                    break;
            }

        }
    }
}
