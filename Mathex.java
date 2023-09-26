public class Mathex {
    public static int Swap(int z){
        int result = z%10*10+z%100/10+z/100*100;
        return result;

    }

    public static void main(String[]args){
        int y= Swap(465);
        
        System.out.println(y);
    }
        


    }
