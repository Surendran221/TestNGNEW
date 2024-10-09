package org.sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exacelwrite {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\SURENDRAN\\eclipse-workspace\\MyProject\\target\\XLdatas\\Signin.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet s = w.createSheet("datas");
		Row c = s.createRow(0);
		Cell set = c.createCell(0);
		set.setCellValue("USER");
		Row r = s.getRow(0);
		Cell set1 = r.createCell(1);
		set1.setCellValue("PASSWORD");
		Row c1 = s.createRow(1);
		Cell set2 = c1.createCell(0);
		set2.setCellValue("ksurendarn23@gmail.com");
		Row c2 = s.getRow(1);
		Cell set3 = c2.createCell(1);
		set3.setCellValue("Surendran22");
		Row c3 = s.createRow(2);
		Cell set4 = c3.createCell(0);
		set4.setCellValue("ramesh122@gmail.com");
		Row c4 = s.getRow(2);
		Cell set5 = c4.createCell(1);
		set5.setCellValue("ramesh90");
		Row c5 = s.createRow(3);
		Cell set6 = c5.createCell(0);
		set6.setCellValue("vinoth@gmail.com");
		Row c6 = s.getRow(3);
		Cell set7 = c6.createCell(1);
		set7.setCellValue("vinoth456");
		Row c7 = s.createRow(4);
		Cell set8 = c7.createCell(0);
		set8.setCellValue("Baru123@gmail.com");
		Row c8 = s.getRow(4);
		Cell set9 = c8.createCell(1);
		set9.setCellValue("Baru567@");
		Row c9 = s.createRow(5);
		Cell set10 = c9.createCell(0);
		set10.setCellValue("Ashiq@gmail.com");
		Row c10 = s.getRow(5);
		Cell set11 = c10.createCell(1);
		set11.setCellValue("!@##$%^^");
		FileOutputStream fout= new FileOutputStream(f);
		w.write(fout);
		System.out.println("success");
		
		
		
	}

}
