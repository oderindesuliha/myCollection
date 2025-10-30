import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class MyBikeTest {

    @Test
    public void testThatBikeCanBeTurnedOff() {
        MyBike bike = new MyBike();
        bike.turnOff();
        assertFalse(bike.power());
    }

    @Test
    public void testThatBikeCanBeTurnedOn() {
        MyBike bike = new MyBike();
        bike.turnOn();
        assertTrue(bike.power());
    }

    @Test
    public void testThatABikeThatIsOnCanBeTurnedOff() {
        MyBike bike = new MyBike();
        bike.turnOn();
        bike.turnOff();
        assertFalse(bike.power());
    }

    @Test
    public void testThatABikeThatIsOffCanBeTurnedOn() {
        MyBike bike = new MyBike();
        bike.turnOff();
        bike.turnOn();
        assertTrue(bike.power());
    }

    @Test
    public void testThatTheBikeHasADefaultSpeed() {
        MyBike bike = new MyBike();
        bike.turnOn();
        assertTrue(bike.power());
        assertEquals(0, bike.currentSpeed());
    }

    @Test
    public void testDefaultGearOfMyBike() {
        MyBike bike = new MyBike();
        bike.turnOn();
        assertTrue(bike.power());
        assertEquals(0, bike.currentSpeed());
        assertEquals(1, bike.currentGear());
    }

    @Test
    public void testThatMyBikeCanBeAcceleratedInGearOne() {
        MyBike bike = new MyBike();
        bike.turnOn();
        assertTrue(bike.power());
        for(int index = 0; index < 20; index++){
            bike.accelerate();
        }
        assertEquals(20, bike.currentSpeed());
    }

    @Test
    public void testThatMyBikeChangesInGearOne() {
        MyBike bike = new MyBike();
        bike.turnOn();
        assertTrue(bike.power());
        assertEquals(0, bike.currentSpeed());
        assertEquals(1, bike.currentGear());
        bike.setSpeed(15);
        bike.accelerate();
        assertEquals(16, bike.currentSpeed());
        assertEquals(1, bike.currentGear());
    }

    @Test
    public void testThatMyBikeChangesSpeedFromGearOneToGearTwo() {
        MyBike bike = new MyBike();
        bike.turnOn();
        assertTrue(bike.power());
        assertEquals(0, bike.currentSpeed());
        assertEquals(1, bike.currentGear());
        bike.setSpeed(20);
            bike.accelerate();
        assertEquals(21, bike.currentSpeed());
       // assertEquals(2, bike.currentGear());


    }

    @Test
    public void testThatMyBikeChangesSpeedInGearTwo() {
        MyBike bike = new MyBike();
        bike.turnOn();
        assertTrue(bike.power());
        assertEquals(0, bike.currentSpeed());
        assertEquals(1, bike.currentGear());
        bike.setSpeed(24);
        bike.accelerate();
        assertEquals(26, bike.currentSpeed());
        assertEquals(2, bike.currentGear());
    }

//    public void testThatMyBikeChangesSpeedFromGearTwoToGearThree() {
//        MyBike bike = new MyBike();
//        bike.turnOn();
//        assertTrue(bike.power());
//        assertEquals(0, bike.currentSpeed());
//        assertEquals(1, bike.currentGear());
//        bike.setSpeed(29);
//        bike.accelerate();
//        assertEquals(23, bike.currentSpeed());
//        assertEquals(2, bike.currentGear());
//
//    }
    @Test
    public void testThatMyBikeChangesSpeedFromGearTwoToGearThree() {
        MyBike bike = new MyBike();
        bike.turnOn();
        assertTrue(bike.power());
        assertEquals(0, bike.currentSpeed());
        assertEquals(1, bike.currentGear());

        bike.setSpeed(21);

        bike.accelerate();

        assertEquals(22, bike.currentSpeed());
        assertEquals(2, bike.currentGear());
    }


//    @Test
//    public void testThatMyBikeCanBeDeceleratedInGearOne() {
//        MyBike bike = new MyBike();
//        bike.turnOn();
//        assertTrue(bike.power());
//        for(int index = 0; index < 14; index++){
//            bike.decelerate();
//        }
//        assertEquals(14, bike.currentSpeed());
//        assertEquals(1, bike.currentGear());
//    }




}