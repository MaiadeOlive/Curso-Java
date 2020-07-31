package entities;

import java.io.Serializable;

public class People implements Serializable {
	private Integer ID;
	private String name;
	private String email;

	public People(Integer ID, String name, String email) {
		this.ID = ID;
		this.name = name;
		this.email = email;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer ID) {
		this.ID = ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override public String   toString() {
		return "People [" +
				"ID=" + ID +
				", name='" + name + '\'' +
				", email='" + email + '\'' +
				']';
	}
}
