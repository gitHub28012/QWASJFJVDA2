package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FetchingDataFromPropertyFile {
	
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("./testData/CommanData.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("Url");
		System.out.println(url);
		String username = prop.getProperty("username");
		System.out.println(username);
		
		
		
	}

}
