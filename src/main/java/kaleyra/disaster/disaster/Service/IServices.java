package kaleyra.disaster.disaster.Service;

import java.util.HashMap;

import kaleyra.disaster.disaster.dataObject.Call;
import kaleyra.disaster.disaster.dataObject.Message;
import kaleyra.disaster.disaster.dataObject.User;

public interface IServices {
	public Message message(Message messaging);
	public HashMap<String, String> regstration(User user);
	public HashMap<String, String> call(Call call);
}
