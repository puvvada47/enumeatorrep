public enum Season {

	WINTER(1, "COLD"), 
	SUMMER(2, "HOT"), 
	MONSOON(3, "CHILLY");

	private int id;
	private String taste;

	private Season(int id, String taste) {
		this.id = id;
		this.taste = taste;
	}

	public int getId() {
		return id;
	}

	public String getTaste() {
		return taste;
	}

	public static void main(String[] args) {

		Season s = Season.WINTER;
		System.out.println(s);
		System.out.println(s.name());
		System.out.println(s.getId()+":"+s.getTaste()+":"+s.ordinal()+":"+s.toString()+":"+s.name()+"::"+s.id+":"+s.taste);
		
		for (Season a : Season.values()) {
			System.out.println(a.ordinal());
			System.out.println(a + "::" + a.toString() + "::" + a.name() + "::"
					+ a.getId() + "::" + a.getTaste());
			
			System.out.println(a);
			System.out.println(a.ordinal());
			System.out.println(a.name());
			System.out.println(a.toString());
			System.out.println(a.getId());
			System.out.println(a.getTaste());
			System.out.println(a.id);
			System.out.println(a.taste);
			System.out.println("end of program");
		}
		
		
		
	}

}
