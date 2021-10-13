package com.training;

import com.training.ifaces.IFunction;

public class TempConverter implements IFunction {

	@Override
	public double apply(double arg) {
		// TODO Auto-generated method stub
		return (5/9)*(arg-32);
	}

}
