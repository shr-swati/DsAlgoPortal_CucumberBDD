package dsAlgo_Reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TryEditor {

	String expectedResult;



	public String getExpectedResult() {
		return expectedResult;
	}



	public void setExpectedResult(String expectedResult) {
		this.expectedResult = expectedResult;
	}



	public String[] excelTryEditor(String sheetName, int rowNumber) throws IOException {
		String path = System.getProperty("user.dir") + "/src/test/resources/TestData/DsAlgo_TestData.xlsx";
		File excelFile = new File(path);

		FileInputStream Fis = new FileInputStream(excelFile);
		XSSFWorkbook workbook = new XSSFWorkbook(Fis);
		XSSFSheet sheet = workbook.getSheet(sheetName);

		Row row = sheet.getRow(rowNumber);

		String pythoncode = row.getCell(0).getStringCellValue();
		String output = row.getCell(1).getStringCellValue();

		workbook.close();
		Fis.close();

		String[] editor = new String[3];
		editor[0] = pythoncode;
		editor[1] = output;

		return editor;
	}
}