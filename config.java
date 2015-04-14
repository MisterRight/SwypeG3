/*
 * Conf Class
 * 
 * Author : AG
 */
package swypeg3;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
import java.io.InputStream;
import java.io.FileInputStream;

 /**
 *
 * @author root
 */
public class SwypeG3 {

     public static String getValue(String key,String confName){
	Properties prop = new Properties();
	InputStream input = null;
 
	try {
 
		input = new FileInputStream(confName);
 
		// load a properties file
		prop.load(input);
 
		// get the property value and print it out
 
 
	} catch (IOException ex) {
		ex.printStackTrace();
	} finally {
		if (input != null) {
			try {
				input.close();
                                
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
    
       	return prop.getProperty(key);

}
      
 
    
     public static void setValue(String Key,String Value,String confName) {
 
  
 
}  
    
    public static void makeNewConf(String confName) {
Properties pair = new Properties();
	OutputStream outputconf = null;
 
	try {
 
 
		outputconf = new FileOutputStream(confName);
 
 	pair.setProperty("username", "uname");
		pair.setProperty("password", "upass");
		pair.setProperty("database", "db");
 		pair.store(outputconf, null);
 
	} catch (IOException io) {
		io.printStackTrace();
	} finally {
		if (outputconf != null) {
			try {
				outputconf.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
 
	}
 
}
     
    public static void main(String[] args) {
 makeNewConf("swype.conf");
 
System.out.println(getValue("database","swype.conf"));
  }    
    
   
    
}
