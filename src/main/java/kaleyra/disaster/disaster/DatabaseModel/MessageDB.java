package kaleyra.disaster.disaster.DatabaseModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ColumnDefault;

@Entity
public class MessageDB {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int messageid;
	@ManyToOne
	private UserDB fromUserId;
	private String content;
	private String subject;
	private String timeStamp;
	@ColumnDefault(value = "0")
	private String messageCount="0";
	
	public int getMessageid() {
		return messageid;
	}
	public void setMessageid(int messageid) {
		this.messageid = messageid;
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

	public UserDB getFromUserId() {
		return fromUserId;
	}
	public void setFromUserId(UserDB fromUserId) {
		this.fromUserId = fromUserId;
	}
	@Override
	public String toString() {
		return "MessageDB [messageid=" + messageid + ", fromUserId=" + fromUserId + ", content=" + content
				+ ", subject=" + subject + ", timeStamp=" + timeStamp + ", messageCount=" + messageCount + "]";
	}
	
}
