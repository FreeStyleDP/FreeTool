package com.adtec.dataElement;

import java.io.FileWriter;
import java.io.IOException;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import com.adtec.dataElement.entity.DataElementTab;

/**
 * DataElement的相关操作
 * @time 2018年8月21日下午12:46:44
 * @author dengp_w
 *
 */
public class DataElementAct {
	
	private static final String FILE_NAME = "DataElement.xml";
	
	public static void main(String[] args) throws IOException {
		String filePath = "";
		DataElementTab dataElementTab = readDataElementFile(filePath);
		String filePathXML = writeDataElementFile(filePath,dataElementTab);
		System.out.println(filePathXML);
		System.out.println("Finish!");
	}

	/**
	 * 将dataElementTab写为对应的xml文件
	 * @time 2018年8月21日 下午12:49:34
	 * @author dengp_w
	 * @param dataElementTab
	 * @return
	 * @throws IOException 
	 */
	public static String  writeDataElementFile(String filePath , DataElementTab dataElementTab) throws IOException {
		filePath = filePath.substring(0,filePath.lastIndexOf("/")+1) + FILE_NAME;
//		写xml
		OutputFormat format = OutputFormat.createPrettyPrint();//创建文件输出的时候，自动缩进
//		有中文的时�?�设置编码格式，没有可以不�?�虑xmlWriter的最后一�?
		format.setEncoding("utf-8");
		XMLWriter xmlWriter = new XMLWriter(new FileWriter(filePath),format);
		Document document = DocumentHelper.createDocument();
		
		Element DataElementTab = document.addElement("DataElementTab");//root
		
		
		xmlWriter.write(document);
		xmlWriter.close();
		return null ;
	}
	
	/**
	 * 将xml文件读为dataElementTab对象
	 * @time 2018年8月21日 下午12:49:54
	 * @author dengp_w
	 * @param filePath
	 * @return
	 */
	public static DataElementTab  readDataElementFile(String filePath) {
		return null ;
	}
}
