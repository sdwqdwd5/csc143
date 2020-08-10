package college;

public enum Title {
	PHYS("PHYS", 222), 
	ASTR("ASTR", 100), 
	CSC ("CSC" , 143),
	ENG ("ENG" , 214),
	MATH("MATH", 163);
	
	private String prefix;
	private int    number;
	
	private Title(String prefix, int number) {
		this.prefix = prefix;
		this.number = number; 
	}
	public String toFile() {
		return prefix;
	}
	public String toString() {
		return prefix +""+ number;
	}
}
