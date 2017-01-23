import java.io.*;


class  FileDemo2
{
	public static void main(String[] args) 
	{
		/*
		File dir = new File("f:\\");
		File[] files = dir.listFiles();
		for (File f: files)
		{
			sop(f.getName()+"..."+f.length());
		}
		*/

		FileDemo_2();
	}

	public static void FileDemo_2()
	{
		File dir = new File("F:\\Java ДњТы\\day18");
		String[] arr = dir.list(new FilenameFilter()
		{
			public boolean accept(File e, String name)
			{
				return name.endsWith(".java");
			}
		});

		for (String st: arr )
		{
			sop(st);
		}

	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
