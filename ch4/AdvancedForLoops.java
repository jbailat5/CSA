package ch4;

public class AdvancedForLoops {

    public void eights(){
        for (int x = 8; x>0; x-=2){
            for (int y = 6; y>=x; y--){
                System.out.print(" ");  
            }
            for (int z=1; z<x+1; z++){
                // System.out.print();
            // for (int j=1; j <=z; j++){
                    System.out.print(x);
                // }
                
                }
            System.out.println();
                }
                
            }

    public static void main(String[] args) {
        AdvancedForLoops test = new AdvancedForLoops();
        test.eights();
    }
}
