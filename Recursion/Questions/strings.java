package javaBasics.Recursion.Questions;

public class strings {
    public static void main(String[] args) {
        //Q. Skip the character a from the given String.
      /*  String str="abcde";
        System.out.println(str.substring(1));*/
        skip("","abcadeaf");
         //creating empty string in the function
        System.out.println(skip2("abcdachga"));
        //removing apple from a string
        System.out.println(skipApple("abcdapplehga"));
        System.out.println(skipAppifNotApple("abcdappehga")) ;

    }

     static String skipAppifNotApple(String str) {
         if(str.isEmpty()){
             return "";
         }
         if(str.startsWith("app") && !str.startsWith("apple")){
             return skipAppifNotApple(str.substring(3));
         }else {
             return str.charAt(0)+ skipAppifNotApple(str.substring(1));
         }
    }

    static String skipApple(String str) {
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("apple")){
            return skipApple(str.substring(5));
        }else {
            return str.charAt(0)+ skipApple(str.substring(1));
        }

    }

    //1st way
    static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch =up.charAt(0);
        if(ch == 'a'){
            skip(p,up.substring(1));
        }else {
            skip(p+ch,up.substring(1));
        }
    }
    //2ndway

    static String skip2(String s){
        if(s.isEmpty()){
            return "";
        }
        char ch =s.charAt(0);

        if(ch =='a'){
            return skip2(s.substring(1));
        }else {
            return ch +skip2( s.substring(1));
        }
    }
}

