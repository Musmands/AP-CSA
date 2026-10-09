package UNIT1;

public abstract class StringsPractice {

    //Code belongs to MUSMANDS/JENGJENG all use is allowed
    //I am not responsible for any punishment or academic infraction!


    //This includes coding bat and in class Hw
    public static String extraEnd(String str){
        if (str.length() < 2){return "Shorter than 2";}
        String x = str.substring(str.length() - 2);
        return x+x+x;
    }
    public static String helloName(String str){
        return "Hello" + str + "!";
    }
    public static String makeABBA(String a, String b){
        return a+b+b+a;
    }
    public static String makeTags(String tag, String word){
        String F = String.format("<%s>", tag);
        String E = String.format("</%s>", tag);
        return F+word+E;
    }


}
