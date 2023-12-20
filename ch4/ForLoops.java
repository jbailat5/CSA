package ch4;
public class ForLoops {
    public int addEvens(int n){
        int sum = 0;
        for(int x = 2; x<=n; x+=2){
            sum+=x;
        }
        return sum;
    }

    public static void printSquaresBack(int n){
        for (int x = n; x>=2; x--){
            System.out.print(x*x + ", ");
        }
        System.out.print(1);
        System.out.println();
    }

    public static void sillyNumbers(){
        for(int x = 0; x < 3; x++){
            for(int i = 0; i <= 9; i++){
                for(int j = 0; j < 3; j++){
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }

    public static void sillyNumbers2(){
        for(int x = 0; x < 4; x++){
            for(int i = 9; i>=1; i--){
                for(int j=1; j<=i; j++){
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }

    public static void dollarAndStars(){
        for(int x=1; x<=7; x++ ){
            for(int j = 2; j<=x; j++){
                System.out.print("**");
            }
            for(int j= 7; j>=x; j--){
                System.out.print("$");
            }
            for(int j = 14; j>=x*2; j-=2){
                System.out.print("**");
            }
            for(int j = 14; j>=x*2; j-=2){
                System.out.print("$");
            }
            for(int j= 2; j<=x; j++){
                System.out.print("**");
            }
            System.out.println();
                    
        }      
    }


    public static void main(String[] args) {
        ForLoops test = new ForLoops();
        // addEvens
        System.out.println(test.addEvens(5));
        System.out.println(test.addEvens(88));
        System.out.println(test.addEvens(20));
        System.out.println();
        // printSquaresBack
        printSquaresBack(8);
        printSquaresBack(10);
        printSquaresBack(5);
        System.out.println();
        // sillyNumbers
        sillyNumbers();
        System.out.println();
        // sillyNumbers2
        sillyNumbers2();
        System.out.println();
        // dollarAndStars
        dollarAndStars();

    }
}
