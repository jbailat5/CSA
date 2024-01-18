package ch5;
public class StringExercises {
    public static String scroll(String str){
       return str.substring(1) + str.substring(0, 1);
    }
    public static String convertName(String s1){
        s1 = s1.trim();
        int x = s1.indexOf(",");
        return s1.substring(x + 1).trim() + " " + s1.substring(0,x).trim();
    }
    public static String negative(String s){
        String s1 = s.replace('0', '2');
        String s2 = s1.replace('1', '0');
        String s3 = s2.replace('2', '1');
        return s3;
    }
    public static String convertDate(String dateStr){
        String dateE;
        dateE= dateStr.substring(3,6) + dateStr.substring(0, 3) + dateStr.substring(6, 10);
        return dateE;
    }
    public static String convertDate2(String dateStr){
        int x = dateStr.indexOf("/");
        int j = dateStr.lastIndexOf("/");
        String day;
        String month;
        String year;
        day = dateStr.substring(x+1,j);
        month = dateStr.substring(0,x);
        year = dateStr.substring(j+1);
        if (day.length()<2) day = "0" + day;
        if (month.length()<2) month = "0" + month;
        return day + "-" + month + "-" + year;
    }
    public static boolean startsWith(String s, String prefix){
        return (s.indexOf(prefix) == 0);
    }
    public static boolean endsWith(String s, String suffix){
        if (s.length() < suffix.length()){ 
            return false; 
        }
        for (int i = 0; i < suffix.length(); i++){
            if (s.charAt(s.length() - 1 - i) != suffix.charAt(suffix.length() - 1 - i)){ // if  character in s != character in suffix
                return false; 
            }
        }
        return true; 
    }
    public static String removeTag(String str, String tag){
        try {
            String newStr = str.substring(0, str.indexOf('/')) + str.substring(str.indexOf('/')+1);
            if(tag.equals(newStr.substring(newStr.indexOf('<')+1, newStr.indexOf('>'))) && tag.equals(newStr.substring(newStr.lastIndexOf('<')+1, newStr.lastIndexOf('>'))) && str.indexOf('/') > str.lastIndexOf('<')) {
                return str.substring(0, str.indexOf('<')) + str.substring(str.indexOf('>') + 1, str.lastIndexOf('<')) + str.substring(str.lastIndexOf('>')+1);          
            }            
        } catch (StringIndexOutOfBoundsException s){}

        return str;
   }


public static void main(String[] args) {
    System.out.println(scroll("Hello World"));
    System.out.println(scroll("happy"));
    System.out.println(scroll("h"));
    System.out.println(convertName(" Reubenstein, Lori Renee "));
    System.out.println(convertName("Biden,Joe"));
    System.out.println(convertName("the Clown, Bozo"));
    System.out.println(negative("0010111001"));
    System.out.println(negative("11111111"));
    System.out.println("04/20/2014 becomes " + convertDate("04/20/2014"));
    System.out.println("04/20/2014 becomes " + convertDate2("04/20/2014"));
    System.out.println("4/20/2014 becomes " + convertDate2("4/20/2014"));
    System.out.println("04/2/2014 becomes " + convertDate2("04/2/2014"));
    System.out.println("4/2/2014 becomes " + convertDate2("4/2/2014"));
    System.out.println("\nstartsWith");
    System.out.println(startsWith("architecture", "arch"));
    System.out.println(startsWith("architecture", "a"));
    System.out.println(startsWith("arch", "architecture"));
    System.out.println(startsWith("architecture", "rch"));
    System.out.println(startsWith("architecture", "architecture"));
    System.out.println("\nendsWith");
    System.out.println(endsWith("astronomy", "nomy"));
    System.out.println(endsWith("astronomy", "y"));
    System.out.println(endsWith("astronomy", "nom"));
    System.out.println(endsWith("nomy", "astronomy"));
    System.out.println(endsWith("astronomy", "astronomy"));
    System.out.println("\nremoveTag");
    System.out.println(removeTag("<b>Hello World</b>", "b"));
    System.out.println(removeTag("<b>Hello World</b>", "head"));
    System.out.println(removeTag("Hello World</b>", "b"));
    System.out.println(removeTag("<b>Hello World", "b"));
    System.out.println(removeTag("</img>Hello World<img>", "img"));
    System.out.println(removeTag("Happy Birthday <b>Hello World</b>", "b"));
    System.out.println(removeTag("<title>Hello World</title> Happy Birthday",
    "title"));
    System.out.println(removeTag("Happy <b>Hello World</b> Birthday", "b"));
}
}


