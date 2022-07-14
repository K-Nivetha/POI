package POI1;

import Excel.excelreport;

//import Excel.excelreport;

//import Excel.excelreport;

public class Read_Write {

public static void main(String[] args) {
// TODO Auto-generated method stub
excelreport reader = new excelreport("D:\\poi.xlsx");
String sheetName = "login";
String data = reader.getCellData(sheetName, 0, 2);//Col and Row Num
System.out.println(data);
int rowCount = reader.getRowCount(sheetName);
System.out.println("total rows: "+ rowCount);
reader.addColumn(sheetName, "status");//Adding New Columns
//reader.addSheet("Test"); //Adding New Sheet
reader.setCellData(sheetName, "status", 2, "PASS");//Writing Data
}
}

