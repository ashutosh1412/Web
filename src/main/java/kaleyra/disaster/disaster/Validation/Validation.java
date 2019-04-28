package kaleyra.disaster.disaster.Validation;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import kaleyra.disaster.disaster.dataObject.Call;
import kaleyra.disaster.disaster.dataObject.Message;
import kaleyra.disaster.disaster.dataObject.User;

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
}
