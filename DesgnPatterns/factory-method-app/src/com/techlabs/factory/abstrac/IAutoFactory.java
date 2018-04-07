package com.techlabs.factory.abstrac;

public interface IAutoFactory {
	public IAutomobile makeSUV();
	public IAutomobile makeSedan();
	public IAutomobile makeHatchBack();
}
