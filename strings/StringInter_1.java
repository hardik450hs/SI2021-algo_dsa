package strings;

// Write a Code to check whether one string is a rotation of another



public class StringInter_1 {

    static Boolean rotation(String s1,String s2){
        if((s1.length()==s2.length()) && ((s1+s1).indexOf(s2)!=-1)){
            return true;
        }
        else
        return false;
    }
    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "deabc";
        if(rotation(str1, str2)==true)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
