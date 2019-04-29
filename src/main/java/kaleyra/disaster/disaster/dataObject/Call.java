package kaleyra.disaster.disaster.dataObject;

public class Call {
<<<<<<< HEAD

	private String name;
	private String content;
	private String duration;
	private String subject;
	private String location;
	private String timeStamp;
	private String callCount = "0";

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

	public String getCallCount() {
		return callCount;
	}

	public void setCallCount(String callCount) {
		this.callCount = callCount;
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
		return "Call [name=" + name + ", content=" + content + ", duration=" + duration + ", subject=" + subject
				+ ", location=" + location + ", timeStamp=" + timeStamp + ", callCount=" + callCount + "]";
	}
=======
	
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
	
>>>>>>> 51f9fe8beed2eff9870235f4fc0e98a0bcdbe7bb
}
