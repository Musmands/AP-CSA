package ClassWork;

import java.util.Scanner;

public class CodeHs {

    private CodeHs(){
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



}
