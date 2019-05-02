public class Record {
 
	private int id;
	private String name;
	private int age;
	private String birthday;
	private String diseaseRec;
	public Record(int id, String name, int age, String birthday, String diseaseRec) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.birthday = birthday;
		this.diseaseRec = diseaseRec;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getDiseaseRec() {
		return diseaseRec;
	}
	public void setDiseaseRec(String diseaseRec) {
		this.diseaseRec = diseaseRec;
	}
	
}
