package data;

import java.io.*;

public class ListFiles {
    public static void main(String[] args) {
        File dir = new File("data");
        if (dir.exists()){
            String[] files = dir.list();
            System.out.println(files.length + " files funded");
            for (int i = 0; i < files.length; i++) {
                System.out.println(files[i]);
            }
        }
        else {
            System.out.println("Catalog not funded");
        }
    }
}
