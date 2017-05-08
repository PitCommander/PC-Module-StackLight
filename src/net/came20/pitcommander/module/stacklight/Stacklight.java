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
    private final Pin RELAY_3_PIN = RaspiPin.GPIO_21;
    private final Pin RELAY_4_PIN = RaspiPin.GPIO_22;
    private final Pin RELAY_5_PIN = RaspiPin.GPIO_23;
    private final Pin RELAY_6_PIN = RaspiPin.GPIO_24;
    private final Pin RELAY_7_PIN = RaspiPin.GPIO_25;

    private final GpioController gpio;
    private final GpioPinDigitalOutput greenPin;
    private final GpioPinDigitalOutput amberPin;
    private final GpioPinDigitalOutput whitePin;
    private final GpioPinDigitalOutput bluePin;
    private final GpioPinDigitalOutput redPin;

    private Stacklight() {
        gpio = GpioFactory.getInstance();
        greenPin = gpio.provisionDigitalOutputPin(RELAY_0_PIN);
        amberPin = gpio.provisionDigitalOutputPin(RELAY_1_PIN);
        whitePin = gpio.provisionDigitalOutputPin(RELAY_2_PIN);
        bluePin = gpio.provisionDigitalOutputPin(RELAY_3_PIN);
        redPin = gpio.provisionDigitalOutputPin(RELAY_4_PIN);
    }
    
    public void SL_redOn() {
        redPin.high();
    }
    
    public void SL_redOff() {
        redPin.low();
    }
    
    public void SL_redBlink() {
        redPin.blink(500);
    }
    
    public void SL_redSlowBlink() {
        redPin.blink(1000);
    }
    
    public void SL_redPulse() {
        redPin.pulse(500);
    }
    
    public void SL_redSlowPulse() {
        redPin.pulse(1000);
    }

    public void SL_blueOn() {
        bluePin.high();
    }

    public void SL_blueOff() {
        bluePin.low();
    }

    public void SL_blueBlink() {
        bluePin.blink(500);
    }

    public void SL_blueSlowBlink() {
        bluePin.blink(1000);
    }

    public void SL_bluePulse() {
        bluePin.pulse(500);
    }

    public void SL_blueSlowPulse() {
        bluePin.pulse(1000);
    }

    public void SL_whiteOn() {
        whitePin.high();
    }

    public void SL_whiteOff() {
        whitePin.low();
    }

    public void SL_whiteBlink() {
        whitePin.blink(500);
    }

    public void SL_whiteSlowBlink() {
        whitePin.blink(1000);
    }

    public void SL_whitePulse() {
        whitePin.pulse(500);
    }

    public void SL_whiteSlowPulse() {
        whitePin.pulse(1000);
    }

    public void SL_amberOn() {
        amberPin.high();
    }

    public void SL_amberOff() {
        amberPin.low();
    }

    public void SL_amberBlink() {
        amberPin.blink(500);
    }

    public void SL_amberSlowBlink() {
        amberPin.blink(1000);
    }

    public void SL_amberPulse() {
        amberPin.pulse(500);
    }

    public void SL_amberSlowPulse() {
        amberPin.pulse(1000);
    }

    public void SL_greenOn() {
        greenPin.high();
    }

    public void SL_greenOff() {
        greenPin.low();
    }

    public void SL_greenBlink() {
        greenPin.blink(500);
    }

    public void SL_greenSlowBlink() {
        greenPin.blink(1000);
    }

    public void SL_greenPulse() {
        greenPin.pulse(500);
    }

    public void SL_greenSlowPulse() {
        greenPin.pulse(1000);
    }
}
