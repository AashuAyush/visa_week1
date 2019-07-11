package com.visa.prj.client;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import com.visa.prj.entity.Product;

public class ObjectToMap {

	public static void main(String[] args) {
		Product p = new Product(540,"iPhone",139000.00,"mobile",500);
//		Map<String, Object> info = storeInfo(p);	
//		System.out.println(info);
//		}
//		
//	static Map<String, Object> storeInfo(Object o){
//		Map <String, Object> map = new HashMap <String, Object>();
//		
//		Class clazz = o.getClass();
//		Method[] methods = clazz.getMethods();//getDeclaredMethods
//		for (Method m : methods) {
//			if (m.getName().startsWith("get")) {
//				try {
//					Object ret = m.invoke(o);
//					map.put(m.getName().substring(3), ret);
//				}catch(Exception ex){
//					ex.printStackTrace();
//				}
//			}
//		}
//		
	}

}
