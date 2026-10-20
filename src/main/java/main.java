import ClassWork.CodeHs1;
import UNIT1.StringsPractice;

public class main {
    public static void main(String[] args){
        //This is just for testing
        // Yeah I removed some old stuff . 10.10.2026

        int a = 5;
        a += 3;
        a *= 2;
        a -= 4;
        System.out.println(addNumbers(1,2));


        String first = "Advanced";
        String second = "Placement";
        String result = first.substring(0, 2) + second.length() + first.indexOf('v');
        System.out.print("\\* This is not\n a comment *\\");
    }
    public static int addNumbers(int x, int y){
        return x+y;
    }
}
