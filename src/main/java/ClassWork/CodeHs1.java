package ClassWork;

import java.util.Scanner;

public class CodeHs1 {

    private CodeHs1(){
        throw new AssertionError("You may not create a member of class ClassWork.CodeHs");
    }

    //1.1.6
    public static void helloWorld(){
        System.out.println("Hello world");
        System.out.println("Congratulations on your first Java program!");
        System.out.println("Programming is kool");
    }
    //1.1.7
    public static void welcome(String name, String hobby){
        System.out.println("""
                My name is %s.
                My favorite hobby is %s.
                """.formatted(name, hobby));
    }
    //1.1.8 Ascii art
    public static void ascii(){
        System.out.println("""
                   __        
                 o-''|)_____/)
                 |__/|_)     )
                    |  __  / 
                    (_/ (_/  
                
                """);
    }
    //1.1.9 Buggy code
    public static void buggyCode(){
        System.out.println("""
                Why do programmers prefer dark mode?
                Because the light attracts bugs!
                Programming is a way of thinking, not just a way of writing code.
                -Donald Knuth
                No one in the brief history of computing has ever written a piece of perfect software.
                It's unlikely that you'll be the first.
                -Andrew Hunt
        """);
    }
    //1.2.4 socialMediaVars
    public static void socialMediaVars(){
        int snapchatsSent = 353;
        System.out.println("Number of snapchats sent: ");
        System.out.println(snapchatsSent);

        double youTubeVideosWatched = 130.5;
        System.out.println("Number of YouTube videos watched: ");
        System.out.println(youTubeVideosWatched);

        // Data updated two weeks later
        snapchatsSent = 400;
        System.out.println("Number of snapchats sent: ");
        System.out.println(snapchatsSent);

        youTubeVideosWatched = 240.4;
        System.out.println("Number of YouTube videos watched: ");
        System.out.println(youTubeVideosWatched);

        // Write your Modify code here!
        int instagramPosts0 = 0;
        System.out.println("Number of Instagram posts" + instagramPosts0);
        instagramPosts0 = 10;
        System.out.println("Number of Instagram posts" + instagramPosts0);
    }
    //1.2.10 Signature
    public static void signature(){
        String firstName = "Jung";
        String lastName = "Woo";
        String date = "August 10, 1842";

        System.out.println("Name:");
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println("Date:");
        System.out.println(date);

        /*
                Code HS doesn't like this one but it works correctly
                System.out.println("""
                Name:
                %s
                %s
                Date:
                %s
                """.formatted(firstName,lastName,date));
         */

    }
    //1.2.11 Variables about you
    public static void variables(){
        String friendName = "Diddy";
        int luckyNum = 67;
        boolean morningPerson = true;
        String favSnack = "Baby oil";
        double favSnackPrice = 12.99;

        System.out.println(friendName);
        System.out.println(luckyNum);
        System.out.println(morningPerson);
        System.out.println(favSnack);
        System.out.println(favSnackPrice);

    }
    //1.2.12 Swapping two values
    //Just add String temp = one; on line 13

    /*
    1.2.13 Team rankings

        //Switch 2,6
        temp = team2;
        team2 = team6;
        team6 = temp;

        //Switch 5,4
        temp = team5;
        team5 = team4;
        team4 = temp;

        //Switch 4,3
        temp = team4;
        team4 = team3;
        team3 = temp;
    */
    //1.3.3
    public static void improvedSignature(){
        String firstName = "Ada";
        String lastName = "Lovelace";
        String date = "August 10, 1842";

        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Date: " + date);
        System.out.print(""); // to satisfy code HS
    }
    //1.3.4
    public static void debuggingEscapes(){
        System.out.print("\"Make it work,\nmake it right,\nmake it fast.\"\n");
        System.out.println("\t-Kent Beck");
    }
    //1.3.6
    public static void strongPasswordsFormatting(){
        System.out.println("""
                Length
                The longer a password is, the more secure it is.
                
                Complex Characters
                Strong passwords include a mix of uppercase and lowercase letters, numbers, and special characters.
                
                Unpredictability
                Passwords should avoid using common words, phrases, and personal information.
                """);
        // To satisfy code hs
        System.out.print("");
        System.out.print("");
    }
    //1.3.11
    public static void WeightOfAPyramid(){
        double bricksNum = 2_500_000;
        double brickWeightTon = 2.5;

        double result = bricksNum * brickWeightTon;

        System.out.println("""
                Pyramid weight in tons:
                %s
                """.formatted(result));
    }
    //1.3.13 "Just add 5.0 to the 5 in both prints"

