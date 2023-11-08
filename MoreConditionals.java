public class MoreConditionals {


    public static void main(String [] args){
        MoreConditionals mc = new MoreConditionals();
        System.out.println("2000 " + mc.isLeapYear(2000));
        System.out.println("2004 " + mc.isLeapYear(2004));
        System.out.println("2003 " + mc.isLeapYear(2003));
        System.out.println("2100 " + mc.isLeapYear(2100));
    }
    public boolean isLeapYear(int year){
        if (year%4 == 0 && (year%100 !=0 || year%400 == 0)) return true;
        else return false;
    }
    public boolean isSooner(int month1, int day1, int year1)
}
