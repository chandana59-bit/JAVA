package com.tnsif.Exception;
import java.io.FileReader;
import java.io.File;

public class CheckedEx {

	public static void main(String[] args)  {
		
        File fi=new File("abc.txt");
        FileReader fr = new FileReader(fi);
	}

}
