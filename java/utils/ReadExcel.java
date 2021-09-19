package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import base.BaseClass;

public class ReadExcel extends BaseClass{

	public String[][] leaddata(String filename) throws IOException {
		// TODO Auto-generated method stub
       
		XSSFWorkbook wb = new XSSFWorkbook("./Data/"+filename+".xlsx");

		//String stringCellValue = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();

		XSSFSheet sheet = wb.getSheet("Sheet1");

		int rowcount = sheet.getLastRowNum();
		System.out.println(rowcount);

		int cellcount = sheet.getRow(0).getLastCellNum();
		System.out.println(cellcount);

		String[][] data = new String[rowcount][cellcount];
		for (int i = 1; i <= rowcount; i++) {
			for (int j = 0; j < cellcount; j++) {
				String text = sheet.getRow(i).getCell(j).getStringCellValue();
				data[i - 1][j] = text;
				
				System.out.println(data[i-1][j]);

			}

		}
          wb.close();
		return data;

	}

	

}
