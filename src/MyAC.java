public class MyAC {
    private boolean power;
    private int temperature = 25;


    public void isOn() {
        temperature = 25;
        power = true;
    }

    public void isOff() {
        power = false;
    }

    public boolean isPower() {
        return power;
    }

    public int currentTemperature() {
        return temperature;
    }

    public int increaseTemperature() {
        if(power ==false) {
            throw new IllegalArgumentException("Power is off");
        }
        if (temperature > 16) {
            temperature--;
        } else temperature = 16;
        return 16;
    }

    public int decreaseTemperature() {
        if(power ==false) {
            throw new IllegalArgumentException("Power is off");
        }
        if (temperature < 30) {
            temperature++;
        } else temperature = 30;
        return 30;
    }


}