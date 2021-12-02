package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldVolumeMaxIncrease() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolumeForMax();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldVolumeMaxIncreaseCheck() {
        Radio radio = new Radio();
        radio.setCurrentVolume(3);
        radio.increaseVolumeForMax();
        assertEquals(3, radio.getCurrentVolume());
    }

    @Test
    public void shouldVolumeMinDecrease() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolumeForMin();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldVolumeMinDecreaseCheck() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        radio.decreaseVolumeForMin();
        assertEquals(2, radio.getCurrentVolume());
    }

    @Test
    public void shouldVolumeBorderIncrease() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldVolumeHighBorderIncrease() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldVolumeBorderDecrease() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldVolumeBelowBorderDecrease() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldStationMaxIncrease() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.increaseStationForMax();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldStationMaxIncreaseCheck() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.increaseStationForMax();
        assertEquals(3, radio.getCurrentStation());
    }

    @Test
    public void shouldStationMinDecrease() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.decreaseStationForMin();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldStationMinDecreaseCheck() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        radio.decreaseStationForMin();
        assertEquals(2, radio.getCurrentStation());
    }


    @Test
    public void shouldStationBorderIncrease() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.increaseStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldStationHighBorderIncrease() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.increaseStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldStationBorderDecrease() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.decreaseStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldStationBelowBorderDecrease() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.decreaseStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStationHighMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.setCurrentStation(10);
        assertEquals(3, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStationBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);
        radio.setCurrentStation(-1);
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStationNormal() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.setCurrentStation(2);
        assertEquals(2, radio.getCurrentStation());
    }

}