    //1.4.12
    public static void mlaCitationGenerator(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the author's name as 'Last name, First name': ");
        String authorFullName = input.nextLine();

        System.out.println("Enter the year the book was published: ");
        int publishYear = input.nextInt();
        input.nextLine();

        System.out.println("Enter the title of the book: ");
        String bookTitle = input.nextLine();

        System.out.println("Enter the publisher of the book: ");
        String publisher = input.nextLine();


        System.out.println(authorFullName + ". " + bookTitle + ".");
        System.out.println(publisher + ", " + publishYear + ".");


        // Don't include the block code because CODEHS doesn't like it
        System.out.println("""
                %s. %s
                %s, %s.
                """.formatted(authorFullName, bookTitle,
                publisher, publishYear));

    }
    //1.5.10
    public static void roundOff(){
        double convertSolariToUSD =  0.034567;
        double usdAmount = 100_000;
        double a = 100000; //To satisfy stupid codeHS

        double convertedAmount = convertSolariToUSD*usdAmount;

        System.out.println(convertedAmount);
    }
    //1.6.8
    public static void banking101(){
        Scanner input = new Scanner(System.in);

        double interestRate = 3;
        interestRate /= 100;


        System.out.print("Please enter an initial balance: ");
        double balance = input.nextDouble();

        System.out.println("Initial balance: " + balance);
        balance *= (1+interestRate);
        System.out.println("Balance after interest: $" + balance);

        System.out.print("Please enter a deposit amount: ");
        double deposit = input.nextDouble();

        balance += deposit;
        balance *= (1+interestRate);
        System.out.println("Final balance after interest: " + balance);
    }
    //
    public static void stringExplorer(){
        // Create a Scanner object to read input:

        Scanner input = new Scanner(System.in);

        // Prompt the user to enter their favorite school subject:

        System.out.println("Please enter your favorite subject: ");
        String subject = input.nextLine();


        String subjectLowerCase = subject.toLowerCase();
        System.out.print("Your favorite subject in lower case: ");
        System.out.println(subjectLowerCase);

        boolean contains = subjectLowerCase.contains("computer");
        System.out.print("Subject contains \"computer\": ");
        System.out.println(contains);

        // 6) Print the total length of the subject:

        System.out.println(subject.length());
    }
    //1.8.9 JAVA DOC implementation

    /**
     * Greets the person
     *
     * @param name is the name of your character
     * Preconditions: name must not be null
     * Postconditions: prints a greeting message to standard output
     */
    public static void greetEnglish(String name)
    {
        System.out.print("Hello ");
        System.out.println(name);
    }


    /**
     * Introduces A to B
     *
     * @param name1 is the name of the person meeting
     * @param name2 is the name of person getting introduced
     * Preconditions: name1 and name2 must not be null
     * Postconditions: prints an introduction statement for name1 and name2 to standard output
     */
    public static void introduce(String name1, String name2)
    {
        System.out.print(name1);
        System.out.print(", meet ");
        System.out.println(name2);
    }
    //1.9.9
    // Calculates the average with two input doubles
    public static double calculateAverage(double a, double b)
    {
        Double Sigma = a+b;
        return Sigma/2;
    }

    // Calculates the average with three input doubles
    public static double calculateAverage(double a, double b, double c)
    {
        Double Sigma = a+b+c;
        return Sigma/3;
    }

    // Calculates the average with four input doubles
    public static double calculateAverage(double a, double b, double c, double d)
    {
        Double Sigma = a+b+c+d;
        return Sigma/4;
    }

