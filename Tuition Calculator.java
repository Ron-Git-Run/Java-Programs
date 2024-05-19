package tuitioncalculator;

import java.util.Scanner;
import java.util.*;
import java.lang.Math;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TuitionClass {
private static Scanner reader;
	public static void main(String[] args) throws FileNotFoundException {
	String[] namesList = new String[10];
        String[] classList = new String[10];
        int[] creditHoursList = new int[10];
        String[] inDistrictList = new String[10];
        String[] courseFee = new String[10];
        double[] totalTuitionList = new double[10];
        String readarray;
       
        reader = new Scanner(new File("Names.txt"));
        int index;
        
        index = 0;
        int category;
        
        category = 0;
        if (category == 0) {
            for (index = 0; index <= 9; index++) {
                readarray = reader.nextLine();
                namesList[index] = readarray;
            }
            reader.close();
            String readclasses;
            
            reader = new Scanner(new File("Classes.txt"));
            for (index = 0; index <= 9; index++) {
                readclasses = reader.nextLine();
                classList[index] = readclasses;
            }
            reader.close();
            int readquantity;
            
            reader = new Scanner(new File("CreditHours.txt"));
            for (index = 0; index <= 9; index++) {
                readquantity = reader.nextInt();
                creditHoursList[index] = readquantity;
            }
            reader.close();
            String readinout;
            
            try {
				reader = new Scanner(new File("InDistrict.txt"));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            for (index = 0; index <= 9; index++) {
                readinout = reader.nextLine();
                inDistrictList[index] = readinout;
            }
            reader.close();
        }
        double total;
        
        total = 0;
        int[] numCourse = new int[10];
        
        for (index = 0; index <= 9; index++) {
            numCourse[index] = (int) ((double) creditHoursList[index] / 3);
        }
        for (index = 0; index <= 9; index++) {
            int x;
            
            x = 0;
            while (classList[index].equals("Senior") && x == 0) {
                courseFee[index] = "No";
                if (inDistrictList[index].equals("No") || numCourse[index] <= 3) {
                    totalTuitionList[index] = 100 * creditHoursList[index] + 100;
                    x = 1;
                } else {
                    totalTuitionList[index] = 100 * creditHoursList[index];
                    x = 1;
                }
            }
            while (!classList[index].equals("Senior") && x == 0) {
                if (inDistrictList[index].equals("No") && numCourse[index] < 4) {
                    courseFee[index] = "Yes";
                    totalTuitionList[index] = 100 * creditHoursList[index] + 50 * numCourse[index];
                    x = 3;
                } else {
                    courseFee[index] = "No";
                    totalTuitionList[index] = 100 * creditHoursList[index];
                    x = 3;
                }
            }
            System.out.println(totalTuitionList[index]);
        }
	}
}

    



