package college;

public enum Rank {
	FRESH("Freshman"), SOPH("Sophomore"), JUN("Junior"), SEN("Senior");
	
	private String rank;
	
	private Rank(String rank) {
		this.rank = rank;
	}
	
	public String toString() {
		return rank;
	}
	/*create a toFile() method to write the information that
	 * matches the format in the original text file.
	 */
	public String toFile() {
		if (rank.equals("Freshman")) {
			return "FRESH";
		}else if (rank.equals("Sophomore")) {
			return "SOPH";
		}else if (rank.equals("Junior")){
			return "JUN";
		}else {
			return "SEN";
		}
	}
}
