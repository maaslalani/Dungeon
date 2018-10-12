package swords;

public enum SWORD_TYPE {
	WOOD("wood"),
	METAL("metal"),
	GOLD("gold");
	
	private String value;
	
	SWORD_TYPE(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public static SWORD_TYPE getSwordType(String value) {
		
		for(SWORD_TYPE sword : SWORD_TYPE.values()) {
			if(sword.value.equalsIgnoreCase(value)) {
				return sword;
			}
		}
		return null;
	}
	
}
