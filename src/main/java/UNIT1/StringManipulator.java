package UNIT1;

public class StringManipulator {
    // You are not aiannakoji brodie

    //Code belongs to MUSMANDS/JENGJENG all use is allowed
    //I am not responsible for any punishment or academic infraction!

    private String text1;
    private String text2;


    public StringManipulator(){
        text1 = "did";
        text2 = "dy";
    }
    public StringManipulator(String text1, String text2){
        this.text1 = text1;
        this.text2 = text2;
    }

    public String combString(){
        return text1+text2;
    }
    public int combLength(){
        return text1.length()+text2.length();
    }
    public String firstHalf(){
        return text1.substring(0, text1.length()/2);
    }
    public int indexOfFirstLetter(){
        return text1.indexOf(text2.substring(0,1));
    }
    public String swap(){
        int mid = text1.length()/2;
        String f = text1.substring(0,mid);
        String b = text1.substring(mid);
        return b+f;
    }
}
