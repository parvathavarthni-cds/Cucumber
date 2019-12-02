package pw_functions;

import java.io.FileReader;

import com.opencsv.CSVReader;

public class Dataprovider {
	public static String url;
	public static String email;
	public static String password;
	public static String portfolio_id;
	public static String portfolio_name;
	public static String invalid_email;
	public static String invalid_password;
	public static String Portfolio_name1;
	public static String Portfolio_name2;
	public static String fundname1;
	public static String minvalue;
	public static String maxvalue;
	private static String csv_path="/home/parvathavarthini/Desktop/hive.csv";

	static Dataprovider data=new Dataprovider();
	public static String[] csvdata = data.csvdata();
	 
	public String[]csvdata()
	{
		
		try
		{
			CSVReader reader = new CSVReader(new FileReader(csv_path));
			csvdata = reader.readNext();
			url=csvdata[0];
			email=csvdata[1];
			password=csvdata[2];
			portfolio_id=csvdata[3];
			portfolio_name=csvdata[4];
			invalid_email=csvdata[5];
			invalid_password=csvdata[6];
			Portfolio_name1=csvdata[7];
			Portfolio_name2=csvdata[8];
			fundname1=csvdata[9];
			minvalue=csvdata[10];
			maxvalue=csvdata[11];
			
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		String readdata[]= {url,email,password,portfolio_id,portfolio_name,invalid_email,invalid_password,Portfolio_name1,Portfolio_name2,fundname1,minvalue,maxvalue};
		return readdata;
	}
	


}
