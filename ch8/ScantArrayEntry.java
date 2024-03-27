package ch8;

public class ScantArrayEntry {
    /* the row and column index for this entry in the Scant Array*/
    private int row;
    private int column;

    /* value of the entry*/
    private int value;

    /* Constructor */
    public ScantArrayEntry(int r, int c, int v){
        row = r;
        column = c;
        value = v;
    }

    /* Accessors */
    public int getRow(){return row;}

    public int getColumn() {return column;}

    public int getValue() { return value;}
}