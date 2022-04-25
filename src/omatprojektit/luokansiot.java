package omatprojektit;

import java.io.File;

public class luokansiot {

    /**
     * @param args ei käytössä
     * Ohjelma luo tiedostopolkuun halutun määrän tyhjiä kansioita, halutulla nimellä
     */
    
    public static void main(String[] args) {
        String myDirectoryPath = "C:\\MyTemp\\ohj2\\ws\\omatprojektit\\kansioita\\SeenanKansio";
        int nkansiota = 100;
        for (int i = 1; i <= nkansiota; i++) {
            File myDirectory = new File(myDirectoryPath + String.valueOf(i));

            if (!myDirectory.exists()) {
                if (myDirectory.mkdir()) {
                    System.out.println(myDirectory.getName() + " created successfully.");
                } else {
                    System.out.println("Couldn't create " + myDirectory.getName());
                }
            } else {
                System.out.println(myDirectory.getName() + " already exists.");
            }
        }
    }

}
