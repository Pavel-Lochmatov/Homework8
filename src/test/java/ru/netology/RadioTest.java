package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    //проверка увеличения громкости для максимальной если уже максимальная
    public void shouldVolumeMaxIncrease() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolumeForMax();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    //проверка увеличения громкости для максимальной если не максимальная
    public void shouldVolumeMaxIncreaseCheck() {
        Radio radio = new Radio();
        radio.setCurrentVolume(3);
        radio.increaseVolumeForMax();
        assertEquals(3, radio.getCurrentVolume());
    }

    @Test
    //проверка уменьшения громкости для минимальной если уже минимальная
    public void shouldVolumeMinDecrease() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolumeForMin();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    //проверка уменьшения громкости для минимальной если не минимальная
    public void shouldVolumeMinDecreaseCheck() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        radio.decreaseVolumeForMin();
        assertEquals(2, radio.getCurrentVolume());
    }

    @Test
    //проверка увеличения громкости для прегранич значения
    public void shouldVolumeBorderIncrease() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    //проверка увеличения громкости для границы
    public void shouldVolumeHighBorderIncrease() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    //проверка уменьшения громкости для прегранич значения
    public void shouldVolumeBorderDecrease() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    //проверка уменьшения громкости для границы
    public void shouldVolumeBelowBorderDecrease() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    //проверка задания громкости больше максимальной
    public void shouldSetVolumeHighMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(3);
        radio.setCurrentVolume(101);
        assertEquals(3, radio.getCurrentVolume());
    }

    @Test
    //проверка задания громкости меньше минимальной
    public void shouldSetVolumeBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        radio.setCurrentVolume(-1);
        assertEquals(4, radio.getCurrentVolume());
    }


    @Test
//проверка увеличения станции для максимальной если уже максимальная
    public void shouldStationMaxIncrease() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(9);
        radio.increaseStationForMax();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    //проверка увеличения станции для максимальной если не максимальная
    public void shouldStationMaxIncreaseCheck() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(3);
        radio.increaseStationForMax();
        assertEquals(3, radio.getCurrentStation());
    }

    @Test
    //проверка уменьшения станции для минимальной если уже минимальная
    public void shouldStationMinDecrease() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(0);
        radio.decreaseStationForMin();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    //проверка уменьшения станции для минимальной если не минимальная
    public void shouldStationMinDecreaseCheck() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(2);
        radio.decreaseStationForMin();
        assertEquals(2, radio.getCurrentStation());
    }

    @Test
    //проверка увеличения станции для прегранич значения
    public void shouldStationBorderIncrease() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(8);
        radio.increaseStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    //проверка увеличения станции для границы
    public void shouldStationHighBorderIncrease() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(9);
        radio.increaseStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    //проверка уменьшения станции для прегранич значения
    public void shouldStationBorderDecrease() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(1);
        radio.decreaseStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    //проверка уменьшения станции для границы
    public void shouldStationBelowBorderDecrease() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(0);
        radio.decreaseStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    //проверка задания станции больше максимальной
    public void shouldSetStationHighMax() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(3);
        radio.setCurrentStation(20);
        assertEquals(3, radio.getCurrentStation());
    }

    @Test
    //проверка задания станции меньше минимальной
    public void shouldSetStationBelowMin() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(4);
        radio.setCurrentStation(-1);
        assertEquals(4, radio.getCurrentStation());
    }

}
