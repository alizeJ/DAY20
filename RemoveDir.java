import java.io.*;

class  RemoveDir
{
	public static void main(String[] args) 
	{
		File dir = new File("f:\\1223");
		removeDir(dir);
	}

	public static void removeDir(File dir)
	{
		File[] files = dir.listFiles();
		for (int x=0; x<files.length; x++)
		{
			if (files[x].isDirectory())
			{
				removeDir(files[x]);
			}
			else
			{
				files[x].delete();
			}
		}
		System.out.println(dir+"::dir::"+dir.delete());
	}
}
