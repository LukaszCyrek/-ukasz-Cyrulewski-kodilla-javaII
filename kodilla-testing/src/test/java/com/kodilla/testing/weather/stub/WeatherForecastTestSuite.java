package com.kodilla.testing.weather.stub;
import com.kodilla.weather.stub.Temperatures;
import com.kodilla.weather.stub.TemperaturesStub;
import com.kodilla.weather.stub.WeatherForecast;
import org.junit.Assert;
import org.junit.Test;

public class WeatherForecastTestSuite {
   @Test
    public void testCalculateForecastWithStub() {
       Temperatures temperatures = new TemperaturesStub();
       WeatherForecast weatherForecast = new WeatherForecast(temperatures);
       int quanityOfSensors = weatherForecast.calculateForecast().size();
       Assert.assertEquals(5, quanityOfSensors);
   }

}
