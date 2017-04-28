package resource;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/javaDayTokyo")
public class JavaDayTokyoController {

	@RequestMapping(value = "/list",method = RequestMethod.GET)
	public String getList() {
		 return "[" + 
			      "{    \"name\": \"Java Cloud Service\"," + 
			      "     \"type\": \"PaaS\", " +
			      "      \"price\": \"450.00\"," +
			      "      \"metric\": \"OCPU / month\"," +
			      "      \"description\": \"Easy, rapid and agile deployment …\"," +
			      "      \"link\": \"https://cloud.oracle.com/java\"," +
			      " }]";
	}
	
	@RequestMapping(value = "/list/{type}",method = RequestMethod.GET)
    public String showListbyType(@PathVariable("type") String type) {
       return "[" + 
      "{    \"name\": \"Java Cloud Service\"," + 
      "     \"type\": \"PaaS\", " +
      "      \"price\": \"450.00\"," +
      "      \"metric\": \"OCPU / month\"," +
      "      \"description\": \"Easy, rapid and agile deployment …\"," +
      "      \"link\": \"https://cloud.oracle.com/java\"," +
      " }]";
    }
	
	@RequestMapping(value = "/service/{name}",method = RequestMethod.GET)
    public String searchByName(@PathVariable("name") String name) {
       return "[" + 
      "{    \"name\": \"Java Cloud Service\"," + 
      "     \"type\": \"PaaS\", " +
      "      \"price\": \"450.00000000000000000000\"," +
      "      \"metric\": \"OCPU / month\"," +
      "      \"description\": \"Easy, rapid and agile deployment …\"," +
      "      \"link\": \"https://cloud.oracle.com/java\"," +
      " }]";
    }
}
