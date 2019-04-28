package kaleyra.disaster.disaster.dataObject;

public class Message {

	private String name;
	private String content;
	private String subject;
	private String timeStamp;
	private String location;
	private String messageCount ="0";
	
	@Override
	public String toString() {
		return "Message [name=" + name + ", content=" + content + ", subject=" + subject + ", timeStamp=" + timeStamp
				+ ", location=" + location + ", messageCount=" + messageCount + "]";
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getMessageCount() {
		return messageCount;
	}
	public void setMessageCount(String messageCount) {
		this.messageCount = messageCount;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
