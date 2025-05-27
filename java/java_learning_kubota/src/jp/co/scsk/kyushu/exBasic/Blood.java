package jp.co.scsk.kyushu.exBasic;

public class Blood {
	
	private String bloodType;
	public static final String TYPEA = "A";
	public static final String TYPEB = "B";
	public static final String TYPEAB = "AB";
	public static final String TYPEO = "O";
	
	public boolean isA() {
		return this.bloodType.equals(TYPEA);
	}
	
	public boolean isB() {
		return this.bloodType.equals(TYPEB);
	}
	
	public boolean isAB() {
		return this.bloodType.equals(TYPEAB);
	}
	
	public boolean isO() {
		return this.bloodType.equals(TYPEO);
	}
}
