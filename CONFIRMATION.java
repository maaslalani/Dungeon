
public enum CONFIRMATION {
	
	YES("yes"),
	YUP("yup"),
	OK("ok"),
	OKAY("okay"),
	SURE("sure"),
	YA("ya"),
	OFCOURSE("ofcourse");
	
	private String value;
	
	CONFIRMATION(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public static boolean isConfirmation(String value) {
		
		for(CONFIRMATION conf : CONFIRMATION.values()) {
			if(conf.value.equalsIgnoreCase(value)) {
				return true;
			}
		}
		return false;
	}
	
}
