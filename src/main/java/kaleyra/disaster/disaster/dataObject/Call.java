package kaleyra.disaster.disaster.dataObject;

public class Call {
	
	private User fromUser;
	private String content;
	private String duration;
	private String subject;
	private String timeStamp;
	private String callCount;
	
	public User getFromUser() {
		return fromUser;
	}
	public void setFromUser(User fromUser) {
		this.fromUser = fromUser;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
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
	@Override
	public String toString() {
		return "Call [fromUser=" + fromUser + ", content=" + content + ", duration=" + duration + ", subject=" + subject
				+ ", timeStamp=" + timeStamp + "]";
	}
	public String getCallCount() {
		return callCount;
	}
	public void setCallCount(String callCount) {
		this.callCount = callCount;
	}
	
}
