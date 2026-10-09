package UNIT1;

public class Calculator {

    //Code belongs to MUSMANDS/JENGJENG all use is allowed
    //I am not responsible for any punishment or academic infraction!

    //sd

    private double num1;
    private double num2;

    public Calculator(){
        num1 = 1;
        num2 = 2;
    }
    public Calculator(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add(){
        return num1 + num2;
    }
    public double sub(){
        return num1 - num2;
    }
    public double mult(){
        return num1 * num2;
    }
    public double div(){
        return num1 / num2;
    }
    public double power(){
        return Math.pow(num1, num2);
    }
    public double absDif(){
        return Math.abs(num1-num2);
    }
    public double sqrtSum(){
        return Math.sqrt(num1+num2);
    }
    public int randomBetween(){
        int start = (int) num1;
        int range = (int) (num2 - num1 + 1);

        // For those reading || is or

        if (num1 > num2 || range <= 0){
            return 6767; // 6767 means the scope is cooked
        } else {
            return (int) (Math.random() * range) + start;
        }
    }
}
