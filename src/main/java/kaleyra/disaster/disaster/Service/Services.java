package kaleyra.disaster.disaster.Service;

import java.util.HashMap;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
		return null;
	}
}
