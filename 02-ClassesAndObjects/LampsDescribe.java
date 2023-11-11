public class LampsDescribe {
    boolean lampIsOn;

    void swithcOnLamp(){
        if (lampIsOn != true){
            lampIsOn = true;
        } 
    }
    
    void switchOffLamp(){
        if (lampIsOn = true){
            lampIsOn = false;
        }
    }

    void info(){
        String switchStatus = (lampIsOn) ? "Lamp is already on" : "Lamp has been swithed off";
        System.out.println(switchStatus);
    }
}
