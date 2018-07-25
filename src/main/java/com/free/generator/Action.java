package com.free.generator;

import org.mybatis.generator.api.ShellRunner;

/**
 * 调用自动生成类，通过数据库表反生产实体类
 * @author dengp_m  
 * @date 2018年7月25日 下午10:07:00 
 */
public class Action {

	/**
	 * @param type 数据库类型   
	 * 			oracle
	 * 			mysql
	 * @author dengp_m   
	 * @date 2018年5月5日 下午8:16:57 
	 */
	public static void generator(String type) {
		String[] oracle = new String[] { "-configfile", "src/main/java/com/free/generator/generatorConfigOracle.xml","-overwrite" };
		String[] mysql =  new String[] { "-configfile", "src/main/java/com/free/generator/generatorConfigMysql.xml","-overwrite" };
		if("mysql".equals(type)) {
			ShellRunner.main(mysql);
		}else {
			ShellRunner.main(oracle);
		}
		System.out.println("finish!");
	}
	
	public static void main(String[] args) {
		
		generator("mysql");
	}
}
