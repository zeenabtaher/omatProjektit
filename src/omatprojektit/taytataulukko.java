package omatprojektit;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;


/**
 * @author zeena
 * @version 28.2.2022
 *
 */
public class taytataulukko {

    /**
     * @param args ei käytössä
     * @throws FileNotFoundException virheilmoitus
     
    */
    public static void main(String[] args) throws FileNotFoundException {
        //csv tidostoon kirjoittaminen 
        //Writing to csv file
        FileOutputStream fp = new FileOutputStream("testi.csv", true);
        PrintWriter pw = new PrintWriter(fp);
        
        /*
         * Tulostaa pilkunjälkeisen tekstin tupala hipsuihin
        pw.println("\"Ruoka-aine\" , \"Päivämäärä\"");
        pw.println("\"Ribsit\" ,  \"20.6.2021\"");
        pw.println("\"Rainbow makkara\",  \"10.11.2021\"");
        pw.println("\"Lihapiirakka\",  \"1.7.2020\"");
        pw.close();
        */
        
        //Tulostaa päivämääriin yksinkertaiset hipsut
        pw.println("Ruoka-aine, Päivämäärä");
        pw.println("Ribsit, '20.6.2021'"); 
        pw.println("Rainbow makkara, '10.11.2021'");
        pw.println("Lihapiirakka,  '1.7.2020'");
        pw.close();
        System.out.println("done!");
    }
}
