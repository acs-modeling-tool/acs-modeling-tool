package org.eclipse.papyrus.acs.documentation.internal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

import org.eclipse.papyrus.acs.validation.Utils;
import org.eclipse.papyrus.acs.validation.Constraints.Functions.ConstraintInterface;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.papyrus.acs.documentation.Activator;
import org.osgi.framework.Bundle;


public final class DocumentationGenerator {

	final private static String fullDocumentationPath = "/documentation/full.md";
	final private static String QuickstartPath = "/documentation/quick.md";

	public static String generateFullDocumentation() {
		String first = readFromPath(fullDocumentationPath);
		StringBuilder stringbuilder = new StringBuilder();
		stringbuilder.append(first);
    	stringbuilder.append(System.lineSeparator());

		for (ConstraintInterface con : Utils.constraintInterfaces) {
			stringbuilder.append("### ");
			stringbuilder.append(con.getErrorMSG(null) + System.lineSeparator());
			stringbuilder.append(con.getRationale() + System.lineSeparator());
			stringbuilder.append("Applies to: " + System.lineSeparator());	
			for (Class<?> clazz : Utils.structure_elements_interface)
				if (con.appliesTo().contains(clazz))
					stringbuilder.append(clazz.getSimpleName() + System.lineSeparator());
	    	stringbuilder.append(System.lineSeparator() + System.lineSeparator());
		}
		return stringbuilder.toString();
	}
	
	public static String generateQuickStartDocumentation() {
		return readFromPath(QuickstartPath);
	}
	
	//Get string from path relative to this
	private static String readFromPath(String path) {
		Bundle bundle = Platform.getBundle(Activator.PLUGIN_ID);
		URL url = FileLocator.find(bundle, new Path(path), null);
		URL fileUrl = null;
		try {
			fileUrl = FileLocator.toFileURL(url);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		File file = new File(fileUrl.getFile());
		try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
		    String line = reader.readLine();
		    StringBuilder stringbuilder = new StringBuilder();

		    while (line != null) {
		    	stringbuilder.append(line);
		    	stringbuilder.append(System.lineSeparator());
		        line = reader.readLine();
		    }
		    return stringbuilder.toString();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "Could not read: " + path;
	}
	
}
