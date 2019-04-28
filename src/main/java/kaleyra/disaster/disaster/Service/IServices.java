package kaleyra.disaster.disaster.Service;

import kaleyra.disaster.disaster.dataObject.Call;
import kaleyra.disaster.disaster.dataObject.Message;

public interface IServices {
	public Message message(Message messaging);
	public Call call(Call call);
	public Object getData(String data);
}
