package UNIT1;

public class StringsPractice {

    //Code belongs to MUSMANDS/JENGJENG all use is allowed
    //I am not responsible for any punishment or academic infraction!


    //This includes coding bat and in class Hw

    //So it turns out that you're not supposed to make classes abstract normally if you just
    //want it so that no one constructs it. Instead, you're supposed to make a private constructor.

    private StringsPractice(){
        //So reflectors can't break in
        throw new AssertionError("You cannot make a object of StringsPractice Class");
    }

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
    public static String conCat(String a, String b) {
        int aLen = a.length();
        boolean neitherEmpty = (!b.isEmpty() && !a.isEmpty());
        boolean hasRepeatedCharacter = neitherEmpty
                ? a.substring(aLen-1).equals(b.substring(0,1)) : false;

        //Implementation
        String af = neitherEmpty
                && hasRepeatedCharacter
                ? a.substring(0,aLen-1)
                : a;
        return af+b;
    }
    //Okay, Ill stop using these fancy smancy tetrinaries and use the stardard if statements
    public static String lastTwo(String str) {
        int length = str.length();

        if (length < 2){
            return str;
        }   else {

            int targetStart = length-2;
            int targetEnd = length-1;
            String stitch = str.substring(0,targetStart) + str.substring(targetEnd);
            return stitch+str.substring(targetStart,targetEnd);
        }
    }
    /**
     * Q. Why did I start writing code slower? I could blast through this in class?
     * A. Two reasons,
     * 1. The questions simply got harder
     * 2. There lies a difference between making code fast and making good code that runs fast. Hopefully,
     * anyone who happens to read this documentation understands the gist of it. In short, you can write
     * hard-to-follow code that runs fine but what's the point? Code is meant to be shared so instead I took
     * the time to write some nicer code that has more variables. I know in class I keep buzzing about don't make
     * variables because it "wastes 32 bytes of data". That's a joke, I mean come on a computer has billions on billions
     * of bytes of Ram and trillions of bits of hard drive storage. What I'm saying is that use variables to make
     * your statements cleaner, nicer to look at and easier to follow. Ai can make code too granted but coding in a
     * form is an art. You strive to create the cleanest, fastest, most readable code.
     *
     * Yap sesh over.
     *
     * Given a string, if the string begins with "red" or "blue" return that color string,
     * otherwise return the empty string.
     *
     * @deprecated
     * since I will make a better one that lets you see all colors
     * */
    @Deprecated
    public static String oldSeeColor(String str) {
        // No ternaries here :)
        int length = str.length();
        if (length >= 4 && str.substring(0,4).equals("blue")) return "blue";
        if (length >= 3 && str.substring(0,3).equals("red")) return "red";
            else return "";
    }
    /**
     * Given a string of any type, checks if the first characters have any specified color
     * otherwise return empty string
     * this method is not case-sensitive
     *
     * @param str input string
     * @return color of the string or empty string
     *
     * 17:02
     * no longer uses
     *             if (length >= color.length()
     *                     && str.substring(0,color.length()).equals(color))
     *                 return color;
     * */
    public static String seeColor(String str) {
        String[] colors = {
                "blue",
                "red"
        };

        for(String color : colors){
            if (str.startsWith(color)) return color;
        }

        return "";
    }
    public static boolean frontAgain(String str) {
        int length = str.length();
        if (str.isEmpty() || length < 2) return false;
        if (length == 2) return true;

        String start = str.substring(0,2);
        String end = str.substring(length-2);
        return start.equals(end);
    }
    public static String minCat(String a, String b){
        if (a == null || b == null) return "";
        int aL = a.length();
        int bL = b.length();

        String aFormatted = aL <= bL ? a : a.substring(aL-bL);
        String bFormatted = bL <= aL ? b : b.substring(bL-aL);
        return aFormatted+bFormatted;
    }
    public static String extraFront(String str) {
        if (str.isEmpty()){return "";}

        String front = str.length() > 1
                ?   str.substring(0,2)
                :   str.substring(0,1);

        return front+front+front;
    }














}
