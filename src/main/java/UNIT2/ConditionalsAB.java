package UNIT2;

import java.util.Locale;
import java.util.Scanner;

public class ConditionalsAB {

    private ConditionalsAB(){
        throw new AssertionError("You may not make a class of the Conditionals AB");
    }



    public static String gradeOutput(){
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

        Scanner in = new Scanner(System.in);

        int yourGrade = in.nextInt();

        for(Grades grade : gradeArray){
            if(yourGrade >= grade.min && yourGrade <= grade.max){
                return grade.getGrade();
            }
        }

        return "Grade not found error";
    }

    public static String rockPaperScissors(){
        Scanner in = new Scanner(System.in);

        System.out.println("Please choose rock, paper, or scissors");

        String playerChoice = in.nextLine().toLowerCase();
        int playerInt;

        if (playerChoice.equals("rock")){
            playerInt = 0;
        } else if (playerChoice.equals("paper")) {
            playerInt = 1;
        } else  {
            playerInt = 2;
        }

        int cpuChoice = (int)(Math.random()*3);

        if (playerInt == cpuChoice){
            return "You tied with " + playerChoice;
        } else if (playerInt ) {

        }


        return "";
    }

}
