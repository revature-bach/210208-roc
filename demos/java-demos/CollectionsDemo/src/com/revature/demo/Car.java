package com.revature.demo;

public class Car implements Comparable<Car> {

	private int year;
	private String make;
	private String model;
	private String engine;

	public Car() {
	}

	public Car(int year, String make, String model, String engine) {
		this.year = year;
		this.make = make;
		this.model = model;
		this.engine = engine;
	}
	
	public int getYear() {
		return this.year;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}
	
	public void setYear(int year) {
		this.year = year;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((engine == null) ? 0 : engine.hashCode());
		result = prime * result + ((make == null) ? 0 : make.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (engine == null) {
			if (other.engine != null)
				return false;
		} else if (!engine.equals(other.engine))
			return false;
		if (make == null) {
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [year=" + year + ", make=" + make + ", model=" + model + ", engine=" + engine + "]";
	}

	@Override
	public int compareTo(Car o) {
		// if < 0, then the object comes before
		// if == 0, then the objects are equally the same order
		// if > 0, then the other object (Car o), comes before this one
		return this.year - o.year;
	}

}
