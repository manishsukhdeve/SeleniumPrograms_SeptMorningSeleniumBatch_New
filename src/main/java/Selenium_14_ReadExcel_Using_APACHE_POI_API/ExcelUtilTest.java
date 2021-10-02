package Selenium_14_ReadExcel_Using_APACHE_POI_API;

public class ExcelUtilTest {

	public static void main(String[] args) {

		Xls_Reader reader = new Xls_Reader("C:\\Users\\Mitansh\\Desktop\\SampleExcel.xlsx");
		
		String sheetName = "login";
		String data = reader.getCellData(sheetName, 0, 2);
		System.out.println(data);
		
		
		int rowCount = reader.getRowCount(sheetName);
		System.out.println("Total Rows " + rowCount);
		
		
//		reader.addColumn(sheetName, "status");
		
		
//		reader.addSheet("Registration");
		
		
		if (! reader.isSheetExist("Registration")) {
			reader.addSheet("Registration");
		}
		
		
		reader.setCellData(sheetName, "status", 2, "Pass");
		
		
		System.out.println(reader.getCellData(sheetName, "username", 3));
		
		
		System.out.println(reader.getColumnCount(sheetName));
		
//		reader.removeColumn("Registration", 0);
		
		System.out.println(reader.getCellData("Registration", "phone", 2));
		System.out.println(reader.getCellData("Registration", "age", 2));
		
		
	}

}
