package kansiot;

import java.io.File;

/**
 * @author zeenab
 * @version 25.7.2022
 */

public class luokansiot {

    /**
     * @param args not used
     * 
     * The program makes a new directory using File class.
     * You can choos the file name and amount by yourself.
     * Already exists files cant't be created.
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
