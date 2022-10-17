import java.util.Scanner;

public class DurbanStreetMaintenance {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("How many houses in the street? : ");

        int numberOfHouses;
        numberOfHouses = keyboard.nextInt();

        int houseNumbers[];
        houseNumbers = new int[numberOfHouses];

        for (int index = 0; index < houseNumbers.length; index++) {
            System.out.println("What is the next house number? : ");
            houseNumbers[index] = keyboard.nextInt();
        }//end of for loop



        int houseAges[][] = new int[numberOfHouses][];

        for (int row = 0; row < numberOfHouses; row++) {
            System.out.println("How many people live in number " + houseNumbers[row] + "? :");
            int numberOfPeople = keyboard.nextInt();

            houseAges [row] = new int[numberOfPeople];

            for (int column = 0; column < numberOfPeople; column++) {
                System.out.println("What is the age of person " + (column + 1) + ": ");
                houseAges[row][column]= keyboard.nextInt();
            }//end of nested loop
            System.out.println();
        }//end of outside loop


        int totalAge = 0;
        for(int row = 0; row < numberOfHouses; row++) {

            int houseAge = 0;

            for(int column = 0; column < houseAges[row].length; column++){
                houseAge += houseAges[row][column];
            }
            System.out.println("House " + houseNumbers[row] + " has a total age of " + houseAge);
            System.out.println("");
            totalAge += houseAge;
        }

            System.out.println("The street has a total age of " + totalAge);



    }// end of the main method
}// end of the class
