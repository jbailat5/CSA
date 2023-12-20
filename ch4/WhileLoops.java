package ch4;
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
    
    public int sumDigits(int num){
        int sum = 0;

        while(num >= 1){
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }



    public int howManyYears(double startPop, double endPop){
        int years = 0;
        double pop = startPop;

        while(pop < endPop){
            pop += pop * 0.0113;
            years++;
        }

            return years;
    }


     public void printSum(int n){
        int j = 1;
        int sum = 1;
        System.out.print("1");
        while(j<n){
            j++;
            sum += j;
            System.out.print(" + " + j);
            }
            System.out.println(" = " + sum);

        }
       


     public boolean isPerfectSquare(int n){
        int count = 0;
        int sum = 0;

        while(sum < n){
            count++;
            if(count % 2 == 0) continue;
            sum += count;
        }

        return sum == n;
    }




    
        

    public static void main(String [] args){
        WhileLoops test = new WhileLoops();
        System.out.println(test.addOdds(5));
        System.out.println(test.addOdds(7));
        System.out.println(test.addOdds(9) + "\n");

        System.out.println(test.sumDigits(10));
        System.out.println(test.sumDigits(11));
        System.out.println(test.sumDigits(12) + "\n");

        System.out.println(test.howManyYears(111.2, 120));
        System.out.println(test.howManyYears(111.2, 150) + "\n");

        test.printSum(10);
        test.printSum(15);
        test.printSum(20);
        System.out.println();

        System.out.println(test.isPerfectSquare(64));
        System.out.println(test.isPerfectSquare(121));
        System.out.println(test.isPerfectSquare(45));
        System.out.println(test.isPerfectSquare(80) + "\n");

    }
    
}
