package test;

import org.json.simple.*;
import java.util.LinkedHashMap;
  import java.util.Map;
/**
 *
 * @author AG
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
        System.out.println( cmdMethod("/leave"));
       
 
    }
    public static int cmdMethod(String command) {
   /*    
         JSONObject obj=new JSONObject();
  obj.put("nickname","nickname");
  obj.put("uid",new Integer(100));
  obj.put("birthday",new Double(1000.21));
  
  System.out.print(obj);
  **/
       String s = new String(command);
       String cmd = s.replaceAll("/", "");
       cmd=cmd.toLowerCase();
      // System.out.println(cmd);
       int result=0;
        switch (cmd) {
            case "quit":
                result = 0;
                break;
            case "topic":
                result = 1;
                break;
            case "join":
                result = 2;
                break;
            case "leave":
                result = 3;
                break;
            case "send":
                result = 5;
                break;
            case "talk":
                result = 6;
                break;

        }
        return result;
    }
}
