package Day20.Recap;

import java.io.InputStream;
import java.io.PrintStream;

public class SystemInOut3 {
	public static void main(String[] args) throws Exception {
		InputStream inputStream = System.in;
		PrintStream printStream = System.out;
		// 콘솔로 무자열을 출력하기 위해서 PrintStream 객체를 얻는다.
		
		byte[] datas = new byte[100];
		
		System.out.println("Name : ");
		int nameLen = inputStream.read(datas);
		String name = new String(datas, 0, nameLen - 2);
		
		System.out.println("Comment : ");
		int commLen = inputStream.read(datas);
		System.out.println("datas : " + datas);
		System.out.println("commLen : " + commLen);
		System.out.println();
		String comment = new String(datas, 0, commLen - 2);
		
		printStream.println("Input name : " + name);
		printStream.println("Input comment : " + comment);
	}
}
