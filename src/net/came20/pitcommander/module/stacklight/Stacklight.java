package net.came20.pitcommander.module.stacklight;


import com.pi4j.io.gpio.*;

/**
 * Created by cameronearle on 5/8/17.
 */
public class Stacklight {
    private static Stacklight ourInstance = new Stacklight();
    public static Stacklight getInstance() {
        return ourInstance;
    }

    private final Pin RELAY_0_PIN = RaspiPin.GPIO_00;
    private final Pin RELAY_1_PIN = RaspiPin.GPIO_02;
    private final Pin RELAY_2_PIN = RaspiPin.GPIO_03;
    private final Pin RELAY_3_PIN = RaspiPin.GPIO_04;
    private final Pin RELAY_4_PIN = RaspiPin.GPIO_22;
    private final Pin RELAY_5_PIN = RaspiPin.GPIO_23;
    private final Pin RELAY_6_PIN = RaspiPin.GPIO_24;
    private final Pin RELAY_7_PIN = RaspiPin.GPIO_25;

    private final GpioController gpio;
    private final GpioPinDigitalOutput greenPin;
    private final GpioPinDigitalOutput amberPin;
    private final GpioPinDigitalOutput bluePin;
    private final GpioPinDigitalOutput redPin;

    private boolean greenBlinking = false;
    private boolean amberBlinking = false;
    private boolean blueBlinking = false;
    private boolean redBlinking = false;


    private Stacklight() {
        gpio = GpioFactory.getInstance();
        greenPin = gpio.provisionDigitalOutputPin(RELAY_0_PIN);
        amberPin = gpio.provisionDigitalOutputPin(RELAY_1_PIN);
        bluePin = gpio.provisionDigitalOutputPin(RELAY_2_PIN);
        redPin = gpio.provisionDigitalOutputPin(RELAY_3_PIN);
        greenPin.low();
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {}
        amberPin.low();
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {}
        redPin.low();
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {}
        bluePin.low();
    }

    public void SL_redOn() {
        redPin.blink(0);
        redBlinking = false;
        redPin.high();
    }
    
    public void SL_redOff() {
        redPin.blink(0);
        redBlinking = false;
        redPin.low();
    }
    
    public void SL_redBlink() {
        if (!redBlinking) {
            redPin.blink(500);
            redBlinking = true;
        }
    }
    
    public void SL_redSlowBlink() {
        if (!redBlinking) {
            redPin.blink(1000);
            redBlinking = true;
        }
    }
    
    public void SL_redPulse() {
        redPin.blink(0);
        redBlinking = false;
        redPin.pulse(500);
    }
    
    public void SL_redSlowPulse() {
        redPin.blink(0);
        redBlinking = false;
        redPin.pulse(1000);
    }
    
    //////

    public void SL_blueOn() {
        bluePin.blink(0);
        blueBlinking = false;
        bluePin.high();
    }

    public void SL_blueOff() {
        bluePin.blink(0);
        blueBlinking = false;
        bluePin.low();
    }

    public void SL_blueBlink() {
        if (!blueBlinking) {
            bluePin.blink(500);
            blueBlinking = true;
        }
    }

    public void SL_blueSlowBlink() {
        if (!blueBlinking) {
            bluePin.blink(1000);
            blueBlinking = true;
        }
    }

    public void SL_bluePulse() {
        bluePin.blink(0);
        blueBlinking = false;
        bluePin.pulse(500);
    }

    public void SL_blueSlowPulse() {
        bluePin.blink(0);
        blueBlinking = false;
        bluePin.pulse(1000);
    }
    
    /////

    public void SL_greenOn() {
        greenPin.blink(0);
        greenBlinking = false;
        greenPin.high();
    }

    public void SL_greenOff() {
        greenPin.blink(0);
        greenBlinking = false;
        greenPin.low();
    }

    public void SL_greenBlink() {
        if (!greenBlinking) {
            greenPin.blink(500);
            greenBlinking = true;
        }
    }

    public void SL_greenSlowBlink() {
        if (!greenBlinking) {
            greenPin.blink(1000);
            greenBlinking = true;
        }
    }

    public void SL_greenPulse() {
        greenPin.blink(0);
        greenBlinking = false;
        greenPin.pulse(500);
    }

    public void SL_greenSlowPulse() {
        greenPin.blink(0);
        greenBlinking = false;
        greenPin.pulse(1000);
    }
    
    //////

    public void SL_amberOn() {
        amberPin.blink(0);
        amberBlinking = false;
        amberPin.high();
    }

    public void SL_amberOff() {
        amberPin.blink(0);
        amberBlinking = false;
        amberPin.low();
    }

    public void SL_amberBlink() {
        if (!amberBlinking) {
            amberPin.blink(500);
            amberBlinking = true;
        }
    }

    public void SL_amberSlowBlink() {
        if (!amberBlinking) {
            amberPin.blink(1000);
            amberBlinking = true;
        }
    }

    public void SL_amberPulse() {
        amberPin.blink(0);
        amberBlinking = false;
        amberPin.pulse(500);
    }

    public void SL_amberSlowPulse() {
        amberPin.blink(0);
        amberBlinking = false;
        amberPin.pulse(1000);
    }
}
