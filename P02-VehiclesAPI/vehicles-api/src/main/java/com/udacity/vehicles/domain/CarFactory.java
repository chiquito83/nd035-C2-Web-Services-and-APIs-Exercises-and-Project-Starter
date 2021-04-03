package com.udacity.vehicles.domain;

import com.udacity.vehicles.domain.AbstractCarFactory;
import com.udacity.vehicles.domain.Condition;
import com.udacity.vehicles.domain.car.Car;
import com.udacity.vehicles.domain.car.Details;
import com.udacity.vehicles.domain.manufacturer.Manufacturer;

public class CarFactory extends AbstractCarFactory {
  @Override
  public Car create() {

    Manufacturer manufacturer = new Manufacturer(100, "Audi");

    Details details = new Details();
    details.setBody("SUV");
    details.setEngine("1500");
    details.setExternalColor("white");
    details.setManufacturer(manufacturer);
    details.setModel("Q3");

    Location location = new Location(27D, 77D);




    Car car = new Car();
    car.setId(1L);
    car.setDetails(details);
    car.setCondition(Condition.NEW);
    car.setLocation(location);

    return car;
  }
}
