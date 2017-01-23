import java.io.*;
import java.util.*;

class PropertiesDemo
{
	public static void main(String[] args) throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("f:\\info.txt");

		prop.load(fis);
		prop.setProperty("lisi","250");

		FileOutputStream fos = new FileOutputStream("f:\\info.txt");
		prop.store(fos,"cuole");//用setProperty改完以后建立一个输出流用此方法即可。

		fis.close();
		fos.close();
	}
}
