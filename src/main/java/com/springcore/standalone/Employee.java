package com.springcore.standalone;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

	private List<Long> contact;
	private Set<String> friends;
	private Map<String, String> course;

	List<Long> getContact() {
		return contact;
	}

	public void setContact(List<Long> contact) {
		this.contact = contact;
	}



	public Set<String> getFriends() {
		return friends;
	}

	public void setFriends(Set<String> friends) {
		this.friends = friends;
	}

	public Map<String, String> getCourse() {
		return course;
	}

	public void setCourse(Map<String, String> course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Employee [contact=" + contact + ", friends=" + friends + ", course=" + course + "]";
	}
	
	

}
