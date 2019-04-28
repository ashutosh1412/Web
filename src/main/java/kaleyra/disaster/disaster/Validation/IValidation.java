package kaleyra.disaster.disaster.Validation;

import kaleyra.disaster.disaster.dataObject.Call;
import kaleyra.disaster.disaster.dataObject.Message;

public interface IValidation {
	public Message message(Message messaging);
	public Call call(Call call);
}
