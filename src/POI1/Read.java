package POI1;

import Excel.excelreport;

public class Read {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		excelreport reader = new excelreport("D:\\poi1.xlsx");
		int totalrows=reader.getRowCount("login");
		System.out.println(totalrows);
		//int totalcols=reader.getColumnCount("login");
		//System.out.println(totalcols);
		//String login[][]=new String[totalrows][totalcols];
		//reader.addColumn("login", "status");
		for(int i=2;i<=totalrows;i++)
		{
			String username=reader.getCellData("login", "username",i);
			System.out.println(username);
			String password=reader.getCellData("login", "password",i);	
			System.out.println(password);



		}
		System.out.println("Super");
	}
}