package inheritances;

public class UnivFriend extends Friend {
	private String major;

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public UnivFriend(String name, String phone, String major) {
		super(name, phone);
		this.major = major;
	}

	@Override
	public String toString() {
		return "UnivFriend [major=" + major + ", name=" + getName() + ", phone=" + getPhone() + "]";
	}

}
