package UNIT1;

public abstract class StringsPractice {

    //Code belongs to MUSMANDS/JENGJENG all use is allowed
    //I am not responsible for any punishment or academic infraction!


    //This includes coding bat and in class Hw

    public static String helloName(String str){
        return "Hello" + str + "!";
    }
    public static String makeABBA(String a, String b){
        return a+b+b+a;
    }
    public static String makeTags(String tag, String word){
        //You could use String.formatted but coding bat doesn't allow for that since it uses an older java version
        String F = String.format("<%s>", tag);
        String E = String.format("</%s>", tag);
        return F+word+E;
    }
    public static String makeOutWord(String out, String word){
        int midPoint = out.length()/2;
        String f = out.substring(0,midPoint);
        String e = out.substring(midPoint);
        return f+word+e;
    }
    public static String extraEnd(String str){
        if (str.length() < 2){return "Shorter than 2";}
        String x = str.substring(str.length() - 2);
        return x+x+x;
    }
    public static String firstTwo(String str) {
        if (str.length()<2){return str;}
        return str.substring(0,2);
    }
    public static String firstHalf(String str) {
        return str.substring(0,str.length()/2);
    }
    public static String withoutEnd(String str) {
        if (str.length()<2){return "";}
        return str.substring(1,str.length()-1);
    }
    public static String comboString(String a, String b) {
        if (a.length() < b.length()){
            return a+b+a;
        } else {
            return b+a+b;
        }
    }
    public static String nonStart(String a, String b) {
        return a.substring(1)+b.substring(1);
    }
    public static String left2(String str) {
        return str.substring(2)+str.substring(0,2);
    }
    public static String right2(String str) {
        int start = str.length()-2;
        return str.substring(start)+str.substring(0,start);
    }
    /*
    * Hi guys! around here i started using tetrinary operator which is basically
    *
    * (Condition) ? ConditionMet : ConditionNotMet;
    * Function wise, it's identical to an if (){...} else {...}
    * but it's a lot more elegant and beautiful
    * */
    public static String theEnd(String str, boolean front) {
        int last = str.length()-1;
        return front ? str.substring(0, 1) : str.substring(last);
    }
    public static String withoutEnd2(String str) {
        return str.length() > 2 ? str.substring(1,str.length()-1) : "";
    }
    public static String middleTwo(String str) {
        if (str.length() < 2){return "";}
        int midPoint = str.length()/2;
        return str.substring(midPoint-1, midPoint+1);
    }
    public static boolean endsLy(String str) {
        if (str.length()<2){return false;}
        int end = str.length();
        return str.substring(end-2).equals("ly") ? true : false;
    }
    public static String nTwice(String str, int n) {
        String start = str.substring(0,n);
        String end = str.substring(str.length()-n);
        return start+end;
    }
    public static String twoChar(String str, int index) {
        if (index > str.length()-2 || index < 0){return str.substring(0, 2);}
        return str.substring(index, index+2);
    }
    public static String middleThree(String str) {
        if (str.length() < 3){return "";}
        int midPoint = str.length()/2-1;
        return str.substring(midPoint, midPoint+3);
    }
    public static boolean hasBad(String str) {
        if (str.length() < 3) return false;
        return str.substring(0, 3).equals("bad")
                || (str.length() >= 4 && str.substring(1, 4).equals("bad"));
        // This is an intresting one using the or (||) and (&&) in tangent
    }
    public static String atFirst(String str) {
        if (str.isEmpty()) return "@@";
        return str.length() >= 2 ? str.substring(0,2) : str + "@";
    }
    // im most proud of this one so far what took code bat and gemini 6 lines i did in 3
    // I am truly greater than AI
    public static String lastChars(String a, String b) {
        String aFormatted = a.length() < 1 ? "@" : a.substring(0,1);
        String bFormatted = b.length() < 1 ? "@" : b.substring(b.length()-1);
        return aFormatted+bFormatted;
    }









}
