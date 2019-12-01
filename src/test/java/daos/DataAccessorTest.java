package daos;

import models.Car;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DataAccessorTest {
    Car car = new Car();
    DataAccessor dao = new DataAccessor();

    @Before
    public void setUp(){
        car.setMake("Sentra");
        car.setModel("Nissan");
        car.setColor("Black");
        car.setYear("2012");
        car.setVin("10293857");

    }
    @Test
    public void testCreate(){

        Assert.assertTrue(dao.create(car));

    }
}
