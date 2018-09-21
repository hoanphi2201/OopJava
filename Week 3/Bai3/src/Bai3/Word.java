/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

/**
 *
 * @author phixuanhoan
 */
public class Word {
    // id của từ
    private int  id;
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

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the spelling
     */
    public String getSpelling() {
        return spelling;
    }

    /**
     * @param spelling the spelling to set
     */
    public void setSpelling(String spelling) {
        this.spelling = spelling;
    }

    /**
     * @return the explain
     */
    public String getExplain() {
        return explain;
    }

    /**
     * @param explain the explain to set
     */
    public void setExplain(String explain) {
        this.explain = explain;
    }

    /**
     * @return the transcription
     */
    public String getTranscription() {
        return transcription;
    }

    /**
     * @param transcription the transcription to set
     */
    public void setTranscription(String transcription) {
        this.transcription = transcription;
    }

    /**
     * @return the example
     */
    public String getExample() {
        return example;
    }

    /**
     * @param example the example to set
     */
    public void setExample(String example) {
        this.example = example;
    }

    /**
     * @return the explainExample
     */
    public String getExplainExample() {
        return explainExample;
    }

    /**
     * @param explainExample the explainExample to set
     */
    public void setExplainExample(String explainExample) {
        this.explainExample = explainExample;
    }
}
