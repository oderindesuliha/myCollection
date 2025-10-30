public class MyBike {
private boolean power;
private int speed;
private int gear;

    public void turnOff() {
        power = false;
    }

    public void turnOn() {
        power = true;
        speed = 0;
        gear = 1;
    }

    public boolean power() {
        return power;
    }

    public int currentSpeed() {
        return speed;
    }

    public int currentGear() {
        return gear;
    }

    public void accelerate() {
        if(!power)
            if (speed >= 0 && speed <= 20){
                speed++;
                gear = 1;
            }else if (speed >= 21 && speed <= 30){
                speed += 2;
                gear = 2;
            }else if (speed >= 31 && speed <= 40){
                speed += 3;
                gear = 3;
            }else{ speed += 4;
                gear = 4;

        }

    }

    public void setSpeed(int speedCount) {
        speed = speedCount;
        if(speed <= 20){
            gear = 1;
        }else if (speed <= 30){
            gear = 2;
        }else if (speed <= 40){}
    }
    }

//    public void decelerate() {
//        if(power) {
//            if (speed >= 0 && speed <= 20){
//                speed -= 1;
//
//            }else if (speed >= 21 && speed <= 30){
//                speed -= 2;
//            }else if (speed >= 31 && speed <= 40){
//                speed -= 3;
//            }else{ speed -= 4;       }
//
//        }


