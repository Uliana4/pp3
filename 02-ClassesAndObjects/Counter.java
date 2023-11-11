public class Counter {
    int counter = 0;

    void counterDecreaseOne(){
        counter -= 1;
        System.out.println(counter);
    }
    
    void counterIncreaseOne(){
        counter += 1;
        System.out.println(counter);
    }

    void counterIncreaseTen(){
        counter += 10;
        System.out.println(counter);
    }

    void counterDecreaseTen(){
        counter -= 10;
        System.out.println(counter);
    }

    void reset(){
        counter = 0;
        System.out.println(counter);
    }
}
