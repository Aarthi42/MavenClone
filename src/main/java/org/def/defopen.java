package org.def;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class defopen {
	public static void main(String[] args) throws IOException {
		File excel=new File("C:\\Users\\Rajesh\\eclipse-workspace\\Aarthi\\target\\Aarthi.xlsx");
		FileInputStream stream=new FileInputStream(excel);
		Workbook w=new XSSFWorkbook(stream);
		Sheet s=w.getSheet("Aarthi");
		Row r=s.getRow(2);
		Cell c=r.getCell(1);
		System.out.println(c);
		
	}

}
