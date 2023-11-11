public class Height{
    public static void main(String[] args){
    int height = 164;
    int height_in_feets = (int)(height/30.48);
    int height_in_inches = (int)(height%30.48/2.54);
    System.out.println("I am " + height +"cm tall, i.e. " + height_in_feets + " feet and " + height_in_inches + " inches.");
    }

}