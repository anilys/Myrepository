package Myexampls;
import java.io.*;

public class TrycatchExplictcal {

	public static void main(String[] args)
	{
	try{
	String str;
	//opening file in read mode using BufferedReader stream
	BufferedReader br=new BufferedReader(new FileReader("d:\\Result.txt"));   
	while((str=br.readLine())!=null)
	 {
	System.out.println(str);
	 }      
	br.close();	//closing BufferedReader stream
	}catch(IOException ie)
	{  System.out.println("exception");  }
	 }
	}

