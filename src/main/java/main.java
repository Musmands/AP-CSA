import UNIT1.Calculator;

public class main {
    public static void main(String[] args){

        //This is just for testing

        Calculator calc = new Calculator(1,10);

        for(int i = 0; i < 100; i++){
            System.out.println(calc.randomBetween());
        }

    }
}
