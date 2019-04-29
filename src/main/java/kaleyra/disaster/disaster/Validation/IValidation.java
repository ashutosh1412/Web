package kaleyra.disaster.disaster.Validation;

import kaleyra.disaster.disaster.dataObject.Call;
import kaleyra.disaster.disaster.dataObject.Message;
<<<<<<< HEAD

public interface IValidation {
	public Message message(Message messaging);
=======
import kaleyra.disaster.disaster.dataObject.User;

public interface IValidation {
	public Message message(Message messaging);
	public User user(User user);
>>>>>>> 51f9fe8beed2eff9870235f4fc0e98a0bcdbe7bb
	public Call call(Call call);
}
