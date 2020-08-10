package college;

public enum Rank {
	FRESHMAN("FRESHMAN"), SOPHOMORE("SOPHOMORE"), JUNIOR("JUNIOR"), SENIOR("SENIOR");
	
	private String rank;
	
	private Rank(String rank) {
		this.rank = rank;
	}
	
	
	public String toString() {
		return rank;
	}
}
