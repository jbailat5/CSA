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
        timeLeft(1,34,8,20);
    }

    public static void timeLeft(int curHour, int curMin, int depHour, int depMin){
        int differencehour = (depHour*60+depMin - curHour*60+ curMin)/60; 
        System.out.println(differencehour);
        int differencemin = ((depHour*60+depMin) - (curHour*60+ curMin))%60; 
        System.out.println(differencemin);

    }
         
        


    
        


    }
