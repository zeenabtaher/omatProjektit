package taulukot;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author zeenab
 * @version 25.7.2022
 *
 */
public class luetaulukko {

    /**
     * @param args not used
     * @throws Exception error handler
     * 
     * The program reads the .csv file using File and Scanner classes. 
     * The .csv file data is split into a table and sum the first and second lines together.
     * The result is printed in console.
     */
    public static void main(String[] args) throws Exception {
       
        try {
            File myObj = new File("numerot.csv");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String [] splittedStr = data.split(",");
                System.out.println(Integer.parseInt(splittedStr[0]) + Integer.parseInt(splittedStr[1]));
            }
            myReader.close();
        } catch (

        FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    }


