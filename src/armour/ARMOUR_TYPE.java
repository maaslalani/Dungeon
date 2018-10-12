package armour;

public enum ARMOUR_TYPE {
	LEATHER("leather"),
	IRON("iron"),
	GOLD("gold");
	
	private String value;
	
	ARMOUR_TYPE(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public static ARMOUR_TYPE getSwordType(String value) {
		
		for(ARMOUR_TYPE armour : ARMOUR_TYPE.values()) {
			if(armour.value.equalsIgnoreCase(value)) {
				return armour;
			}
		}
		return null;
	}
	
}