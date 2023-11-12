public class MyCalender {
    static int year = 2023;
    static int month = 4;
    static int day = 9;

    public static String myDate(){
        return String.format("Date: %04d-%02d-%02d", year, month, day);
    }

    public static int days(){
        int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};
        int passed = 0;
        for (int days=0; days<(month-1); days++){
            passed+=monthDays[days];
        }
        passed+=day;
        return passed;
    }

    public static String monthName(){
        String[] monthName={"Ja", "Fe", "Mar", "Apr", "May", "Jn", "Jl", "Ags", "Sept", "Oct", "Nov", "Dcm"};
        return monthName[month-1];
    }

    public static void main(String[] args) {
        System.out.println(MyCalender.myDate());
        System.out.println(MyCalender.days());
        System.out.println(MyCalender.monthName());
    }

}
