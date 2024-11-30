package JavaIO;

import java.io.*;

public class FileInputStreamDemo {
	void FileInputDemo() throws IOException
	{
		try
		{
			FileInputStream fin=new FileInputStream("FileIn.txt");
			int i =fin.read();
			System.out.print((char)i);
			fin.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println(e);
		}
	}
	void Readchars() throws IOException
	{
		try
		{
			FileInputStream fin=new FileInputStream("FileIn.txt");
			int i=0;
			while((i=fin.read())!=-1)
			{
				System.out.println((char)i);
			}
			fin.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) throws IOException
		{
				FileInputStreamDemo findemo=new FileInputStreamDemo();
				findemo.FileInputDemo();
				findemo.Readchars();

	}

}
