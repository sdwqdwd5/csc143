package college;

public enum Major {
	PHYSICS("PHYSICS"), ASTRONOMY("ASTRONOMY"), COMPUTER_SCIENCE("COMPUTER SCIENCE"), ENGINEERING("ENGINEERING");
	
	private String major;
	
	private Major(String major) {
		this.major = major;
	}
	
	public String toString() {
		return major;
	}
}
