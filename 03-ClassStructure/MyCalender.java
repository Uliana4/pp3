public class MyCalender {
    static int year = 2023;
    static int month = 4;
    static int day = 9;

    static String myDate(int year, int month, int day){
        String output = String.format("Date: year, month, day");
        return output;
    }

    static int days(int month, int days){
        for(int i=0, i <, i++){
            return i * days;
        }
    }

    static String monthName(int month){
        String[] array={"Ja", "Fe", "Mar", "Apr", "May", "Jn", "Jl", "Ags", "Sept", "Oct", "Nov", "Dcm"};
        for (String a: array){
            if (array[month-1]==a){
                return array[month-1];
            }
        }
        return null;
    }


    public static void myDate(String[] args){
        System.out.println(myDate(year-month-day));
    }
}
