
public class PredicateEmp {
	
	private int age;
	private int id;
	private String gender;
	
	
	public PredicateEmp(int age, int id, String gender){
		this.id = id;
		this.age= age;
		this.gender= gender;
	}

	

	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	@Override
	public String toString() {
		return "PredicateEmp [age=" + age + ", id=" + id + ", gender=" + gender + "]";
	}

	
}
