package ch2;
public class Frog {
        private String name;
        private int xPos;
        private int yPos;
        
        public Frog(String n,int x, int y)		// constructor
        {
            name = n;
            xPos=x;
            yPos=y;
            System.out.println(name);
        }
        public void setPos(int x, int y)	// accessor methods
        {
            xPos = x;
            yPos = y;
        }
        public int getXPos()
        {
            return xPos;
        }
        public int getYPos()
        {
            return yPos;
        }
        public void moveWest()		// change the pos of the frog
        {
            xPos = xPos-1;
        }
        public void moveEast()
        {
            xPos = xPos + 1;
        }
        public void moveNorth()
        {
            yPos=yPos+1;
        }
        public void jump(int spaces)
        {
            yPos = spaces + yPos;
            xPos = spaces + xPos;

        }
        //This method should take an integer argument.  This argument controls how many spaces
        // the frog will move both up and right.  Returns no value.
        
        //TODO visit method moves frog to the location of the friend frog

        public void visit(Frog other){
            xPos= other.getXPos();
            yPos = other.getYPos();
        }
        // This method will take an argument of type Frog.  It will find the position of the
        // frog and move to this position.  Returns no value.
        
        public void eatFly()
        {
            System.out.println("Yum");
        }
        public String toString()
        {
            String s = "Hi I am "+ name +" the frog and I live at "+ xPos + " " + yPos;
            return s; 
        }
        
    
        public static void main(String[] args) {
            Frog f1 = new Frog("Freddy",3,4);	// create an instance of Frog
            f1.eatFly();						// call Frog methods
            f1.moveNorth();
            System.out.println(f1);
            
            Frog f2 = new Frog("Francine", -2,0);
            f2.eatFly();
            f2.jump(2);
            f1.visit(f2);
            System.out.println(f1);
            System.out.println(f2);


            Frog f3 = new Frog("Frank", 0, 0);
            f3.jump(2);
            System.out.println(f3);
            f3.visit(f1);
            


            
            // make a new frog named Frank.  have him jump twice and then go visit Freddy.
    
        }
    
    }
    

