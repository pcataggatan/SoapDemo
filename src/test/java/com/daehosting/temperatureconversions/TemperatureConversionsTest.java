package com.daehosting.temperatureconversions;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class TemperatureConversionsTest {
    @Test
    public void getTemperatureConversionsSoap12() throws Exception {
        TemperatureConversionsSoapType service =
                new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal celciusToFahrenheitResult = service.celsiusToFahrenheit(BigDecimal.valueOf(0.0));
        assertEquals("Celcius to Fahrentheit conversion failed", celciusToFahrenheitResult,
                BigDecimal.valueOf(32));

    }


    @Test
    public void fahrenheitToCelcius() throws Exception {
        TemperatureConversionsSoapType service =
                new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal fahrenheitToCelciusResult =
                service.fahrenheitToCelsius(BigDecimal.valueOf(32));
        assertEquals("Celcius to Fahrentheit conversion failed", fahrenheitToCelciusResult,
                BigDecimal.valueOf(0));

    }

    @Test
    public void windchillInCelcius() throws Exception {
        TemperatureConversionsSoapType service =
                new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal windchillInCelciusResult =
                service.windChillInCelsius(BigDecimal.valueOf(10), BigDecimal.valueOf(25));
        assertEquals("Celcius to Fahrentheit conversion failed", windchillInCelciusResult,
                BigDecimal.valueOf(-5.465));

    }

    @Test
    public void windchillInFahrenheit() throws Exception {
        TemperatureConversionsSoapType service =
                new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal windchillInFahrenheitResult =
                service.windChillInFahrenheit(BigDecimal.valueOf(50), BigDecimal.valueOf(25));
        assertEquals("Celcius to Fahrentheit conversion failed", windchillInFahrenheitResult,
                BigDecimal.valueOf(22.163));

    }

}