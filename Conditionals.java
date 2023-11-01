public class Conditionals {
    

    
    public boolean chimpTrouble(boolean aSmile, boolean bSmile){
        if (aSmile==bSmile){
            return true;
        }
        else{
            return false;

        }
    }

    public static void main (String []args){
        Conditionals ab = new Conditionals();
        System.out.println(ab.chimpTrouble(true, true));
        System.out.println(ab.chimpTrouble (false, false));
        System.out.println(ab.chimpTrouble (true, false));
        System.out.println(ab.chimpTrouble (false, true));
        System.out.println();

        System.out.println(ab.negPos(1, -1, false));
        System.out.println(ab.negPos(-1, 1, false));
        System.out.println(ab.negPos(1, 1, false));
        System.out.println(ab.negPos(-1, -1, false));
        System.out.println(ab.negPos(-4, -5, true)); 
        System.out.println(ab.negPos(-4, 5, true)); 
        System.out.println(ab.negPos(4, 5, true)); 
        System.out.println(ab.negPos(4, -5, true));
        System.out.println();

        System.out.println(ab.pickUpPhone(false, false, true));
        System.out.println(ab.pickUpPhone(true, true, true));
        System.out.println(ab.pickUpPhone(true, true, false));
        System.out.println(ab.pickUpPhone(false, true, false));
        System.out.println(ab.pickUpPhone(true, false, false));
        System.out.println(ab.pickUpPhone(false, false, false));
        System.out.println();
        
 

    }
    
    public boolean negPos(int a, int b, boolean c){
        if ((a*b<0) && (c==false)) return true;
        if ((a<0)&&(b<0)&&(c==true)) return true;
        else return false;
    }



    public boolean pickUpPhone(boolean isMorning, boolean isMom, boolean isAsleep){
        if (isAsleep == true) return false;
        if ((isMorning == true)&&(isMom==false)) return false;
        else return true;

    }
    
    public String setAlarm(int day, boolean onVacation){
        if ((day > 5) || (day<1) && (onVacation==false)) return  ("10:00");
        if ((day > 5) || (day<1) && (onVacation==true)) return  ("off");
        if ((day > 0) || (day<6) && (onVacation==false)) return  ("7:00");
        if ((day > 0) || (day<6) && (onVacation==true)) return  ("10:00");

    }
}

