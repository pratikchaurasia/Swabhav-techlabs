package com.techlabs.factory.abstrac.test;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

import com.techlabs.factory.abstrac.IAutoFactory;
import com.techlabs.factory.abstrac.IAutomobile;



public class TestAbstractFactory {
	public static void main(String args[]) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException{
		IAutoFactory factory=readFactoryObject();
		IAutomobile auto=factory.makeHatchBack();
		auto.start();
		auto.stop();
	}
	public static String getName() throws IOException{
		FileReader reader = new FileReader("factory.properties");

		Properties p = new Properties();
		p.load(reader);

		return p.getProperty("factory");
	}
	public static IAutoFactory readFactoryObject() throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException{
		String factory=getName();
		Class<?> cls = Class.forName(factory);
        Method m=cls.getMethod("getInstance");
		IAutoFactory autoFactory=(IAutoFactory )m.invoke(null);
		return autoFactory;
		
	}
}
