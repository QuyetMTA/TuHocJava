package chap07.Collection;

import java.util.*;

public class CollectionMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		treeMap();
	}
	
	public static void hashMap() {
		Map mapObj = new HashMap();
		mapObj.put("NV01", "Đặng Văn Quyết");
		mapObj.put("NV02", "Đặng Văn Quân");
		mapObj.put("NV03", "Đặng Văn Linh");
		mapObj.put("NV04", "Nguyễn Văn Lam");
		mapObj.put("NV05", "Phan Văn Nam");
		mapObj.put("NV05", "Phan Văn Khánh"); // lấy value của key cuối cùng nếu key giống nhau
		
		System.out.println(mapObj.toString());
		
		Iterator itr = mapObj.keySet().iterator();
		while (itr.hasNext()) {
			Object key = itr.next();
			Object value = mapObj.get(key);
			System.out.println(key + ": "+value);
			
		}
	}
	
	public static void linkedHashMap() {
		Map mapObj = new LinkedHashMap();
		mapObj.put("NV01", "Đặng Văn Quyết");
		mapObj.put("NV02", "Đặng Văn Quân");
		mapObj.put("NV03", "Đặng Văn Linh");
		mapObj.put("NV04", "Nguyễn Văn Lam");
		mapObj.put("NV05", "Phan Văn Nam");
		mapObj.put("NV05", "Phan Văn Khánh"); // lấy value của key cuối cùng nếu key giống nhau
		
		System.out.println(mapObj.toString());
		
		Iterator itr = mapObj.keySet().iterator();
		while (itr.hasNext()) {
			Object key = itr.next();
			Object value = mapObj.get(key);
			System.out.println(key + ": "+value);
			
		}
	}

	public static void treeMap() {
		Map mapObj = new TreeMap();
		mapObj.put("NV01", "Đặng Văn Quyết");
		mapObj.put("NV04", "Đặng Văn Quân");
		mapObj.put("NV03", "Đặng Văn Linh");
		mapObj.put("NV02", "Nguyễn Văn Lam");
		mapObj.put("NV05", "Phan Văn Nam");
		mapObj.put("NV05", "Phan Văn Khánh"); // lấy value của key cuối cùng nếu key giống nhau
		
		System.out.println(mapObj.toString());
		
		Iterator itr = mapObj.keySet().iterator();
		while (itr.hasNext()) {
			Object key = itr.next();
			Object value = mapObj.get(key);
			System.out.println(key + ": "+value);
			
		}
	}
}
