package kaleyra.disaster.disaster.Service;

<<<<<<< HEAD
import kaleyra.disaster.disaster.dataObject.Call;
import kaleyra.disaster.disaster.dataObject.Message;

public interface IServices {
	public Message message(Message messaging);
	public Call call(Call call);
	public Object getData(String data);
=======
import java.util.HashMap;

import kaleyra.disaster.disaster.dataObject.Call;
import kaleyra.disaster.disaster.dataObject.Message;
import kaleyra.disaster.disaster.dataObject.User;

public interface IServices {
	public Message message(Message messaging);
	public HashMap<String, String> regstration(User user);
	public HashMap<String, String> call(Call call);
>>>>>>> 51f9fe8beed2eff9870235f4fc0e98a0bcdbe7bb
}
