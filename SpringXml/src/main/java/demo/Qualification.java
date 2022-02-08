package demo;

public class Qualification {
	
	private String licenceNumber;
	private String licenceDateOfIssue;
	public String getLicenceNumber() {
		return licenceNumber;
	}
	public void setLicenceNumber(String licenceNumber) {
		this.licenceNumber = licenceNumber;
	}
	public String getLicenceDateOfIssue() {
		return licenceDateOfIssue;
	}
	public void setLicenceDateOfIssue(String licenceDateOfIssue) {
		this.licenceDateOfIssue = licenceDateOfIssue;
	}
	@Override
	public String toString() {
		return "Qualification [licenceNumber=" + licenceNumber + ", licenceDateOfIssue=" + licenceDateOfIssue + "]";
	}
	
	
	

}
