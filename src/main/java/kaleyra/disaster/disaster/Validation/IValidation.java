package kaleyra.disaster.disaster.Validation;

import kaleyra.disaster.disaster.dataObject.Call;
import kaleyra.disaster.disaster.dataObject.Message;
import kaleyra.disaster.disaster.dataObject.User;

public interface IValidation {
	public Message message(Message messaging);
	public User user(User user);
	public Call call(Call call);
}
