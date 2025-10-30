import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyACTest {

    @Test
    public void testThatMyAcIsOn() {
        MyAC airConditioner = new MyAC();
        airConditioner.isOn();
        assertTrue(airConditioner.isPower());
    }

    @Test
    public void testThatMyAcIsOff() {
        MyAC airConditioner = new MyAC();
        airConditioner.isOff();
        assertFalse(airConditioner.isPower());
    }

    @Test
    public void testThatAirConditionerCanBeTurnedOffAfterTurningOn() {
        MyAC airConditioner = new MyAC();
        airConditioner.isOff();
        airConditioner.isOn();
        airConditioner.isOff();
        assertFalse(airConditioner.isPower());
    }

    @Test
    public void testThatAirConditionerCanBeTurnedOnAfterTurningOff() {
        MyAC airConditioner = new MyAC();
        airConditioner.isOff();
        airConditioner.isOn();
        assertTrue(airConditioner.isPower());
    }

    @Test
    public void testTheDefaultTemperatureOfAirConditioner() {
        MyAC airConditioner = new MyAC();
        airConditioner.isOn();
        assertTrue(airConditioner.isPower());
        assertEquals(25, airConditioner.currentTemperature());

    }

    @Test
    public void testThatAirConditionerTemperatureCanBeIncreased() {
        MyAC airConditioner = new MyAC();
        airConditioner.isOn();
        assertTrue(airConditioner.isPower());
        airConditioner.increaseTemperature();
        assertEquals(24, airConditioner.currentTemperature());
    }

    @Test
    public void testThatAirConditionerTemperatureCanBeDecreased() {
        MyAC airConditioner = new MyAC();
        airConditioner.isOn();
        assertTrue(airConditioner.isPower());
        airConditioner.decreaseTemperature();
        assertEquals(26, airConditioner.currentTemperature());
    }

    @Test
    public void testThatWhenAirConditionerTemperatureRemains16WhenIncreasedBeyond16() {
        MyAC airConditioner = new MyAC();
        airConditioner.isOn();
        assertTrue(airConditioner.isPower());
        assertEquals(16, airConditioner.increaseTemperature());
    }

    @Test
    public void testThatWhenAirConditionerTemperatureRemains30WhenDecreasedBeyond30() {
        MyAC airConditioner = new MyAC();
        airConditioner.isOn();
        assertTrue(airConditioner.isPower());
        assertEquals(30, airConditioner.decreaseTemperature());
    }

    @Test
    public void testThatACDoesNotIncreaseOrIncreaseWhenPowerIsOff() {
        MyAC airConditioner = new MyAC();
        airConditioner.isOff();
        assertFalse(airConditioner.isPower());
        IllegalArgumentException response = assertThrows(IllegalArgumentException.class, () -> {airConditioner.increaseTemperature();});
        assertEquals("Power is off", response.getMessage());
    }

    @Test
    public void testThatACDoesNotIncreaseOrDecreaseWhenPowerIsOff() {
        MyAC airConditioner = new MyAC();
        airConditioner.isOff();
        assertFalse(airConditioner.isPower());
        IllegalArgumentException response = assertThrows(IllegalArgumentException.class, () -> {airConditioner.decreaseTemperature();});
        assertEquals("Power is off", response.getMessage());
    }

}
