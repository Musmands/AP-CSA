package UNIT1;

import java.util.Scanner;

public abstract class Update {
    public static void Display(){

        //Code belongs to MUSMANDS/JENGJENG all use is allowed
        //I am not responsible for any punishment or academic infraction!

        Scanner input = new Scanner(System.in);
        System.out.print("Enter in the first number:");
        double num1 = input.nextDouble();

        System.out.print("Enter in the second number:");
        double num2 = input.nextDouble();

        System.out.print("Enter in the first word:");
        String text1 = input.next();

        System.out.print("Enter in the second word:");
        String text2 = input.next();

        //Creates all the objects
        Calculator diddyBludCalculator = new Calculator(num1, num2);
        StringManipulator ayanokoji = new StringManipulator(text1, text2);


        /**
         * For my classmates who are not sure and wondering WTF is he doing? let me explain
         * I could wirte like 20000 print statements but instead we do something called a block
         * String which in the name is a block, this string type is alot more versible (introduced in java 14)
         *
         * %s means format a string here
         * .format([option1].... etc)
         */

        System.out.println("""
                Sum: %s
                Difference: %s
                Product: %s
                Quotient: %s 
                Power: %s
                Absolute Difference: %s
                Square Root Of Sum: %s 
                Random Int: %s
                
                Combined: %s
                CombinedLength: %s
                First Half: %s
                Index of Letter: %s
                Swapped: %s
                """.formatted(
                        diddyBludCalculator.add(),
                        diddyBludCalculator.sub(),
                        diddyBludCalculator.mult(),
                        diddyBludCalculator.div(),
                        diddyBludCalculator.power(),
                        diddyBludCalculator.absDif(),
                        diddyBludCalculator.sqrtSum(),
                        diddyBludCalculator.randomBetween(),

                        ayanokoji.combString(),
                        ayanokoji.combLength(),
                        ayanokoji.firstHalf(),
                        ayanokoji.indexOfFirstLetter(),
                        ayanokoji.swap()
                ));

        input.close();

    }
}
