public class WhileLoops {

    public int addOdds(int n){
        int sum = 0;
        int j = 1;
        while (j <= n){
            sum=sum+j;
            j+=2;
        }
        return sum;
    }

    public int sumDigits(int x){
        int sum=0;
        int a;
        while(x>0){
            a=x%10;
            sum+=a;
            x/=10;
        }
        return sum;
    }


    public int howManyYears(double startpop, double endpop){
        

    }

    
        

    public static void main(String [] args){
        WhileLoops test = new WhileLoops();
        System.out.println(test.addOdds(6));
        System.out.println(test.addOdds(5));
        System.out.println(test.addOdds(9));
        System.out.println(test.sumDigits(10));
        System.out.println(test.sumDigits(11));
        System.out.println(test.sumDigits(12));



    }
    
}
