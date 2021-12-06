package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

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
    //проверка увеличения громкости для значения больше максимального
    public void shouldVolumeIncreaseHighMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.increaseVolume();
        assertEquals(1, radio.getCurrentVolume());
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
    //проверка уменьшения громкости для значения меньше минимального
    public void shouldVolumeDecreaseBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
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
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    //проверка увеличения станции для значения больше максимального
    public void shouldStationIncreaseHighMax() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(10);
        radio.increaseStation();
        assertEquals(1, radio.getCurrentStation());
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
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    //проверка уменьшения станции для значения меньше минимального
    public void shouldStationDecreaseBelowMin() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(-1);
        radio.decreaseStation();
        assertEquals(9, radio.getCurrentStation());
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
