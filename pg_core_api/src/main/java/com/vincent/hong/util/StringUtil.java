package com.vincent.hong.util;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author cmt
 *
 */
public class StringUtil {
	private static final DateFormat DF=new SimpleDateFormat("yyyyMMddHHmmss");
	
	/**
	 * 判断字符串是否为空
	 * @param str
	 * @return 非空:true , 空:false
	 */
	public static boolean isNotEmpty(String str) {
		if(str != null && !"".equals(str.trim()))
			return true;
		else
			return false;
	} 
	
	/**
	 * 判断字符串是否为空
	 * @param str
	 * @return   非空:false , 空:true
	 */
	public static boolean isEmpty(final String value) {
		return value == null || value.trim().length() == 0
				|| "null".endsWith(value);
	}
	
	/**
	 * 判断传入参数,如果是Null或者空值，返回false，不为空返回true
	 * @author cmt
	 * @param checkAll   True:所有的为空才返回,False:只要有一个为空返回
	 * @param strings  
	 * @return  boolean
	 */
	public static Boolean checkNull(Boolean checkAll,Object ...objects ){
		Boolean ret=true;
		if (objects==null) return false;
		for (Object s : objects) {
			if (s==null || s.toString().trim().equals("")){
				if (!checkAll) 
					return false;
				else {
					ret= false;
				}
			}
		}
		return ret;
	}
	
	
	/**
	 * 判断object是否为空
	 * @param object
	 * @return   非空:false , 空:true
	 */
	public static boolean isNull(Object object) {
		if (object instanceof String) {
			return StringUtil.isEmpty(object.toString());
		}
		return object == null;
	}
	
	
	public static String null2String(Object obj) {
		return obj == null ? "" : obj.toString();
	}

	
	public static String null2String(String str) {
		return str == null ? "" : str;
	}

	/**
	 * 给String填充字符char
	 * @param value  len  fillValue
	 */
	public static String fillValue(String value, int len, char fillValue) {
		String str = (value == null) ? "" : value.trim();
		StringBuffer result = new StringBuffer();
		result.append(str);
		int paramLen = str.length();
		if (paramLen < len) {
			for (int i = 0; i < len - paramLen; i++) {
				result.append(fillValue);
			}
		}
		return result.toString();
	}

	/**
	 * 在value后变插入count次appendValue
	 */
	public static String appendValue(String value, int count, String appendValue) {
		if (count < 1) {
			return value;
		}
		StringBuffer result = new StringBuffer();
		result.append(value);
		for (int i = 0; i < count; i++) {
			result.append(appendValue);
		}
		return result.toString();
	}

	/**
	 * 给字符串填充字符
	 */
	public static String beforFillValue(String value, int len, char fillValue) {
		String str = (value == null) ? "" : value.trim();
		StringBuffer result = new StringBuffer();
		int paramLen = str.length();
		if (paramLen < len) {
			for (int i = 0; i < len - paramLen; i++) {
				result.append(fillValue);
			}
		}
		result.append(str);
		return result.toString();
	}

	/**
	 * 格式化金预
	 */
	public static String convertAmount(String amount) {
		String str = String.valueOf(Double.parseDouble(amount));
		int pos = str.indexOf(".");
		int len = str.length();
		if (len - pos < 3) {
			return str.substring(0, pos + 2) + "0";
		} else {
			return str.substring(0, pos + 3);
		}
	}

	/**
	 * @param currency 金额字符串
	 * @return String ￥90.03
	 * @see 注: 此方法会保留小数位2位,会四舍五入
	 */
	public static String formatCurrency(String currency) {
		if ((null == currency) || "".equals(currency)
				|| "null".equals(currency)) {
			return "";
		}

		NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
		try {
			return usFormat.format(Double.parseDouble(currency));
		} catch (Exception e) {
			return "";
		}
	}

	/**
	 * 根据separator拆分text
	 */
	public static String[] split(String text, String separator) {
		return split(text, separator, -1);
	}

