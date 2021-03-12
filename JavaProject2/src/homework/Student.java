package homework;

public class Student {
	private String name;
	private int sid;
	private String phone;
	private int score;

	public Student(String name, int sid, String phone, int score) {
		super();
		this.name = name;
		this.sid = sid;
		this.phone = phone;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "이름: " + name + ", 학번: " + sid + ", 연락처: " + phone + ", 점수: " + score;
	}
}
