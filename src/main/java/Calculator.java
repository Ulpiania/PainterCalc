import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){

        int numberOfWalls;
        float bucketAmount, wallWidth, wallHeight,totalWidth, totalHeight, finalSize, bucketsNeeded;
        float wallArea = 0;
        float extraArea = 0;
        Scanner myScanner = new Scanner(System.in);

        System.out.println("How much square meters can the amount of paint in your bucket cover?");
        bucketAmount = Float.parseFloat(myScanner.nextLine());
        System.out.println("How many walls does the room have?");
        numberOfWalls = Integer.parseInt(myScanner.nextLine());

        while (numberOfWalls > 0) {
            System.out.println("Wall number: " + numberOfWalls);
            System.out.println("What is the width of the wall?");
            wallWidth = Float.parseFloat(myScanner.nextLine());
            System.out.println("What is the height of the wall?");
            wallHeight = Float.parseFloat(myScanner.nextLine());
            wallArea += wallWidth * wallHeight;
            System.out.println("The total wall size is: " + wallArea);

            System.out.println("What is the total width of any extra objects on the wall such as Doors/Sockets/Windows (0 if N/A)");
            totalWidth = Float.parseFloat(myScanner.nextLine());

            System.out.println("What is the total height of any extra objects on the wall such as Doors/Sockets/Windows (0 if N/A)");
            totalHeight = Float.parseFloat(myScanner.nextLine());
            extraArea += totalWidth * totalHeight;
            numberOfWalls--;
        }

        finalSize = wallArea - extraArea;
        bucketsNeeded = (float) Math.ceil(finalSize / bucketAmount);

        System.out.println("You will need: " + bucketsNeeded + " buckets to fully paint the wall.");
    }
}
