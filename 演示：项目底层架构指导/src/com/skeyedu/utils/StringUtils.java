package com.skeyedu.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 常用String 方法
 * @author 10947
 *
 */
public class StringUtils {
	private static Pattern humpPattern = Pattern.compile("[A-Z]");
    private static Pattern linePattern = Pattern.compile("_(\\w)");


	  //首字母大写
    public static String captureName(String name) {
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
       return  name;
     
    }
    
    /**
     * 判断字符串是否包含大写字母
     * @param word
     * @return
     */
    public static boolean isAcronym(String word)
    {
       for(int i = 0; i < word.length(); i++)
       {
           char c = word.charAt(i);
           
           char c1 = word.charAt(0);
           char c2 = word.charAt(1);
           
           if(!Character.isLowerCase(c2) && Character.isLowerCase(c1)) {
        	   return true;
           }
           
           if(Character.isLowerCase(c1) && Character.isLowerCase(c2) && !Character.isLowerCase(c)) {
        	   return false;
           }
           
           if (!Character.isLowerCase(c))
           {
               return true;
           }
       }
       return false;
    }
	/** 下划线转驼峰 */
	public static String lineToHump(String str) {
		str = str.toLowerCase();
		Matcher matcher = linePattern.matcher(str);
		StringBuffer sb = new StringBuffer();
		while (matcher.find()) {
			matcher.appendReplacement(sb, matcher.group(1).toUpperCase());
		}
		matcher.appendTail(sb);
		return sb.toString();
	}
	
	/**
	 * 驼峰 转换 数组版本
	 * @param str
	 * @return
	 */
	public static String[] lineToHumpArr(String[] str) {
		String[] rst = new String[str.length] ;
		int i = 0;
		for(String s:str) {
			rst[i] = lineToHump(s);
			i++;
		}
		return rst;
	}
 
	/** 驼峰转下划线(简单写法，效率低于{@link #humpToLine2(String)}) */
	public static String humpToLine(String str) {
		return str.replaceAll("[A-Z]", "_$0").toLowerCase();
	}
 
 
	/** 驼峰转下划线,效率比上面高 */
	public static String humpToLine2(String str) {
		Matcher matcher = humpPattern.matcher(str);
		StringBuffer sb = new StringBuffer();
		while (matcher.find()) {
			matcher.appendReplacement(sb, "_" + matcher.group(0).toLowerCase());
		}
		matcher.appendTail(sb);
		return sb.toString();
	}
}
