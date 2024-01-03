package ch4;

public class AdvancedForLoops {

    public static void eights(){
        for (int x = 8; x>0; x-=2){
            for (int y = 0; y < 8 - x; y+=2){
                System.out.print(" ");  
            }
            for (int z=0; z<x; z++){
                System.out.print(x);
            }
            System.out.println();
        }
            
    }
    
    public static void alternate(int num){
        for(int i = 1; i <= num; i++){
            for(int j = 1; i % 2 != 0 && j <= i; j++){
                System.out.print(j);
            }
            for(int k = i; i % 2 == 0 && k > 0; k--){
                System.out.print(k);
            }
            System.out.println();
        }
    }

    public static void isosceles(int num){
        for(int i = 1; i <= num; i++){
            for(int c = 0; c < num - i; c++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            for(int k = i - 1; k > 0; k--){
                System.out.print(k);
            }
            System.out.println();
        }
    }

    public static void upSideDown(int num1, int num2){
        for(int i = 0; i <= num1 - num2; i++){
            for(int c = 0; c < i; c++){
                System.out.print(" ");
            }
            for(int j = num1 - i; j >= num2; j--){
                System.out.print(j);
            }
            for(int k = num2 + 1; k <= num1 - i; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }

            

    public static void main(String[] args) {
        // Eights
        eights();

        System.out.println();

        // Alternate
        alternate(5);
        alternate(8);
        alternate(9);

        System.out.println();

        // Isosceles
        isosceles(4);
        isosceles(6);
        isosceles(7);

        System.out.println();

        // upSideDown
        upSideDown(9, 5);
        upSideDown(8, 6);
        upSideDown(8, 1);
    }
}
