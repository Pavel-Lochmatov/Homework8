package ru.netology;

public class Radio {
  private  int currentStation;
  private  int currentVolume;

        public void increaseVolume() {
        if (currentVolume < 10) {
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
        if (currentStation < 9) {
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
        if (currentStation == 9) {
            currentStation = 0;
        }
        return;
    }

    public void decreaseStationForMin() {
        if (currentStation == 0) {
            currentStation = 9;
        }
        return;
    }

    public void increaseVolumeForMax() {
        if (currentVolume == 10) {
            currentVolume = 10;
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

        if (currentStation > 9) {
            return;
        }
        if (currentStation < 0) {
            return;
        }

        this.currentStation = currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

}