	public static String[] split(String str, String separator, int max) {
		StringTokenizer tok = null;
		if (separator == null) {
			tok = new StringTokenizer(str);
		} else {
			tok = new StringTokenizer(str, separator);
		}

		int listSize = tok.countTokens();
		if (max > 0 && listSize > max) {
			listSize = max;
		}

		String[] list = new String[listSize];
		int i = 0;
		int lastTokenBegin = 0;
		int lastTokenEnd = 0;
		while (tok.hasMoreTokens()) {
			if (max > 0 && i == listSize - 1) {
				String endToken = tok.nextToken();
				lastTokenBegin = str.indexOf(endToken, lastTokenEnd);
				list[i] = str.substring(lastTokenBegin);
				break;
			}
			list[i] = tok.nextToken();
			lastTokenBegin = str.indexOf(list[i], lastTokenEnd);
			lastTokenEnd = lastTokenBegin + list[i].length();
			i++;
		}
		return list;
	}

	public static String replace(String text, String repl, String with) {
		return replace(text, repl, with, -1);
	}

	private static String replace(String text, String repl, String with, int max) {
		if (text == null) {
			return null;
		}
		StringBuffer buf = new StringBuffer(text.length());
		int start = 0;
		int end = text.indexOf(repl, start);
		while (end != -1) {
			buf.append(text.substring(start, end)).append(with);
			start = end + repl.length();

			if (--max == 0) {
				break;
			}
			end = text.indexOf(repl, start);
		}
		buf.append(text.substring(start));
		return buf.toString();
	}

	public static String first2Upper(String str) {
		return str.substring(0, 1).toUpperCase() + str.substring(1);
	}

