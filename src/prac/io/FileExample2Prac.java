package prac.io;

import java.io.File;
import java.util.Calendar;

public class FileExample2Prac {
	// 파일이나 디렉토리 관련 정보 얻기
	public static void main(String[] args) {
		String path = "c:/ezen-academy/temp/some.txt";
		File file = new File(path);
		String fileName = file.getName();
		System.out.println(fileName);
		System.out.println(file.getParent());
		System.out.println(file.getPath());
		
		String path2 = "example1.dat"; // 상대경로
		File file2 = new File(path2);
		System.out.println(file2.getAbsolutePath());
		System.out.println(file2.getPath());
		System.out.println(file2.canRead());
		System.out.println(file2.canWrite());
		System.out.println(file2.canExecute());
		System.out.println(file2.isHidden());
		System.out.println(file2.length());
		System.out.println(file2.exists());
		System.out.println(file2.lastModified());
		
		long ms = file2.lastModified();
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(ms);
		System.out.printf("%1$tF %1$tT \n", calendar);
		
		System.out.println("-------------------------------------");
		dir();
		
		
		
	}
	public static void dir() {
		String path = "c:/users/kjhch";
		
		File file = new File(path);
		File[] list = file.listFiles();
		for (File f : list) {
			if(f.isFile()) {
				System.out.println("     " + f.length() + " " + f.getName());
			}else {
				System.out.println("<DIR>" + "       " + f.getName());
			}
		}
	}

}
