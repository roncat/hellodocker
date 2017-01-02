package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {      	    	
 	
    	String str = "Hello Docker from Spring Boot!" + " - " + 
    				 "S.O: " + System.getProperty("os.name") + " - " +
 					 		   System.getProperty("os.version") + " - " +
    						   System.getProperty("os.arch");
    	
    	return str; 
    }    
}
