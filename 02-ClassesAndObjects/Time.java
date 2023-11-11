public class Time {
    public static void main(String[] args){
        int hour = 19;
        int second = 44;
        int minute = 22;

        System.out.println(hour*360 + minute*60 + second);
        System.out.println((24*360+ 60*60 + 60*60)-(hour*360 + minute*60 +second));
    }
    
}
