public class calculator {
    
    public static int range(int x, int y){
        return y-x;
    }

    public static int sumInRange(int x, int y){
        int sum = 0;
        for (int i=x; i<y; i++){
            sum+=i;
        }
        return sum;
    }

    public static double aritMean(int x, int y){
        int sum = 0;
        for (int i=x; i<y; i++){
            sum+=i;
        }
        return sum/range(x, y);
    }

    public static void main(String[] args){
        System.out.println(sumInRange(5, 10));
        System.out.println(aritMean(5, 10));
        System.out.println(range(5, 10));
    }
}
