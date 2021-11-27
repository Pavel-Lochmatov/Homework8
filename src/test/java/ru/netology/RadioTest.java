package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldVolumeMaxIncrease() {
        Radio radio = new Radio();
        radio.currentVolume = 10;
        radio.increaseVolumeForMax();
        assertEquals(10, radio.currentVolume);
    }

    @Test
    public void shouldVolumeMaxIncreaseCheck() {
        Radio radio = new Radio();
        radio.currentVolume = 3;
        radio.increaseVolumeForMax();
        assertEquals(3, radio.currentVolume);
    }

    @Test
    public void shouldVolumeMinDecrease() {
        Radio radio = new Radio();
        radio.currentVolume = 0;
        radio.decreaseVolumeForMin();
        assertEquals(0, radio.currentVolume);
    }

    @Test
    public void shouldVolumeMinDecreaseCheck() {
        Radio radio = new Radio();
        radio.currentVolume = 2;
        radio.decreaseVolumeForMin();
        assertEquals(2, radio.currentVolume);
    }

    @Test
    public void shouldVolumeBorderIncrease() {
        Radio radio = new Radio();
        radio.currentVolume = 9;
        radio.increaseVolume();
        assertEquals(10, radio.currentVolume);
    }

    @Test
    public void shouldVolumeHighBorderIncrease() {
        Radio radio = new Radio();
        radio.currentVolume = 10;
        radio.increaseVolume();
        assertEquals(10, radio.currentVolume);
    }

    @Test
    public void shouldVolumeBorderDecrease() {
        Radio radio = new Radio();
        radio.currentVolume = 1;
        radio.decreaseVolume();
        assertEquals(0, radio.currentVolume);
    }

    @Test
    public void shouldVolumeBelowBorderDecrease() {
        Radio radio = new Radio();
        radio.currentVolume = 0;
        radio.decreaseVolume();
        assertEquals(0, radio.currentVolume);
    }

    @Test
    public void shouldStationMaxIncrease() {
        Radio radio = new Radio();
        radio.currentStation = 9;
        radio.increaseStationForMax();
        assertEquals(0, radio.currentStation);
    }

    @Test
    public void shouldStationMaxIncreaseCheck() {
        Radio radio = new Radio();
        radio.currentStation = 3;
        radio.increaseStationForMax();
        assertEquals(3, radio.currentStation);
    }

    @Test
    public void shouldStationMinDecrease() {
        Radio radio = new Radio();
        radio.currentStation = 0;
        radio.decreaseStationForMin();
        assertEquals(9, radio.currentStation);
    }

    @Test
    public void shouldStationMinDecreaseCheck() {
        Radio radio = new Radio();
        radio.currentStation = 2;
        radio.decreaseStationForMin();
        assertEquals(2, radio.currentStation);
    }


    @Test
    public void shouldStationBorderIncrease() {
        Radio radio = new Radio();
        radio.currentStation = 8;
        radio.increaseStation();
        assertEquals(9, radio.currentStation);
    }

    @Test
    public void shouldStationHighBorderIncrease() {
        Radio radio = new Radio();
        radio.currentStation = 9;
        radio.increaseStation();
        assertEquals(9, radio.currentStation);
    }

    @Test
    public void shouldStationBorderDecrease() {
        Radio radio = new Radio();
        radio.currentStation = 1;
        radio.decreaseStation();
        assertEquals(0, radio.currentStation);
    }

    @Test
    public void shouldStationBelowBorderDecrease() {
        Radio radio = new Radio();
        radio.currentStation = 0;
        radio.decreaseStation();
        assertEquals(0, radio.currentStation);
    }

    @Test
    public void shouldSetStationHighMax() {
        Radio radio = new Radio();
        radio.currentStation = 2;
        radio.setcurrentStation(10);
        assertEquals(2, radio.currentStation);
    }

    @Test
    public void shouldSetStationBelowMin() {
        Radio radio = new Radio();
        radio.currentStation = 3;
        radio.setcurrentStation(-1);
        assertEquals(3, radio.currentStation);
    }

    @Test
    public void shouldSetStationNormal() {
        Radio radio = new Radio();
        radio.currentStation = 6;
        radio.setcurrentStation(1);
        assertEquals(1, radio.currentStation);
    }

}
