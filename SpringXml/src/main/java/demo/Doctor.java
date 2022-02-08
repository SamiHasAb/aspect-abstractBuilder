package demo;

public class Doctor implements Staff {
	
	private String gender;
	private Qualification qualification;

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Qualification getQualification() {
		return qualification;
	}

	public void setQualification(Qualification qualification) {
		this.qualification = qualification;
	}




	public void assist() {
		System.out.println("Doctor is assisting...");
	}

}
