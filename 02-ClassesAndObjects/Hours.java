public class Hours {
    public static void main(String[] args){
        int hours_passed = 14;
        int minutes_passed = 27;
        int minutes_passed_total = hours_passed*60 + minutes_passed;
        int seconds_passed_total = hours_passed*3600 + minutes_passed*60;

        System.out.printf("hours = " + hours_passed + "\nminutes = " + minutes_passed + "\ntime: " + hours_passed + ":" + minutes_passed + "\nminutes from midnight: " + minutes_passed_total + "\nseconds from midnight: " + seconds_passed_total);
    }
}
