package com.adtec.interfaceDoc;

/**
 * 接口文档自动生成类
 * @author dengp_m  
 * @date 2018年8月26日 下午7:36:03 
 */
public class InteraceDocGnerator {
	
	/**
	 * 自动生产方法
	 * 业务流程：
	 * 	1. 通过交易码在est_service中找到对应的 in out format
	 *  2. format 中根据报文格式不同，取法不同 8583 json
	 *	  2. 通过fmt_id在 est_fmt_item 表中找到对应的elem_id
	 * 		2.1 若没有elem_id，为对象，取sub_name为子对象id
	 *  		2.2 对象标签名，通过elem_id去est_element中取xml_lable_name
	 *  		2.3 再重复2，直到没循环为止
	 *  		3. 通过elem_id,在est_element_item表中取到对应的名称、描述、data_name
	 * 		 4. 通过data_name取est_datadict中的类型、长度
	 * 	3.若为8583，取est_format表中signName、fmt_id
	 * 		3.1 
	 * @param trans 交易码    
	 * @author dengp_m   
	 * @date 2018年8月26日 下午7:38:20 
	 */
	public static void generator(String[] trans) {
		for (int i = 0; i < trans.length; i++) {
			
		}
	}
}
