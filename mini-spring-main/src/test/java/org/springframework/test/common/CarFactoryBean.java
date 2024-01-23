package org.springframework.test.common;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.test.bean.Car;

/**
 * @author Gws.

 */
public class CarFactoryBean implements FactoryBean<Car> {

	private String brand;

	@Override
	public Car getObject() throws Exception {
		Car car = new Car();
		car.setBrand(brand);
		return car;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
}
