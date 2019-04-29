package kaleyra.disaster.disaster.dataObject;

public class User {
<<<<<<< HEAD
	
=======
	private String userId;
>>>>>>> 51f9fe8beed2eff9870235f4fc0e98a0bcdbe7bb
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
<<<<<<< HEAD
=======
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
>>>>>>> 51f9fe8beed2eff9870235f4fc0e98a0bcdbe7bb
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
<<<<<<< HEAD
		return "User [name=" + name + ", location=" + location + ", messageCount=" + messageCount + ", callCount="
				+ callCount + "]";
	}
	
=======
		return "User [userId=" + userId + ", name=" + name + ", location=" + location + ", messageCount=" + messageCount
				+ ", callCount=" + callCount + "]";
	}
	
	
>>>>>>> 51f9fe8beed2eff9870235f4fc0e98a0bcdbe7bb
}
