package kaleyra.disaster.disaster.Service;

<<<<<<< HEAD
import java.util.ArrayList;
=======
>>>>>>> 51f9fe8beed2eff9870235f4fc0e98a0bcdbe7bb
import java.util.HashMap;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
import antlr.collections.List;
=======
>>>>>>> 51f9fe8beed2eff9870235f4fc0e98a0bcdbe7bb
import kaleyra.disaster.disaster.DatabaseModel.CallDB;
import kaleyra.disaster.disaster.DatabaseModel.MessageDB;
import kaleyra.disaster.disaster.DatabaseModel.UserDB;
import kaleyra.disaster.disaster.Validation.Validation;
import kaleyra.disaster.disaster.dataObject.Call;
import kaleyra.disaster.disaster.dataObject.Message;
import kaleyra.disaster.disaster.dataObject.User;
import kaleyra.disaster.disaster.repository.CallRepository;
import kaleyra.disaster.disaster.repository.MessageRepository;
import kaleyra.disaster.disaster.repository.UserRepository;

@Service
public class Services implements IServices {

	@Autowired
	Validation validation;
	@Autowired
	UserRepository userRepository;
	@Autowired
	CallRepository callRepository;
	@Autowired
	MessageRepository messageRepository;

	@Override
	public Message message(Message message) {
		Message validator = validation.message(message);
		if (validator.getName().equals("Empty") || validator.getLocation().equals("Empty")) {
			return validator;
		}
		UserDB user = new UserDB();
		MessageDB dbmessage = new MessageDB();
		user.setName(message.getName().toUpperCase());
		user.setLocation(message.getLocation().toUpperCase());
		user.setUserId(message.getName().hashCode() + message.getLocation().hashCode());
		for (UserDB userdb : userRepository.findAll()) {
			if (userdb.getUserId() == user.getUserId()) {
				BeanUtils.copyProperties(user, userdb);
				user.setMessageCount(Integer.toString(Integer.parseInt(user.getMessageCount()) + 1));
				break;
			}
		}
		if (user.getMessageCount() == "0")
			user.setMessageCount("1");
		userRepository.save(user);
		BeanUtils.copyProperties(message, dbmessage);
		for (MessageDB messageDB : messageRepository.findAll()) {
			if (Integer.parseInt(messageDB.getMessageCount()) > Integer.parseInt(dbmessage.getMessageCount())) {
				dbmessage.setMessageCount(messageDB.getMessageCount());
			}
		}
		if (dbmessage.getMessageCount() == "0")
			dbmessage.setMessageCount("1");
		else
			dbmessage.setMessageCount(Integer.toString(Integer.parseInt(dbmessage.getMessageCount()) + 1));
		dbmessage.setFromUserId(user);
		messageRepository.save(dbmessage);
		return validator;
	}

	@Override
<<<<<<< HEAD
	public Call call(Call call) {
		Call validator = validation.call(call);
		if (validator.getName().equals("Empty") || validator.getLocation().equals("Empty")) {
			return validator;
		}
		UserDB user = new UserDB();
		CallDB dbcall = new CallDB();
		user.setName(call.getName().toUpperCase());
		user.setLocation(call.getLocation().toUpperCase());
		user.setUserId(call.getName().hashCode() + call.getLocation().hashCode());
		for (UserDB userdb : userRepository.findAll()) {
			if (userdb.getUserId() == user.getUserId()) {
				BeanUtils.copyProperties(user, userdb);
				user.setMessageCount(Integer.toString(Integer.parseInt(user.getMessageCount()) + 1));
				break;
			}
		}
		if (user.getMessageCount() == "0")
			user.setMessageCount("1");
		userRepository.save(user);
		BeanUtils.copyProperties(call, dbcall);
		for (CallDB callDB : callRepository.findAll()) {
			if (Integer.parseInt(callDB.getCallCount()) > Integer.parseInt(dbcall.getCallCount())) {
				dbcall.setCallCount(callDB.getCallCount());
			}
		}
		if (dbcall.getCallCount() == "0")
			dbcall.setCallCount("1");
		else
			dbcall.setCallCount(Integer.toString(Integer.parseInt(dbcall.getCallCount()) + 1));
		dbcall.setFromUserId(user);
		callRepository.save(dbcall);
		return validator;
	}

	@Override
	public Object getData(String data) {
		List response = (List) new ArrayList<Object>();
		if (data.equals("User")) {
			for (UserDB userDB : userRepository.findAll()) {
				User user = new User();
				BeanUtils.copyProperties(userDB, user);
				response.add(user);
			}
			return response;
		}
		if (data.equals("Message")) {
			for (MessageDB messageDB : messageRepository.findAll()) {
				Message message = new Message();
				BeanUtils.copyProperties(messageDB, message);
				response.add(message);
			}
			return response;
		}
		if (data.equals("Call")) {
			for (CallDB callDB : callRepository.findAll()) {
				Call call = new Call();
				BeanUtils.copyProperties(callDB, call);
				response.add(call);
			}
			return response;
		}
=======
	public HashMap<String, String> call(Call call) {
		//HashMap<String, String> validator = validation.call(call);
		CallDB dbcall = new CallDB();
		BeanUtils.copyProperties(call, dbcall);
		callRepository.save(dbcall);
		return null;
	}

	@Override
	public HashMap<String, String> regstration(User user) {
		//HashMap<String, String> validator = validation.user(user);
		UserDB dbuser = new UserDB();
		BeanUtils.copyProperties(user, dbuser);
		userRepository.save(dbuser);
>>>>>>> 51f9fe8beed2eff9870235f4fc0e98a0bcdbe7bb
		return null;
	}
}
