package com.vincent.hong.util;


/*
 * @(#)AdmUsersManagerImpl.java 2013-07-18 10:32:29
 *
 * Copyright (c) 2013 - Business Intelligence Info. Tech.
 *
 * BeiJing
 * All rights reserved.
 */
import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


/**
 * @author yeshujun
 */
public class ObjectUtil {
	
	
	public final static boolean isBean(Class<?> clazz) {
		boolean isBean = false;
		try {
			BeanInfo bi = Introspector.getBeanInfo(clazz);
			PropertyDescriptor[] props = bi.getPropertyDescriptors();
			for(PropertyDescriptor prop : props){
				if(prop.getReadMethod()!=null && prop.getWriteMethod()!=null){
					isBean = true;
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isBean;
	}
	
	public final static boolean isCollection(Class<?> clazz) {
		return Collection.class.isAssignableFrom(clazz);
	}
	
	public final static boolean isMap(Class<?> clazz) {
		return Map.class.isAssignableFrom(clazz);
	}
	
	public final static boolean isArray(Class<?> clazz) {
		return clazz.isArray();
	}
	
	public final static boolean isPrimitive(Class<?> clazz) {
		return clazz.isPrimitive() || contains(clazz);
	}
	
	/**
	 * Map生成Object
	 * @param clazz
	 * @param map
	 * @return
	 */
	public static Object fromMap(Class<?> clazz,Map<String,Object> map){
		Object obj = copy(map, clazz);
		return obj;
	}

	/**
	 * Object转成Map
	 * @param obj
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static Map<String,Object> toMap(Object obj){
		Map<String,Object> map = new HashMap<String, Object>();
		if(obj == null){
			return null;
		}
        if(obj instanceof Map){
        	map = (Map<String, Object>) obj;
		}else {
			try {
				BeanInfo bi = Introspector.getBeanInfo(obj.getClass());
				PropertyDescriptor[] props = bi.getPropertyDescriptors();
				for(PropertyDescriptor prop : props){
					Method getter = prop.getReadMethod();
					if(getter!=null){
						map.put(prop.getName(), getter.invoke(obj));
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return map;
	}
	
	/**
	 *将orig、target两个对象相同属性的值，从orig copy 到 target 相同的属性
	 * @param orig 源对象
	 * @param target 目标对象
	 * @return
	 */
	 public static Object copy(Object orig,Class<?> targetClazz){
		 Object target = null;
		 try {
			target= targetClazz.newInstance();
			Map<String,Object> om = toMap(orig);
			
			BeanInfo bi = Introspector.getBeanInfo(targetClazz);
			PropertyDescriptor[] props = bi.getPropertyDescriptors();
			for(PropertyDescriptor prop : props){
				Method setter = prop.getWriteMethod();
				if(setter!=null){
					setter.setAccessible(true);
					setter.invoke(target, om.get(prop.getName()));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		 return target;
	 }
	 
	/**
	 * 获得class的属性名称
	 * @param clazz
	 * @return
	 */
	public static List<String> getFieldNames(Class<?> clazz){
		List<String> list = new LinkedList<String>();
		try {
			Map<String,Object> map = toMap(clazz.newInstance());
			for(Entry<String, Object> entry : map.entrySet()) {
				list.add(entry.getKey());
			}
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return list;
	}
	private final static boolean contains(Class<?> clazz){
		
		List<Class<?>> clazzList = new ArrayList<Class<?>>();
		
		clazzList.add(String.class);
		clazzList.add(Integer.class);
		clazzList.add(Long.class);
		clazzList.add(Float.class);
		clazzList.add(Double.class);
		clazzList.add(BigDecimal.class);
		clazzList.add(Number.class);
		clazzList.add(Boolean.class);
		clazzList.add(java.util.Date.class);
		clazzList.add(java.sql.Date.class);
		clazzList.add(java.sql.Timestamp.class);
	
		return clazzList.contains(clazz);
	}
}
