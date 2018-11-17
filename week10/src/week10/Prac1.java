/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author phixuanhoan
 */
public class Prac1 {

    public static String readFile(String path) throws IOException {
//        FileReader reader = null;
//        try {
//            File file = new File(path);
//            reader = new FileReader(file);
//            BufferedReader in = new BufferedReader(reader);
//            String line = in.readLine();
//            String s = "";
//            while (line != null) {
//                s += (line + "\n");
//                line = in.readLine();
//            }
//            return s;
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Prac1.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            try {
//                reader.close();
//            } catch (IOException ex) {
//                Logger.getLogger(Prac1.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//        return null;
        String code = "";
        try {
            String temp;
            BufferedReader br = new BufferedReader(new FileReader(path));
            while ((temp = br.readLine()) != null) {
                // Loại các comment "//"
                if (temp.trim().startsWith("//")) {
                } else if (temp.contains("//")) {
                    code = code + temp.substring(0, temp.indexOf("//")) + "\n";
                } else {
                    code = code + temp + "\n";
                }
            }

            // Loại các comment "/**/"
            int x = code.indexOf("/*");
            while (x != -1) {
                int y = code.indexOf("*/");
                String r;
                if (y == -1) {
                    y = code.length();
                    r = code.substring(x, y);
                    code = code.replace(r, " ");
                } else {
                    r = code.substring(x, y + 2);
                    code = code.replace(r, " ");
                }

                x = code.indexOf("/*");
            }
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found");
        } catch (IOException ex) {
            System.out.println("Fail Read File");
        }

        return code;

    }

    public static String subFunction(String str, int first) {
        int last = first;
        int cntOpen = 0;
        int cntClose = 0;
        int j = first;
        while (j < str.length()) {
            if (str.charAt(j) == '{') {
                cntOpen++;
            }
            if (str.charAt(j) == '}') {
                cntClose++;
            }
            if (cntClose != 0 && cntOpen != 0 && cntClose == cntOpen) {
                last = j;
                break;
            }
            j++;

        }
        return str.substring(first, last + 1);
    }
    public static void exportFuncToFile(String s, String path) throws IOException {
        File file = new File(path);
        FileWriter writer = new FileWriter(file, true);
        PrintWriter out = new PrintWriter(writer);
        try {
            out.print(s);
            out.close();
        } catch (Exception e) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    public static void main(String[] args) throws IOException {
        String str = readFile("src/week10/Utils.java");
        System.out.println(str);
//        String pattern = "(.*)static(.*)\\{";
//        Pattern r = Pattern.compile(pattern);
//        Matcher m = r.matcher(str);
//        ArrayList<String> arrFunc = new ArrayList();
//        while (m.find()) {
//            arrFunc.add(m.group(0));
//        }
//        for (int i = 0; i < arrFunc.size(); i++) {
//            int index = str.indexOf(arrFunc.get(i));
//            exportFuncToFile(subFunction(str, index), "data.txt");
//        }
        
        
//        String pattern = "(.*)findFileByName.*\\(String(.*)String(.*)";
//        Pattern r = Pattern.compile(pattern);
//        Matcher m = r.matcher(str);
//        if(m.find()) {
//            int index = str.indexOf(m.group(0));
//            System.out.println(subFunction(str, index));
//        }

    }
}
