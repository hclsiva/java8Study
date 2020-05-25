package edu.study.lambdaexpr;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.stream.Stream;

public class FileOperations {

	public FileOperations() {		
	}
	
	private void listDirectories() {
		File[] directories = new File(".").listFiles(new FileFilter() {			
			@Override
			public boolean accept(File pathname) {
				return pathname.isDirectory();
			}		
		});
		printFiles(directories);
	}
	private void listDirectoriesUsingLambda() {
		File[] directories = new File(".").listFiles(File::isDirectory);
		printFiles(directories);
	}
	private void printFiles(File[] files) {		
		Stream<File> fileStream = Stream.of(files);
		fileStream.forEach(x-> {
			try {
				System.out.println(x.getCanonicalPath());
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
	}
	public static void main(String[] args) {
		FileOperations fileOperations = new FileOperations();		
		System.out.println("Listing Directories without lambda expression");
		System.out.println("---------------------------------------------");
		System.out.println("");
		fileOperations.listDirectories();
		System.out.println("");
		System.out.println("Listing Directories with lambda expression");
		System.out.println("---------------------------------------------");
		System.out.println("");
		fileOperations.listDirectoriesUsingLambda();
		
	}
}
