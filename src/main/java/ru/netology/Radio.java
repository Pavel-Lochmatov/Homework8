package ru.netology;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int countStations = 10;

    public Radio(int countStations) {
        this.countStations = countStations;
    }

    public Radio() {
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
        return;
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        return;
    }

    public void increaseStation() {
        if (currentStation < countStations - 1) {
            currentStation = currentStation + 1;
        }
        return;
    }

    public void decreaseStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        }
        return;
    }

    public void increaseStationForMax() {
        if (currentStation == countStations - 1) {
            currentStation = 0;
        }
        return;
    }

    public void decreaseStationForMin() {
        if (currentStation == 0) {
            currentStation = countStations - 1;
        }
        return;
    }

    public void increaseVolumeForMax() {
        if (currentVolume == 100) {
            currentVolume = 100;
        }
        return;
    }

    public void decreaseVolumeForMin() {
        if (currentVolume == 0) {
            currentVolume = 0;
        }
        return;
    }

    public void setCurrentStation(int currentStation) {

        if (currentStation > countStations - 1) {
            return;
        }
        if (currentStation < 0) {
            return;
        }

        this.currentStation = currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 100) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }

        this.currentVolume = currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

}
