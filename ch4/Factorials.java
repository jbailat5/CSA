package ch4;
public class Factorials {
    public static long calcFactorial(int n){
        long product =1; 
        int j= 1;
        while (j<n){
            j++;
            product *= j;
        }
        return product;
        }
    
        public static double calcE(){
            double curE = 1;
            double prevE = 0;
            int i = 1;
            while(curE - prevE > 0.001){
                prevE = curE;
                curE += (1.0 / calcFactorial(i));
                i++; 
                }
                return curE;
            }

            public static double calcEX(int num){
                double curE = 1;
                double prevE = 0;
        
                for(int i = 1; curE - prevE > 0.001; i++){
                    prevE = curE;
                    curE += (Math.pow(num, i) / calcFactorial(i));
                }
        
                return curE;
            }
        

    

    


    public static void main(String [] args){
        Factorials test = new Factorials();
        int n= 1;
        for(n=1; n <= 20; n ++){
            System.out.println(calcFactorial(n));
        }
        System.out.println();
        System.out.printf("\ne = %2.3f \n \n", calcE());
        for(int i = 1; i <= 5; i++){
            System.out.printf("e to the power of %d = %2.3f \n", i, calcEX(i));
        }
        
    }
}