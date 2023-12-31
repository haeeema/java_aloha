package Day19.Ex02_Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	public static void main(String[] args) {
		Map map = new HashMap();
		
		map.put(1, new Integer(100));
		map.put("second", "Hello World!!");
		map.put("third", new MyStudent());
		map.put("forth", null);
		
//		Integer i = map.get(1);
		Integer i = (Integer) map.get(1);
		
//		String str = map.get("second");
		String str = (String) map.get("second");
		
		System.out.println(i);
		System.out.println(str);
		System.out.println();
		
		MyStudent st = (MyStudent) map.get("third");
		System.out.println(st);
		System.out.println();
		
		System.out.println(map.get("third"));
		System.out.println(map.get("fourth"));
	}
}
