import java.io.*;
import java.util.*;

class ReaderExample{
	public static void main(String[] args){
		try
		{
		Reader reader = new FileReader(“/home/mec/Jibin/ReaderExample.java”);
		char ch;
		ch = reader.read();
		while(ch)
		{
			System.out.print(ch);
			ch = reader.read();
		}
		reader.close();
		}
		catch(Exception e){
			System.out.print("Exception: " + e);
		}
	}
}
