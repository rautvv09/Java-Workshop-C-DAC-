	package com.dkte;

import java.io.File;
import java.util.Date;
import java.util.Scanner;

/*
Input a path from user. Check if path exists; otherwise raise error.
If path is of a file, show file info (metadata).
If path is of a directory, show its contents.
*/
/*
Java class -- java.io.File -- deals with metadata & file-system ops.
step1 - create File object with given path.
step2 - call various methods on File object e.g.
	- exists() -- boolean
	- mkdir() -- create directory
	- renameTo() -- rename file
	- list() -- show dir contents
	- isFile(), isDirectory() -- boolean -- check type
	- getName(), getParent() -- get file name, get parent dir
	- length() -- file size in bytes
*/

public class FileDemo01Main {
	public static void main(String[] args) {
		// user input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a path: ");
		String path = sc.nextLine();
		// create File obj
		File f = new File(path);
		// do operations/processing
		if(f.exists()) {
			if(f.isFile()) {
				System.out.println("File Name: " + f.getName());
				System.out.println("File Size: " + f.length());
				System.out.println("Last Modified: " + new Date(f.lastModified()));
			}
			else if(f.isDirectory()) {
				System.out.println("Dir Name: " + f.getName());
				String[] files = f.list();
				for (String file : files)
					System.out.println(file);
			}
		}
		else
			System.out.println("Invalid Path.");
	}
}
