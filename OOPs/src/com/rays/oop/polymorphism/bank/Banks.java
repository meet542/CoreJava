package com.rays.oop.polymorphism.bank;

public class Banks {
	
	public String getName() {
		return "RBI Bank";
	}
	
	public double InterestRate() {
		return 11.0;
	}
	
	public static Banks getBanks(int i) {

        if (i == 1) {
            return new AxisBank();
        }

        if (i == 2) {
            return new IciciBank();
        }

        if (i == 3) {
            return new HdfcBank();
        }

        return null;
    }

}
