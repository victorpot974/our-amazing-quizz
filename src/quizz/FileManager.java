// General object to manipulate files (read, write, create)


package quizz;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

public class FileManager {
	
	public static void createFile(String filepath) {
		// Creates a new file at the specified path if file doesn't already exist.
		try {
			File file = new File(filepath);
			
			if (file.createNewFile()) {
				//System.out.println(filepath + " has successfully been created.");
			}
			else {
				System.out.println(filepath + " already exists!");
			}
		}
		
		catch (IOException e) {
			System.out.println("Error: file couldn't be created");
			e.printStackTrace();
		}
		
	}
	
	
	public static void createFile(String filepath, String fileExtension) {
		// Creates a new file at the specified path if file doesn't already exist.
		try {
			String completeFilename = filepath + "." + fileExtension;
			File file = new File(completeFilename);
			
			if (file.createNewFile()) {
				// System.out.println(completeFilename + " has successfully been created.");
			}
			else {
				System.out.println(completeFilename + " already exists!");
			}
		}
		
		catch (IOException e) {
			System.out.println("Error: file couldn't be created");
			e.printStackTrace();
		}
		
	}
	
	
	public static File[] lsDirectory(String directoryPath) {
		File directory = new File(directoryPath);
		// System.out.println(directory.getAbsolutePath());
		if (directory.exists() && directory.isDirectory()) {
			return directory.listFiles();
		}
		
		else {
			System.out.println("Error: " + directoryPath + " is not an existing directory.");
			System.out.println("lsDirectory(" + directoryPath + ") will therefore return an empty array.");
			return null;
		}
	}
	
	
	public static String readFile(String filepath) {
		// Returns the content of a file as a string
		// WARNING: special characters such as \n (=new line) may not be recognized!!!
		String fileContent = "";
		try {
			File file = new File(filepath);
			Scanner reader = new Scanner(file);
			while (reader.hasNextLine()) {
				String line = reader.nextLine();
				System.out.println(line);
				fileContent += line;
			}
			reader.close();
		}
		
		catch (IOException e) {
			System.out.println("Error: file couldn't be created");
			e.printStackTrace();
		}
		return fileContent;
	}
	
	
	public static String readFile(String filepath, boolean includeLines) {
		// Returns the content of a file as a string
		// WARNING: special characters such as \n (=new line) may not be recognized!!!
		String fileContent = "";
		String line;
		try {
			File file = new File(filepath);

			Scanner reader = new Scanner(file);
			while (reader.hasNextLine()) {
				if (includeLines)	{
					line = reader.next();
				}
				
				else {
					line = reader.nextLine();
				}
				// System.out.println(line);
				fileContent += line;
			}
			reader.close();
		}
		
		catch (IOException e) {
			System.out.println("Error: file couldn't be created");
			e.printStackTrace();
		}
		return fileContent;
	}
	
	
	
	
	public static String clearTxtExtension(String originalFilename) {
		if (originalFilename.length() < 5) {
			return originalFilename;
		}
		
		String formattedName = "";

		for (int i =0; i < originalFilename.length() - 4; i++) {
			formattedName += originalFilename.charAt(i);
		}
		return formattedName;
	}
	
	
	public static void writeFile(String filepath, String content) {
		// Writes the specified string in the file
		// WARNING: writing in a non-empty file deletes all its previous content!!!
		try {
			FileWriter writer = new FileWriter(filepath);
			writer.write(content);
			writer.close();
		}
		
		catch (IOException e) {
			System.out.println("Error: couldn't write on file");
			e.printStackTrace();
		}
	}
	
	
	public static void writeFile(String filepath, String content, boolean shouldAppend) {
		// Adds an option to add the content at the end of the file without having to delete all the previous file content.
		try {
			FileWriter writer = new FileWriter(filepath);
			if (shouldAppend) {
				writer.append(content);
			}
			else {
				writer.write(content);
			}
			writer.close();
		}
		
		catch (IOException e) {
			System.out.println("Error: couldn't write on file");
			e.printStackTrace();
		}
	}
	
}

