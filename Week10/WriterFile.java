import java.io.*;
import java.util.*;

class WriterExample{
	public static void main(String[] args){
		try
		{
		Writer writer = new FileWriter(“/home/mec/Jibin/ReaderExample.java”);
		String s = "Alan is a girl";
		writer.write(s);
		writer.close();
		}
		catch(Exception e){
			System.out.print("Exception: " + e);
		}
	}
}
