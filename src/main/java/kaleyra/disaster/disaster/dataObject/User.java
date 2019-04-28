package kaleyra.disaster.disaster.dataObject;

public class User {
	private String userId;
	private String name;
	private String location;
	private String messageCount;
	private String callCount;
	
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
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
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
	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", location=" + location + ", messageCount=" + messageCount
				+ ", callCount=" + callCount + "]";
	}
	
	
}
