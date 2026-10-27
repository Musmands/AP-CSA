package ClassWork;

import java.util.Locale;
import java.util.Scanner;

public class SandBox {

    //10/16/2026
    //SandBox else if program
    public static void costCalc(){
          Scanner input = new Scanner(System.in);
          double result = 0;
          String taxBracket = "broke asf";

          Double[] shippingCost = {
                  0.0,
                  15.0,
                  30.0

          };
          Double[] minCost = {
                  0.0,
                  50.0,
                  100.0,
          };
          Double[] maxCost = {
                  49.99,
                  99.99,
                  200.0,
          };


          System.out.println("Hello! please input a number!");
          double cost = input.nextDouble();
          double currentShipping = 0.0;


          for (int i = 0; i < shippingCost.length; i++){
                if (cost > minCost[i] && cost < maxCost[i]){
                    currentShipping = shippingCost[i];
                    result = cost+shippingCost[i];
                }
          }

          if (cost>maxCost[maxCost.length-1]){
              taxBracket = "Irresponsible spender";
              currentShipping = 9999999999999999999.;
              result = 999999999999999.;
          }

          System.out.println("""
                  Transcript:
                  Your cost: %s
                  Your shipping cost: %s
                  Your tax bracket: %s
                  
                  Your total: %s
                  """.formatted(cost, currentShipping, taxBracket, result));

    }

    //10/22/2026

    public static void costCalcMovies(){
        Scanner in = new Scanner(System.in);

        //init
        String userInput;
        String studentID = "none";
        boolean hasStudentID = false;
        boolean wish3D = false;
        int age = 0;
        int cost;

        //Variables
        boolean isSenior = false;
        int deductable = 0;
        int expense = 0;

        //Finals
        final int STARTING_COST = 12;
        final int ADULT_AGE = 18;
        final int SENIOR_AGE = 65;

        final int _3D_COST_ADD = 5;
        final int STUDENTS_AND_SENIORS_DISCOUNT = 2;
        final int STUDENT_18_DISCOUNT = 1;

        cost = STARTING_COST;

        System.out.println("""
                ===============================
                Ryan Wu's movie prices:
                ===============================
                
                Please enter your age as an int:
                """);
        age = in.nextInt();
        in.nextLine();

        System.out.println("Thinking.... \n do you have a student id?");
        userInput = in.nextLine().toLowerCase();

        switch (userInput){
            case "yes", "y", "true" -> {
                hasStudentID = true;
                System.out.print("Please enter your student ID: ");
                studentID = in.nextLine();

                if (studentID.length() == 7) {
                    System.out.println("You have entered: %s".formatted(studentID));
                } else {
                    System.out.println("You have no such student id!\n");
                    studentID = "none";
                    hasStudentID = false;
                }
            }
            case "no", "n", "false" -> hasStudentID = false;

            default -> hasStudentID = false;
        }


        wish3D = in.nextBoolean();


        //LOGICAL COMPONENT
        if (hasStudentID){
            if (age >= ADULT_AGE){
                deductable += STUDENT_18_DISCOUNT;
            } else {
                isSenior = true;
                deductable += STUDENTS_AND_SENIORS_DISCOUNT;
            }
        } else if (age >= SENIOR_AGE) {
            isSenior = true;
            deductable += STUDENTS_AND_SENIORS_DISCOUNT;
        }

        if (wish3D){
            cost += _3D_COST_ADD;
        }

        cost -= deductable;

        System.out.println("""
                ===============================
                Transcript:
                ===============================
                Starting cost: %s
                StudentID: %s
                Senior Citizen: %s
                
                deductible :-%s
                3D cost :%s
                
                Cost : %s
                ===============================
                """.formatted(STARTING_COST,studentID,isSenior,deductable,expense,cost));



    }

    //

}
