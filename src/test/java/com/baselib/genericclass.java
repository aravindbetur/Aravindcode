package com.baselib;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class genericclass {

	public static String sconfig=Baseclass.sDirpath+"//configuration.properties";
	public static String sexcel=Baseclass.sDirpath+"//input.xlsx";

	public static String readconfigproperties(String skey){
		String svalue=null;
		Properties properties=new Properties();			
		try
		{
			FileInputStream fis=new FileInputStream(sconfig);
			properties.load(fis);
			svalue=properties.getProperty(skey);


		}catch(Exception e){
			System.out.println(e);

		}
		return svalue;
	}
	public static String[] readdata(String sheet,String TestcasesID )
	{
		String sData[]=null;
		try{
			FileInputStream fis=new FileInputStream(sexcel);
			Workbook wb=(Workbook)WorkbookFactory.create(fis);
			Sheet sh=wb.getSheet(sheet);
			int srow=sh.getLastRowNum();
			System.out.println(srow);
			for(int i=1;i<=srow;i++){
				if(sh.getRow(i).getCell(0).toString().equals(TestcasesID)){
					int scell=sh.getRow(i).getLastCellNum();
					System.out.println(scell);
					sData=new String[scell];
					for(int j=0;j<scell;j++){

						if(0 == sh.getRow(i).getCell(j).getCellType()) {
							int value = (int) sh.getRow(i).getCell(j).getNumericCellValue();
							sData[j]=String.valueOf(value);
						} else if(1 == sh.getRow(i).getCell(j).getCellType()) {
							sData[j]=sh.getRow(i).getCell(j).getStringCellValue();
						}

					}
					break;

				}
			}
		}catch(Exception e){

		}
		return sData;
	}


}
