/**
 * Modification History:
 * =============================================================================
 *		Author		Date		Description
 *   ------------ ---------- ---------------------------------------------------
 *		Administrator		2015-6-18
 * =============================================================================
 */

package com.vincent.hong.spring;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;

public class ContextUtil{
	
	private static ApplicationContext context;
	private static Logger log = Logger.getLogger(ContextUtil.class);
	
	public static void setContext(ApplicationContext ctx) {
		context = ctx;
	}
	/**
	 * 获得sping对象
	 * @param id
	 * @return
	 */
	public static Object getBean(String id) {
		Object obj = context.getBean(id);
		if(obj == null) {
			log.info("bean id [ " + id + " ] not found in context path");
		}
		return obj;
	}

}
