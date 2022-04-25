package omatprojektit;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class luetaulukko {

    public static void main(String[] args) throws Exception {
        /*
        String line=null;

        // here we create a container for readed and splitted lines
        ArrayList<String[]> lines = new ArrayList<String[]>();
        try{
            BufferedReader br=new BufferedReader(new FileReader("numerot.csv"));


                while((line=br.readLine())!=null){

                    String[] distance=line.split(",");

                    // here we add each readed and splitted line
                    lines.add(distance);
                    System.out.println(line);    
                }
                br.close();

        }catch(IOException e){
            e.printStackTrace();
        }


        // here we sum for a particular column.
        int columnToSum = 0;
        int sum = sumRows(lines, columnToSum );
        System.out.println("The sum of column "+ columnToSum +" is: " + sum); 
    }


    public static int sumRows(ArrayList<String[]> lines, int columnToSum)         
    {
        int sum = 0;
        for (String[] line: lines) {
            sum = sum + Integer.parseInt(line[columnToSum]);
        }
        return sum;
        */
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


