package creditCard.manthan.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import creditCard.manthan.Services.CSVReader;
import creditCard.manthan.dbObject.Details;

@RestController
public class CreditCardController {

	@Autowired
	private CSVReader csvreader;
	
	@RequestMapping(value="/Hello",method=RequestMethod.GET)
	public String Hello()
	{
		return "Hello";
	}
	@RequestMapping(value="/Read",method=RequestMethod.GET)
	public String Read()
	{
		csvreader.readFile();
		return "read";
	}
	
	@RequestMapping(value="/Get",method=RequestMethod.GET)
	public Object getAllDetails()
	{
		System.out.println("hi");
		return csvreader.getAllDetails();
	}
}
