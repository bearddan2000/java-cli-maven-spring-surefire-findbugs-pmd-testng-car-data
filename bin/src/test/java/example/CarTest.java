package example;

import org.apache.logging.log4j.Logger;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.*;

// @RunWith attaches a runner with the test class to initialize the test data
public class CarTest {

    private Logger logger;

    example.service.CarService service;

    @BeforeTest
    public void before()
    {
       service = new example.service.CarServiceImpl();
    }

    @Test
    public void createCar_getPrice() {
      example.model.Car o = service.createCar();
      double expected = 0;
      Assert.assertEquals(o.getPrice(), expected);
    }

    @Test
    public void createCar_getYear() {
      example.model.Car o = service.createCar();
      int expected = 0;
      Assert.assertEquals(o.getYear(), expected);
    }

    @Test
    public void createCar_getMake() {
      example.model.Car o = service.createCar();
      String expected = "test";
      Assert.assertEquals(o.getMake(), expected);
    }

    @Test
    public void createCar_getModel() {
      example.model.Car o = service.createCar();
      String expected = "test";
      Assert.assertEquals(o.getModel(), expected);
    }

    @Test
    public void createCar_objectNotNull() {
      example.model.Car o = service.createCar();
      Assert.assertNotNull(o);
    }

    @Test
    public void createRandomCar_objectNotNull() {
      example.model.Car o = service.createRandomCar();
      Assert.assertNotNull(o);
    }

    @Test
    public void findAll_sizeIsThree() {
      List<example.model.Car> lst = service.findAll();
      int expected = 3;
      Assert.assertEquals(lst.size(), expected);
    }

    @Test
    public void addCar_sizeIsFour() {
      List<example.model.Car> lst = service.addCar();
      int expected = 4;
      Assert.assertEquals(lst.size(), expected);
    }

    @Test
    public void deleteCar_sizeIsTwo() {
      List<example.model.Car> lst = service.deleteCar();
      int expected = 2;
      Assert.assertEquals(lst.size(), expected);
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

}
