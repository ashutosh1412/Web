package kaleyra.disaster.disaster.Controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kaleyra.disaster.disaster.Service.Services;
import kaleyra.disaster.disaster.dataObject.Call;
import kaleyra.disaster.disaster.dataObject.Message;
import kaleyra.disaster.disaster.dataObject.User;
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
	public HashMap<String, String> calling(@RequestBody Call call)
	{
		return services.call(call);
	}
	@RequestMapping(value="/Registration",method = RequestMethod.POST)
	public HashMap<String, String> registration(@RequestBody User user)
	{
		return services.regstration(user);
	}
}
