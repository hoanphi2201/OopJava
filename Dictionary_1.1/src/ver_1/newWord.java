/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ver_1;

import javax.swing.ImageIcon;

/**
 *
 * @author phixuanhoan
 * spelling: nội dung từ -> tenTu
 * explain: nghĩa của từ ->nghiaTu
 * transcription -> phienAm
 * example : câu ví dụ -> cau vi du
 * explainExample : ->nghia cau vi du
 */
public class newWord {
    //    Biến tên của từ mới
    private String spelling;
    //    Biến nghĩa của từ mới
    private String explain;
    //    Biến phiên âm của từ
    private String transcription;
    //    Biến câu ví dụ
    private String example;
    //    Biến nghĩa của câu ví dụ
    private String explainExample;

    public String getSpelling() {
        return spelling;
    }

    public void setSpelling(String spelling) {
        this.spelling = spelling;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    public String getTranscription() {
        return transcription;
    }

    public void setTranscription(String transcription) {
        this.transcription = transcription;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    public String getExlainExample() {
        return explainExample;
    }

    public void setExplainExample(String explainExample) {
        this.explainExample = explainExample;
    }
    public newWord(String spelling, String explain, String transcription, String example, String explainExample){
        this.spelling = spelling;
        this.explain = explain;
        this.transcription = transcription;
        this.example = example;
        this.explainExample = explainExample;
    }
    public newWord(){
        this.spelling = "";
        this.explain = "";
        this.transcription = "";
        this.example = "";
        this.explainExample = "";
    }
}
