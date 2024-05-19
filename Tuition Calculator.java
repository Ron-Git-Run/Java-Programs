package GroceryList;
import java.util.*;
import java.lang.Math;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class GroceryListing {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner reader = null;
        String[] itemName = new String[9];
        double[] price = new double[9];
        double[] quantity = new double[9];
        String[] fooditem = new String[9];
        boolean[] fooditem1 = new boolean[9];
        String[] bulk = new String[9];
        String readarray;
        
        try {
			reader = new Scanner(new File(System.getProperty("user.dir") + "/Grocery.txt"));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        int index;
        
        index = 0;
        int category;
        
        category = 0;
        if (category == 0) {
            for (index = 0; index <= 8; index++) {
                readarray = reader.nextLine();
                itemName[index] = readarray;
                System.out.println(itemName[index]);
            }
            reader.close();
            double readprice;
            
            try {
    			reader = new Scanner(new File(System.getProperty("user.dir") + "/price.txt"));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            for (index = 0; index <= 8; index++) {
                readprice = reader.nextDouble();
                price[index] = readprice;
                System.out.println(price[index]);
            }
            reader.close();
            int readquantity;
            
			reader = new Scanner(new File(System.getProperty("user.dir") + "/quantity.txt"));
            for (index = 0; index <= 8; index++) {
                readquantity = reader.nextInt();
                quantity[index] = readquantity;
            }
            reader.close();
            String readfood;
            
            try {
    			reader = new Scanner(new File(System.getProperty("user.dir") + "/Foodlist.txt"));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            for (index = 0; index <= 8; index++) {
                readfood = reader.nextLine();
                fooditem[index] = readfood;
            }
            reader.close();
            for (index = 0; index <= 8; index++) {
                if (fooditem[index].equals("Y")) {
                    fooditem1[index] = true;
                } else {
                    fooditem1[index] = false;
                }
            }
            String readbulk;
            
            try {
    			reader = new Scanner(new File(System.getProperty("user.dir") + "/Bulk.txt"));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            for (index = 0; index <= 8; index++) {
                readbulk = reader.nextLine();
                bulk[index] = readbulk;
            }
            reader.close();
        }
        double[] total = new double[9];
        double tax;
        
        tax = 0;
        for (index = 0; index <= 8; index++) {
            total[index] = quantity[index] * price[index];
            if (fooditem1[index] == false) {
                tax = total[index] * .1;
                total[index] = total[index] + tax;
            }
            System.out.println(total[index]);
        }
        double discount;
        
        tax = 0;
        discount = 0;
        index = 0;
        double totalcost;
        
        totalcost = 0;
        for (index = 0; index <= 8; index++) {
            totalcost = total[index] + totalcost;
        }
        System.out.println(totalcost);
    }
}
