package taulukot;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;


/**
 * @author zeenab
 * @version 28.2.2022
 *
 */
public class taytataulukko {

    /**
     * @param args not used
     * @throws FileNotFoundException error handler
     * 
     * The program creates a new empty .csv file using FileOutputStream class and writes
     * the given material there using PrintWriter class.
    */
    public static void main(String[] args) throws FileNotFoundException {
         
        //Writing to csv file
        FileOutputStream fp = new FileOutputStream("testi.csv", true);
        PrintWriter pw = new PrintWriter(fp);
        
        /* Shows date inside in double("") quotation mark 
        pw.println("\"Ruoka-aine\" , \"Päivämäärä\"");
        pw.println("\"Ribsit\" ,  \"20.6.2021\"");
        pw.println("\"Rainbow makkara\",  \"10.11.2021\"");
        pw.println("\"Lihapiirakka\",  \"1.7.2020\"");
        pw.close();
        */
        
        //Shows date inside in simple('') quotation mark
        pw.println("Ruoka-aine, Päivämäärä");
        pw.println("Ribsit, '20.6.2021'"); 
        pw.println("Rainbow makkara, '10.11.2021'");
        pw.println("Lihapiirakka,  '1.7.2020'");
        pw.close();
        System.out.println("done!");
    }
}
