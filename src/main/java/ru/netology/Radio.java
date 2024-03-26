package ru.netology;
public class Radio {
    private int currentStation;
    private int currentVolume;


    public Radio(int currentStation) {
        this.currentStation = currentStation;
    }

    public Radio() {

    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void next() {
        if (currentStation < 9) {
            currentStation ++;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation > 0) {
            currentStation --;
        } else {
            currentStation = 9;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int station) {
        if (station >= 0 && station < 10) {
            currentStation = station;
        }
    }

    public void setCurrentVolume(int volume) {
        if (volume >= 0 && volume < 101) {
            currentVolume = volume;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}
