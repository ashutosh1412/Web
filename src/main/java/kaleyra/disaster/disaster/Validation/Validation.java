package kaleyra.disaster.disaster.Validation;

<<<<<<< HEAD
=======
import java.util.HashMap;

>>>>>>> 51f9fe8beed2eff9870235f4fc0e98a0bcdbe7bb
import org.springframework.stereotype.Service;

import kaleyra.disaster.disaster.dataObject.Call;
import kaleyra.disaster.disaster.dataObject.Message;
<<<<<<< HEAD
=======
import kaleyra.disaster.disaster.dataObject.User;
>>>>>>> 51f9fe8beed2eff9870235f4fc0e98a0bcdbe7bb

@Service
public class Validation implements IValidation {

	@Override
	public Message message(Message messaging) {
		Message response = new Message();
		if (messaging.getContent().isEmpty()) {
			response.setContent("Empty");
		}
		if (messaging.getSubject().isEmpty()) {
			response.setSubject("Empty");
		}
		if (messaging.getTimeStamp().isEmpty()) {
			response.setTimeStamp("Empty");
		}
		if (messaging.getName().isEmpty()) {
			response.setName("Empty");
		}
<<<<<<< HEAD
		if (messaging.getLocation().isEmpty()) {
			response.setLocation("Empty");
		}
		return response;
	}

	@Override
	public Call call(Call call) {

		Call response = new Call();
		if (call.getContent().isEmpty()) {
			response.setContent("Empty");
		}
		if (call.getSubject().isEmpty()) {
			response.setSubject("Empty");
		}
		if (call.getTimeStamp().isEmpty()) {
			response.setTimeStamp("Empty");
		}
		if (call.getName().isEmpty()) {
			response.setName("Empty");
		}
		if (call.getDuration().isEmpty()) {
			response.setDuration("0");
		}
		if (call.getLocation().isEmpty()) {
			response.setLocation("Empty");
		}
		return null;
	}
=======
		return response;
	}
	
	@Override
	public Call call(Call call) {

		HashMap<String, String> returnVal = new HashMap<String, String>();
		if (call.getContent().isEmpty()) {
			returnVal.put("content", "Empty");
		} else {
			returnVal.put("content", "true");
		}
		if (call.getSubject().isEmpty()) {
			returnVal.put("subject", "Empty");
		} else {
			returnVal.put("subject", "true");
		}
		if (call.getTimeStamp().isEmpty()) {
			returnVal.put("timeStamp", "Empty");
		} else {
			returnVal.put("timeStamp", "true");
		}
		return null;
	}

	@Override
	public User user(User user) {
		// TODO Auto-generated method stub
		return null;
	}
>>>>>>> 51f9fe8beed2eff9870235f4fc0e98a0bcdbe7bb
}
