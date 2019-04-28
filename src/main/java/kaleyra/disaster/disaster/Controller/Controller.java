package kaleyra.disaster.disaster.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kaleyra.disaster.disaster.Service.Services;
import kaleyra.disaster.disaster.dataObject.Call;
import kaleyra.disaster.disaster.dataObject.Message;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class Controller {

	@Autowired
	Services services;
	
	@RequestMapping("/Hello")
	public String Test()
	{
		return "Hello";
	}
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@RequestMapping(value="/Messaging",method = RequestMethod.POST)
	public Message message(@RequestBody Message message)
	{
		System.out.println(message.toString());
		return services.message(message);
	}
	@RequestMapping(value="/Calling",method = RequestMethod.POST)
	public Call calling(@RequestBody Call call)
	{
		return services.call(call);
	}
	@RequestMapping(value="/getData",method = RequestMethod.GET)
	public Object usersData(@RequestParam(name = "data") String data)
	{
		return services.getData(data);
	}
}
