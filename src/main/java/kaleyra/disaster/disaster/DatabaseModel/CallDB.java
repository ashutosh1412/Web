package kaleyra.disaster.disaster.DatabaseModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
<<<<<<< HEAD
import javax.persistence.ManyToOne;
=======
>>>>>>> 51f9fe8beed2eff9870235f4fc0e98a0bcdbe7bb

@Entity
public class CallDB {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
<<<<<<< HEAD
	private int callId; 
	@ManyToOne
	private UserDB fromUserId;
	private String content;
	private String duration;
	private String subject;
	private String Location;
=======
	private int callId; 	
	private String fromUserId;
	private String content;
	private String duration;
	private String subject;
>>>>>>> 51f9fe8beed2eff9870235f4fc0e98a0bcdbe7bb
	private String timeStamp;
	private String callCount;
	
	public int getCallId() {
		return callId;
	}
	public void setCallId(int callId) {
		this.callId = callId;
	}
<<<<<<< HEAD
=======
	public String getFromUserId() {
		return fromUserId;
	}
	public void setFromUserId(String fromUserId) {
		this.fromUserId = fromUserId;
	}
>>>>>>> 51f9fe8beed2eff9870235f4fc0e98a0bcdbe7bb
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
<<<<<<< HEAD
	public UserDB getFromUserId() {
		return fromUserId;
	}
	public void setFromUserId(UserDB fromUserId) {
		this.fromUserId = fromUserId;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
=======
	
>>>>>>> 51f9fe8beed2eff9870235f4fc0e98a0bcdbe7bb
}
