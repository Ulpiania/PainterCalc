import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){

        int numberOfWalls = 0;
        float bucketAmount, wallWidth, wallHeight,totalWidth, totalHeight, finalSize, bucketsNeeded;
        float wallArea = 0;
        float extraArea = 0;
        float finalWallArea = 0;
        float finalExtraArea = 0;
        Scanner myScanner = new Scanner(System.in);

        while (numberOfWalls == 0){
            System.out.println("How many walls does the room have?");
            numberOfWalls = Integer.parseInt(myScanner.nextLine());
            if (numberOfWalls == 0){
                System.out.println("Please enter a value greater than 0");
            }
        }

        float[] wallAreas = new float[numberOfWalls];
        float[] extraAreas = new float[numberOfWalls];
        while (numberOfWalls > 0) {
            System.out.println("Wall number: " + numberOfWalls);
            System.out.println("What is the width of the wall?");
            wallWidth = Float.parseFloat(myScanner.nextLine());
            System.out.println("What is the height of the wall?");
            wallHeight = Float.parseFloat(myScanner.nextLine());


            System.out.println("What is the total width of any extra objects on the wall such as Doors/Sockets/Windows (0 if N/A)");
            totalWidth = Float.parseFloat(myScanner.nextLine());

            System.out.println("What is the total height of any extra objects on the wall such as Doors/Sockets/Windows (0 if N/A)");
            totalHeight = Float.parseFloat(myScanner.nextLine());

            int noOfWalls = numberOfWalls;
            for (int i=0; i < numberOfWalls ; i++) {
                if (noOfWalls == numberOfWalls) {
                    wallArea = wallWidth * wallHeight;
                    extraArea = totalWidth * totalHeight;
                    wallAreas[i] = wallArea;
                    System.out.println("The total surface area of wall number " + numberOfWalls + " is: " + wallAreas[i]);

                    extraAreas[i] = extraArea;
                    System.out.println("The total surface area of the extras on wall number " + numberOfWalls + " is: " + extraAreas[i]);

                    System.out.println("The final surface area for wall number " + numberOfWalls + " is: " + (wallArea - extraArea));
                    numberOfWalls--;

                }
            }

            finalWallArea += wallWidth * wallHeight;
            finalExtraArea += totalWidth * totalHeight;

        }
        System.out.println("How much square meters can the amount of paint in your bucket cover?");
        bucketAmount = Float.parseFloat(myScanner.nextLine());
        finalSize = finalWallArea - finalExtraArea;
        bucketsNeeded = (float) Math.ceil(finalSize / bucketAmount);

        System.out.println("The final total surface area of all the walls after removing the extra objects is: " + finalSize);
        System.out.println("You will need: " + bucketsNeeded + " buckets to fully paint the wall.");
    }
}
