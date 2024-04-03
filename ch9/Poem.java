package ch9;

public class Poem {
private int lines;

public Poem(){
    lines = 0;
}
public Poem(int l){
    lines = l;
    printRhythm();
}

public void printRhythm(){
    System.out.println("Free Verse!");
}

}
