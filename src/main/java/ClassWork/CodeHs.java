package ClassWork;

public class CodeHs {

    private CodeHs(){
        throw new AssertionError("You may not create a member of class ClassWork.CodeHs");
    }


    //1.1.6
    public static void welcome(String name, String hobby){
        System.out.println("""
                My name is %s.
                My favorite hobby is %s.
                """.formatted(name, hobby));
    }
    //1.1.8 Ascii art
    public static void ascii(){
        System.out.println("""
                   __        
                 o-''|)_____/)
                 |__/|_)     )
                    |  __  / 
                    (_/ (_/  
                
                """);
    }
    //1.1.9 Buggy code
    public static void buggyCode(){
        System.out.println("""
        Why do programmers prefer dark mode?
        Because the light attracts bugs!
        Programming is a way of thinking, not just a way of writing code.
        -Donald Knuth
        No one in the brief history of computing has ever written a piece of perfect software.
        It's unlikely that you'll be the first. 
        -Andrew Hunt
        """);
    }



}
