package com.vincent.hong.arithmetic;

import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
/**
 * 
 * @author Administrator
 * @info 本工具应用于间隔时间段发送验证码.
 */
public class TimeSpaceTool {
	
	private LinkedHashMap<String,Date> wheelMap = new LinkedHashMap<String,Date>();
	
	public boolean launchBullet(String bullet ,int second) {
		
		synchronized (this) {
			Date now = new Date();
			Iterator<Date> iterator ;
			
			while(true) {
				iterator = wheelMap.values().iterator();
				if(!iterator.hasNext()) {
					break;
				}
				if(iterator.next().getTime() < (now.getTime() - second* 1000 )) {
					iterator.remove();
				}else {
					break;
				}
			}
			if(wheelMap.containsKey(bullet)) {
				return false;
			}
			wheelMap.put(bullet,now);
		}
		return true;
	}
	

}
