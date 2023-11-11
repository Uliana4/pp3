public class TestLamps {
    public static void main(String[] args){
        LampsDescribe lamp1 = new LampsDescribe();
        lamp1.lampIsOn = true;

        LampsDescribe lamp2 = new LampsDescribe();
        lamp2.lampIsOn = false;

        lamp1.info();
        lamp1.swithcOnLamp();
        lamp1.info();

        lamp2.info();
        lamp2.switchOffLamp();
        lamp2.info();
    }
}