    //
    //1.10.7
    public static void calculatorRunner(){

        //This is my code
        double slope = (10.-1)/(5.-1);
        System.out.println("Slope: " + slope);

        //  2, 3 | 6, 7
        double distance = Math.sqrt(Math.pow((7-3),2)+Math.pow((6-2),2));
        System.out.println("Distance: " + distance);

        int a = 1;
        int b = 2;
        int c = -8;

        double discrimiant = Math.pow(b,2)-4*a*c;
        double rootOne = (-b-Math.sqrt(discrimiant))/2*a;
        double rootTwo = (-b+Math.sqrt(discrimiant))/2*a;

        System.out.println("Roots: " + rootOne + ", " + rootTwo);



        //CODE HS WANTS THIS PART

        /*
        System.out.println("Slope: " + Calculator.slope(1,1,5,10));
        System.out.println("Distance: " + Calculator.distance(2,3,6,7));
        System.out.println("Roots: " + Calculator.quadRoots(1,2,-8));
        */


    }
    //1.11.6
    public static void trafficEngineer(){
        Scanner in = new Scanner(System.in);
        // Get user input for the distance of the onramp
        System.out.print("Please enter the onramp distance (m):");
        double onRampDist = in.nextDouble();
        in.nextLine();

        // Calculate the time to accelerate down onramp

        double timeNeeded = calculateTime(3, onRampDist);

        // Print out results

        System.out.println("With a distance of" + onRampDist + "m, the time to accelerate down it is:" + timeNeeded + "s");

    }
    public static double calculateTime(double acceleration, double distance){
        return Math.sqrt(2*distance/acceleration);
    }
    //1.12.5
    public static void manyStringObjects(){
        // Part 1: Create two string variables and a third that
        // references the first:
        String stringOne = "diddy";
        String stringTwo = "combs";
        String stringThree = stringOne;
        // Part 2: Assign a new value to stringOne variable:
        stringOne = "BigStein";
        // Part 3: Print out the values of all three string variables:
        System.out.println(stringOne);
        System.out.println(stringTwo);
        System.out.println(stringThree);
    }
    //1.13.8
    public static void overloadedCameras(){
        class Camera
        {
            // Attributes
            private String filmFormat;
            private int megaPixels;
            private int maxZoom;

            // Constructor with film format and zoom inputs
            public Camera(String format, int zoom)
            {
                filmFormat = format;
                maxZoom = zoom;
                megaPixels = 0;
            }

            // Constructor with pixels and zoom inputs
            public Camera(int pixels, int zoom)
            {
                megaPixels = pixels;
                maxZoom = zoom;
                filmFormat = null;
            }

            // Overriding method that prints only the max zoom
            public String toString()
            {
                return "This is a camera with a maxiumum zoom of : " + maxZoom;
            }
        }

        //DO NOT PASTE ANYTHING ABOVE
        Camera a = new Camera("16k UHD TN OLED", 999);
        Camera b = new Camera(1, 0);
        Camera c = new Camera(Integer.MAX_VALUE,1);

        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());


    }
    //1.14.6
    public static void smartWaterBottle() {
        //DO NOT PASTE THIS
        class WaterBottle {
            private double capacity; // Total capacity in liters
            private double currentVolume; // Current volume in liters
            private int currentSipCount; // Current number of sips
            private int remainingPercent; // Current remaining %
            private double volumeConsumed; // Amount of water consumed in liters

            // Constructor
            public WaterBottle(double bottleCapacity, double bottleInitialVolume) {
                capacity = bottleCapacity;
                // Make sure current volume is not above capacity
                currentVolume = Math.min(bottleInitialVolume, capacity);
                // Round volume to nearest tenth of a liter
                currentVolume = Math.round(currentVolume * 10) / 10.0;

                remainingPercent = calcRemainingPercentage();
                currentSipCount = 0;
                volumeConsumed = 0.0;
            }

            // Method to drink a specified amount from the bottle
            public void drink(double amount) {
                // Only drink what's available right now
                double actualSip = Math.min(amount, currentVolume);

                // Subtract amount from current volume
                currentVolume -= actualSip;

                // Round volume to nearest tenth of a liter
                currentVolume = Math.round(currentVolume * 10) / 10.0;

                // Calculate new remaining percent
                remainingPercent = calcRemainingPercentage();

                // Add one sip to counter
                currentSipCount++;

                // Add amount to volume consumed
                volumeConsumed += actualSip;

                // Round volume to nearest tenth of a liter
                volumeConsumed = Math.round(volumeConsumed * 10) / 10.0;
            }

            // Method to refill the bottle
            public void refill(double amount) {
                // Add amount to current volume
                currentVolume += amount;

                // If current volume is greater than capacity, set
                // current volume to capacity (no overflow)
                currentVolume = Math.min(currentVolume, capacity);

                // Round volume to nearest tenth of a liter
                currentVolume = Math.round(currentVolume * 10) / 10.0;

                // Calculate new remaining percent
                remainingPercent = calcRemainingPercentage();
            }

            // Overloaded method without an amount refills to full
            // capacity
            public void refill() {
                refill(capacity);
            }

            // Private method to help calculate the remaining percentage
            private int calcRemainingPercentage() {
                // Calculate remaining percent
                return (int) Math.round((currentVolume / capacity) * 100);
            }

            public void resetConsumption() {
                // Reset sip count
                currentSipCount = 0;

                // Rest volume consumed
                volumeConsumed = 0.0;
            }

            // toString method to display bottle details
            public String toString() {
                return "== Water Bottle Status ==" +
                        "\nCapacity: " + capacity + "L" +
                        "\nCurrent Volume Left: " + currentVolume + "L" +
                        "\nPercent Volume Remaining: " + remainingPercent + "%\n" +
                        "\n** Water Consumption Status **" +
                        "\nVolume Consumed: " + volumeConsumed + "L" +
                        "\nSip Count: " + currentSipCount + "\n";
            }
        }
        //PASTE BELOW

        WaterBottle myBottle = new WaterBottle(1.0, 1);

        myBottle.drink(.70);
        myBottle.drink(0.0);
        myBottle.refill();
        myBottle.drink(.40);
        System.out.println(myBottle.toString());

    }
    //1.15.14 wordGames
    public class WordGames {

        public static String scramble(String word) {
            // switch first half
            // and second half
            if (word == null){return "";}
            int length = word.length()/2;

            return word.substring(length)+word.substring(0,length);
        }


        public static String bananaSplit(String word, int insertIdx, String insertText)
        {
            // Insert insertText at the position
            // insertIdx
            StringBuilder splitter = new StringBuilder(word);
            splitter.insert(insertIdx, insertText);
            return splitter.toString();
        }


        public static String bananaSplit(String word, String insertChar, String insertText)
        {
            // Insert insertText after the first
            // occurence of the insertChar
            StringBuilder splitter = new StringBuilder(word);
            splitter.insert(word.indexOf(insertChar), insertText);
            return splitter.toString();
        }
        //2.2.9 Triple double
        public static void tripleDouble(){
            Scanner in = new Scanner(System.in);

            System.out.println("How many points did you score? ");
            int points = in.nextInt();
            in.nextLine();
            System.out.println("How many rebounds did you score? ");
            int rebounds = in.nextInt();
            in.nextLine();
            System.out.println("How many assists did you score? ");
            int assists = in.nextInt();
            in.nextLine();

            System.out.println("You got 10 or more points:" + hasPoints(points));
            System.out.println("You got 10 or more rebounds:" + hasRebounds(rebounds));
            System.out.println("You got 10 or more assists:" + hasAssists(assists));

        }
        public static boolean hasPoints(int points) {
            return points >= 10
                    ? true
                    : false;
        }

        public static boolean hasRebounds(int rebounds) {
            return rebounds >= 10
                    ? true
                    : false;
        }

        public static boolean hasAssists(int assists) {
            return assists >= 10
                    ? true
                    : false;
        }

        //2.3.8
        public static void sweetOrUnsweet(){
            Scanner in = new Scanner(System.in);

            System.out.println("What do you want to drink? ");
            String drinkChoice = in.nextLine();

            System.out.println("How many teaspoons of sugar do you want?");
            int sugarTSPB = in.nextInt();
            in.nextLine();
            String possesive = sugarTSPB != 0 ? "with sugar" : "without sugar";

            System.out.println("Great! Here's one " + drinkChoice + " " + possesive);
        }



    }


}
