package kaleyra.disaster.disaster.Validation;

import org.springframework.stereotype.Service;

import kaleyra.disaster.disaster.dataObject.Call;
import kaleyra.disaster.disaster.dataObject.Message;

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
}
