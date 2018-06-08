package com.techlabs.test;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.techlabs.builder.DisplayOrganizationalHeirarchy;
import com.techlabs.builder.EmployeeDTO;
import com.techlabs.builder.OrganizationBuilder;
import com.techlabs.loader.FileLoader;
import com.techlabs.parser.FileParser;

public class TestOrganization {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		OrganizationBuilder app =new OrganizationBuilder(new DisplayOrganizationalHeirarchy(), new FileParser(new FileLoader()));
		app.DisplayHeirarchy();
	}
}
