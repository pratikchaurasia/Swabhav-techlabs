package com.techlabs.factory.test;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

import com.techlabs.factory.AudiFactory;
import com.techlabs.factory.BMW;
import com.techlabs.factory.BMWFactory;
import com.techlabs.factory.IAutoFactory;
import com.techlabs.factory.IAutomobile;

public class TestFactory {
	public static void main(String args[]) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException{
		IAutoFactory factory=readFactoryObject();
		IAutomobile auto=factory.make();
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
