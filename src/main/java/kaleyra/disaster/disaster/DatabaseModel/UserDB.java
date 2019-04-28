package kaleyra.disaster.disaster.DatabaseModel;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnDefault;

@Entity
public class UserDB {
	@Id
	private int userId = 0;
	private String name;
	private String location;
	@ColumnDefault(value = "0")
	private String messageCount="0";
	@ColumnDefault(value = "0")
	private String callCount="0";
	
	@Override
	public String toString() {
		return "UserDB [userId=" + userId + ", name=" + name + ", location=" + location + ", messageCount="
				+ messageCount + ", callCount=" + callCount + "]";
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getMessageCount() {
		return messageCount;
	}
	public void setMessageCount(String messageCount) {
		this.messageCount = messageCount;
	}
	public String getCallCount() {
		return callCount;
	}
	public void setCallCount(String callCount) {
		this.callCount = callCount;
	}
}
