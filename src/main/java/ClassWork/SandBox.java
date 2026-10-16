package ClassWork;

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



    //

}
