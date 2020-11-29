/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author mertdemirok
 */
public class TemperatureSensor implements Sensor {

    private boolean sensor;

    @Override
    public boolean isOn() {
        return sensor;
    }

    @Override
    public void setOn() {
        this.sensor = true;
    }

    @Override
    public void setOff() {
        this.sensor = false;
    }

    @Override
    public int read() {
        if (isOn() == false) {
            throw new IllegalStateException("When the method read is called and the sensor should be on");
        }
        return new Random().nextInt(61) - 30;
    }

}
