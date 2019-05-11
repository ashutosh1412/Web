/**
 * 
 */
package com.example.demo.dataObject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author Danger
 *
 */

@Entity
public class Token {
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private long id;
	private String username; 
	private String expires;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getExpires() {
		return expires;
	}
	public void setExpires(String l) {
		this.expires = l;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Token [id=" + id + ", username=" + username + ", expires=" + expires + "]";
	}
	public void setPropertiesFromString(String properties) {
		properties = properties.replace("Token [", "");
		properties = properties.replace("]", "");
		properties = properties.replace(" ", "");
		String arr[] = properties.split(",");
		this.id = Long.parseLong(arr[0].split("=")[1]);
		this.username = arr[1].split("=")[1];
		this.expires = arr[2].split("=")[1];
	}
}
