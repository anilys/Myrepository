package Myexampls;
import java.io.*;

public class TryCatch {
	
	public static void main(String[] args)
	{
	try(BufferedReader br=new BufferedReader(new FileReader("D:\\ Result.txt")))
	{
	String str;
	while((str=br.readLine())!=null)
	{
	System.out.println(str);
	}
	}catch(IOException ie)
	{  System.out.println("exception");  }
	}
	}


