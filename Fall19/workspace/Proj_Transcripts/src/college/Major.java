package college;

public enum Major {
	PHYS("Physics"), ASTR("Astronomy"), CSC("Computer Science"), ENG("Engineering");
	
	private String major;
	
	private Major(String major) {
		this.major = major;
	}
	
	public String toString() {
		return major;
	}
	/*create a toFile() method to write the information that
	 * matches the format in the original text file.
	 */
	public String toFile() {
		if (major.equals("Physics")) {
			return "PHYS";
		}else if (major.equals("Astronomy")){
			return "ASTR";
		}else if (major.equals("Computer Science")) {
			return "CSC";
		}else {
			return "ENG";
		}
	}
}
