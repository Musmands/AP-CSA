package UNIT2;

import java.util.Scanner;

public class ConditionalsAB {

    private ConditionalsAB(){
        throw new AssertionError("You may not make a class of the Conditionals AB");
    }


    /***
     * This program loops over several mini programs within the class
     */
    public static void startProgram(){
        Scanner in = new Scanner(System.in);
        boolean programRunning = true;
        int helpCounter = 0;

        System.out.println("""
        
        ===============================   
        
        Welcome to ConditonalsAB pick a program to run:
        
        [1] = Grader
        [2] = Rock Paper Scissors
        [3] = IPv4 tester
        [4] = Lottery
        
        [404] = Help
        [67] = Exit program
        
        ===============================   
        """);

        while (programRunning){
            System.out.print("Choose a program: ");

            String userInput = in.nextLine();
            switch (userInput){
                case "1","grader","grade" -> System.out.println(gradeOutput(in));
                case "2","rock","paper","scissors" -> System.out.println(rockPaperScissors(in));
                case "3","ip","ipv4","tester" -> System.out.println(ipv4Tester(in));
                case "4", "lottomax", "lotto", "lottery" -> System.out.println(lotteryWinner(in));

                //Help function
                case "404","help","h", "HELP" -> {
                    helpCounter += 1;
                    if (helpCounter > 10){
                        System.out.println("You asked for help %s times already, are you okay dude...?".formatted(helpCounter));
                        continue;
                    } else if (helpCounter > 20) {
                        System.out.println("hhhhhhh why so many h? are you okay man?");
                    }

                    //regular menu
                    System.out.println("""
                                
                                Help context menu:
                    ===============================   
                    [1] = Grader
                    [2] = Rock Paper Scissors
                    [3] = IPv4 tester
                    [4] = Lottery
                    
                    [404] = Help
                    [67] = Exit program
                    
                    Times asked for help: %s
                    =============================== 
                        """.formatted(helpCounter));
                }


                //Exit function
                case "67" -> programRunning = false;

                //Invalid case
                default -> {
                  System.out.println("\ninvalid choice: %s".formatted(userInput));
                }
            }
        }

        System.out.println("You have exited the system, shutting down");
    }

    public static String gradeOutput(Scanner scanner){
        //Make a grades class to determine thresholds instead of spamming else if
        class Grades {
            private int min;
            private int max;
            private String grade;

            public Grades(int min, int max, String grade){
                this.min = min;
                this.max = max;
                this.grade = grade;
            }

            public String getGrade(){
                return grade;
            }

        }

        // Make array for all the grades
        Grades[] gradeArray = {
                new Grades(98,100, "A+"),
                new Grades(93, 97, "A"),
                new Grades(90, 92, "A-"),
                new Grades(88,89, "B+"),
                new Grades(83,87, "B"),
                new Grades(80,82, "B-"),
                new Grades(78,79,"C+"),
                new Grades(73,77,"C"),
                new Grades(70,73,"C-"),
                new Grades(68,69,"D+"),
                new Grades(63,67, "D"),
                new Grades(60,62, "D-"),
                new Grades(0,59,"F")
        };

        System.out.print("Please input your current grade:");

        Scanner in = scanner;

        int yourGrade = in.nextInt();
        in.nextLine();

        for(Grades grade : gradeArray){
            if(yourGrade >= grade.min && yourGrade <= grade.max){
                return grade.getGrade();
            }
        }

        return "Grade not found error";
    }
    public static String rockPaperScissors(Scanner scanner){
        Scanner in = scanner;

        System.out.println("Please choose rock, paper, or scissors");

        String playerString = in.nextLine().toLowerCase();
        String cpuString = "";
        int cpuChoice = (int)(Math.random()*3);
        int playerChoice;

        //Formatting
        switch (playerString){
            case "0", "r", "rock" -> playerChoice = 0;
            case "1", "p", "paper" -> playerChoice = 1;
            case "2", "s", "scissors" -> playerChoice = 2;

            default -> {
                return "Invalid input: " + playerString + " please try again\n";}
        }
        switch (cpuChoice) {
            case 0 -> cpuString = "rock";
            case 1 -> cpuString = "paper";
            case 2 -> cpuString = "scissors";
        }
        switch (playerChoice) {
            case 0 -> playerString = "rock\n";
            case 1 -> playerString = "paper\n";
            case 2 -> playerString = "scissors\n";
        }

        int result = (playerChoice - cpuChoice + 3) % 3;

        return (result == 0) ? "You tied cpu with " + playerString
                : (result == 1)
                ? "You beat cpu (" + cpuString + ") with " + playerString
                : "You lost to cpu (" + cpuString + ") with " + playerString;
    }
    public static String ipv4Tester(Scanner scanner){
        Scanner in = scanner;


        System.out.println("Testing an IPv4 address for user...\n" +
                " please enter 4 digits for the address");
        int a = in.nextInt();
        System.out.println("You inputted %s please add a second".formatted(a));

        int b = in.nextInt();
        System.out.println("You inputted %s please add a third".formatted(b));

        int c = in.nextInt();
        System.out.println("You inputted %s please add a fourth".formatted(c));

        int d = in.nextInt();
        System.out.println("You inputted %s testing results...".formatted(d));

        //Testing
        boolean testA = a >= 0 && a <= 255;
        boolean testB = b >= 0 && b <= 255;
        boolean testC = c >= 0 && c <= 255;
        boolean testD = d >= 0 && d <= 255;

        String valid = testA && testB && testC && testD
                ? "Your generated IP was not valid"
                : "Your generated IP was valid";

        return """
                Your final generated IP:
                %s.%s.%s.%s
                
                %s
                Check a: %s
                Check b: %s
                Check c: %s
                Check d: %s
                """.formatted(a,b,c,d,valid,testA,testB,testC,testD);
    }
    /**
     * Takes two digits 0-9 inclusive and tests them against cpu
     *
     * @param scanner Scanner input object
     * @return The winning results
     * */
    public static String lotteryWinner(Scanner scanner){

        Scanner in = scanner;

        System.out.println("Please enter two digits, these will be your lottery digits");

        int userFirst = in.nextInt();
        int userSecond = in.nextInt();
        in.nextLine();

        int lotteryFirst = (int)(Math.random()*10);
        int lotterySecond = (int)(Math.random()*10);

        System.out.println("Your lottery numbers are %s%s".formatted(userFirst,userSecond));

        //Winning case
        if (userFirst == lotteryFirst && userSecond == lotterySecond){
            return "You just hit the jackpot! +$10,000";
        } else if (userFirst == lotterySecond && userSecond == lotteryFirst) {
            return "You won! +$2,000";
        } else if (userFirst == lotteryFirst || userSecond == lotterySecond) {
            return "Today is a lucky day. +$500";
        } else {
            return "Better luck next time! -$20";
        }
    }

}
