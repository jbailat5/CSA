package ch1;
public class Mathex {
    public static int Swap(int z){
        int result = z%10*10+z%100/10+z/100*100;
        return result;

    }

    public static void main(String[]args){
        int y= Swap(465);
        int g= Swap(321);
        int k= Swap(567);
        
        System.out.println(y);
        System.out.println(g);
        System.out.println(k);
        timeLeft(1,15,4,36);
        timeLeft(1,34,8,20);
        System.out.println(dayOfWeek(0,1));
        System.out.println(dayOfWeek(0,14));
        System.out.println(dayOfWeek(6, 22));
        System.out.println(dayOfWeek(5, 4));
        System.out.println(dayOfWeek(1,24));  	
        System.out.println(dayOfWeek(2,1));
    }

    public static void timeLeft(int curHour, int curMin, int depHour, int depMin){
        int differencehour = ((depHour*60+depMin) - (curHour*60+curMin))/60; 
        
        int differencemin = ((depHour*60+depMin) - (curHour*60+curMin))%60; 
        System.out.println(differencehour + " Hours and " + differencemin + " Minutes. ");
    }
    public static int dayOfWeek(int day1, int date){
        int day = (date + day1 - 1)%7;
        return day;
    }
         
        


    
        


    }
