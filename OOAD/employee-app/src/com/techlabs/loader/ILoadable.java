package com.techlabs.loader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public interface ILoadable {
	public String loadFile() throws FileNotFoundException, IOException;

}
