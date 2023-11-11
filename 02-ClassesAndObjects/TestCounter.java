public class TestCounter {
    public static void main(String[] args){
        Counter cn = new Counter();
        Counter cn2 = new Counter();

        cn.counterIncreaseOne();
        cn.counterIncreaseOne();
        cn.counterIncreaseOne();
        cn.counterIncreaseTen();
        cn.counterIncreaseTen();

        cn2.counterDecreaseOne();
        cn2.counterDecreaseOne();
        cn2.counterDecreaseOne();
        cn2.counterDecreaseOne();
        cn2.counterDecreaseOne();
        cn2.counterDecreaseOne();
        cn2.counterDecreaseOne();
        cn2.counterDecreaseTen();
        cn2.counterDecreaseTen();
        cn2.counterDecreaseTen();
        cn2.counterDecreaseTen();
    }
}