	/**
	 * 
	 * @param Object[]
	 *            input: Object[]: String[] result={"TYHR0001","TYHR0002"}
	 *            delim: "," output: "'TYHR0001','TYHR0002'"
	 * 
	 * @param Object[]
	 * @return String
	 */
	public static String arrayToDelimitedString(Object[] arr, String delim) {

		if (arr == null || arr.length == 0) {
			return "";
		}
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < arr.length; i++) {
			if (i > 0) {
				sb.append(delim);
			}
			sb.append('\'');
			sb.append(arr[i]);
			sb.append('\'');
		}
		return sb.toString();
	}

	/**
	 * e.g: String[] result={"TYHR0001","TYHR0002"}; split=","; return:
	 * str="TYHR0001,TYHR0002";
	 * 
	 * @param Object[]
	 * @param split
	 * @return String
	 */
	public static String arrayToStr(Object[] arr, char split) {
		if (arr == null || arr.length == 0) {
			return null;
		}
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < arr.length; i++) {
			if (i > 0) {
				sb.append(split);
			}
			sb.append(arr[i]);

		}
		return sb.toString();
	}

	/**
	 * 将数组的每个元素后加入split，然后组成字符串返回
	 */
	public static String arrayToStr(Object[] arr, String split) {
		if (arr == null || arr.length == 0) {
			return null;
		}
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < arr.length; i++) {
			if (i > 0) {
				sb.append(split);
			}
			sb.append(arr[i]);

		}
		return sb.toString();
	}
	
	/**
	 * 如26989.9,转化后为23,989.90
	 * 金额格式化
	 * @param s 金额
	 * @param len 小数位数
	 * @return 格式后的金额
	 */
	public static String insertComma(String s) {
	    if (s == null || s.length() < 1) {
	        return "";
	    }
	    if(s.trim().substring(0, 1).equals("-"))
	    {
	    	s="-0"+s.trim().substring(1);
	    }
	    NumberFormat formater = null;
	    double num = Double.parseDouble(s);
//	    num=num/100;
	    
	    StringBuffer buff = new StringBuffer();
	    buff.append("###,##0.00");
	       
	    formater = new DecimalFormat(buff.toString());
	 
	    return formater.format(num);
	}
	


	/**
	 * 得到字符串中某个字符出现的次数
	 */
	public static int getCharCount(String str, char c) {

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c)
				count++;
		}
		return count;
	}

	public static boolean isNumeric(String str) {
		if(isNull(str))
			return false;
		for (int i = 0; i<str.length(); i++) {
			if (!Character.isDigit(str.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	public static String trim(String str) {
		if(str == null) {
			return "";
		}
		return str.trim().replaceAll(" ", "");
	}
	
	public static String substr(String str,int index) {
		if(str.length() < index) {
			return str;
		}
		str = trim(str).substring(index);
		return str;
	}
	
	public static String substr(String str,int beginIndex,int endIndex) {
		if(str.length() < beginIndex || str.length() < endIndex || beginIndex > endIndex) {
			return str;
		}
		return trim(str).substring(beginIndex, endIndex);
	}

	
	/**
	 * 产生紧凑型32位UUID
	 * 
	 * @return
	 */
	public static String getUUID() {
		UUID uuid = UUID.randomUUID();
		return uuid.toString().replaceAll("-", "");
	}
	
	/**
	 * 判断字符串中是否包含全角字符
	 */
	public static boolean isFull(String str) {
		if (str.getBytes().length == str.length()) {
			// 全是半角
			return false;
		}
		if (str.getBytes().length > str.length() && str.getBytes().length != str.length()) {
			// 混合
			return true;
		}
		if (str.getBytes().length == str.length() * 2) {
			// 全是全角
			return true;
		}
		return false;
	}
	/**
	 * 手机号验证
	 * 
	 * @param str
	 * @return 验证通过返回true
	 */
	public static boolean isMobile(String str) {
		Pattern p = null;
		Matcher m = null;
		boolean b = false;
		p = Pattern.compile("^[1][3,4,5,8][0-9]{9}$"); // 验证手机号
		m = p.matcher(str);
		b = m.matches();
		return b;
	}
	/**
	 * 电话号码验证
	 * 
	 * @param str
	 * @return 验证通过返回true
	 */
	public static boolean isPhone(String str) {
		Pattern p = null;
		Matcher m = null;
		boolean b = false;
		p = Pattern.compile("^1\\d{10}$|^(0\\d{2,3}-?|\\(0\\d{2,3}\\))?[1-9]\\d{4,7}(-\\d{1,8})?$"); // 验证带区号,带分机号
		m = p.matcher(str);
		b = m.matches();
		return b;
	}

	public static int lenChinese(String str) {
		int count = 0;
		int ch_count = 0;
		String regex = "[\u4e00-\u9fa5]";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		while (m.find()) {
			ch_count++;
		}
		int str_len = str.length();
		count = ch_count + str_len;

		return count;
	}

	
	/**
	 * 获取当前时间yyyyMMddHHmmss
	 * @return
	 */
	public static String getCurrDate(){
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");//设置日期格式
		System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
		String currDate = df.format(new Date());//当前日期
		return currDate;
	}
	
	
	/**
	 * 已分隔符来输出传入的字符串
	 * @author cmt
	 * @param split
	 * @param obj
	 * @return
	 */
	public static String toStringSpilt(String split,String ... obj){
		if (obj==null) return "";
		
		StringBuffer sbBuffer=new StringBuffer();
		for (String s:obj){
			if (s!=null && !s.equals("")){
				if (sbBuffer.length()==0)
					sbBuffer.append(s);
				else 
					sbBuffer.append(split).append(s);
			}
		}
		
		return sbBuffer.toString();
	}
	
	
	/**
	 * 按照长度获取字符串，如果超出截取最大长度，后面加"..."
	 * @author cmt
	 * @param str
	 * @param len
	 * @return
	 */
	public static String maxString(String str,Integer len){
		if (str==null) return str;
		if (str.length()<=len) return str;
		return str.substring(0, len)+"...";
	}

	
	
	
	/**
	 * 返回等长字符，如果前缀+字符串>长度，返回字符串
	 * @author cmt
	 * @param prefix 前缀
	 * @param len
	 * @param str
	 * @return
	 */
	public static String getMaxLength(String prefix,int len,String str){
		if (!checkNull(false,str) || str.length()>=len ) return str;
		
		if (prefix.length()+str.length()>len) return str;
		
		StringBuilder sb=new StringBuilder();
		sb.append(prefix);
		for (int i = 0; i < len-prefix.length()- str.length(); i++) {
			sb.append("0");
		}
		sb.append(str);
		
		return sb.toString();
	}

	
	/**
	 * 返回最长字符串，前方补足，如果传入值的长度大于，将切割字符串
	 * @author cmt
	 * @param prefix
	 * @param len
	 * @param str
	 * @return
	 */
	public static String fixLength(String prefix,int len,String str){
		if (str==null){
			str="";
		}
		
		if (str.length()>=len){
			return str.substring(str.length()-len,str.length());
		}
		
		
		StringBuilder sb=new StringBuilder();
		sb.append(prefix);
		for (int i = 0; i < len-prefix.length()- str.length(); i++) {
			sb.append(prefix);
		}
		sb.append(str);
		
		return sb.toString();
	}
	
	public  static  double getRandomA2B(double i ,double j, int point){
		if (i >= j || j <= 0||point<1||point>5) {
			return 1D;
		}
		int p = (int)(Math.pow(10,point));;
		Random ran = new Random();
		int m = (int) Math.floor((j - i) * p);
		int n = ran.nextInt(m);
		BigDecimal x = new BigDecimal(n);
		double y = x
				.divide(new BigDecimal(p), point, BigDecimal.ROUND_HALF_UP)
				.doubleValue();
		double z = i + y;
		double s = new BigDecimal(z).setScale(point, BigDecimal.ROUND_HALF_UP)
				.doubleValue();
		return s;
	}

	public static long ceil(double value) {
		return (long) Math.ceil(value);
	}
	
	public static String removeSpaces(String str){
		if(str==null){
			return "";
		}
		String result=str.replaceAll("\\s", "");
		return result;
	}
	
	public static String leftPatchZero(int length,int value){
		String fmt="";
		for(int i=0;i<length;i++){
			fmt+="0";
		}
		DecimalFormat df=new DecimalFormat(fmt);
		return df.format(value);
	}
	
	/**
	 * 获取16位的序号
	 * @return
	 */
	public static String getSeq16(){
		String result="";
		result=DF.format(new Date())+genRandom(2);
		return result;
	}
	
	public static String genRandom(int length)
    {
        StringBuffer buffer = new StringBuffer();
        Random r = new Random();
        for(int i = 0; i < length;)
        {
            int c = r.nextInt(122);
            if(48 <= c && c <= 57 || 65 <= c && c <= 90 || 97 <= c && c <= 122)
            {
                buffer.append((char)c);
                i++;
            }
        }
        return buffer.toString();
    }
	
	/**
	 * 通过所给的字符转成SQL语句中的条件
	 * 如：传入123,123返回'123','123'
	 * @param value
	 * @return
	 */
	public static String strToSqlChar(String value){
		String result="";
		if(StringUtil.checkNull(false, value)){
			String [] strs=value.split(",");
			for(String s:strs){
				result+="'"+s+"',";
			}
			result=result.substring(0,result.length()-1);
		}
		return result;
	}
	
	/**
	 * 通过所给的字符转成SQL语句中的条件
	 * 如：传入123,123返回'123','123'
	 * @param value
	 * @return
	 */
	public static String strToSqlChar(List<String> value){
		String result="";
		if(StringUtil.checkNull(false, value)){
			for(String s:value){
				result+="'"+s+"',";
			}
			result=result.substring(0,result.length()-1);
		}
		return result;
	}

	 public static String generateRandomString(int len)
	    {
	        char mm[] = {
	            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'
	        };
	        StringBuffer sb = new StringBuffer();
	        Random random = new Random();
	        for(int i = 0; i < len; i++)
	            sb.append(mm[random.nextInt(mm.length)]);

	        return sb.toString();
	    }
	 
	 public static void main(String[] args) {
		System.out.println(formatCurrency("90.08700")); 
	}
}
