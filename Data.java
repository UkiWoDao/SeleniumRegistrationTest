package selenium;

public class Data {
	
	// xpaths
	private static final String prefix = "/html/body/div/table/tbody/tr/td[2]/table/tbody";
	private static final String REGISTER = prefix + "/tr[2]/td/table/tbody/tr/td[2]/a";
	private static final String FNAME = prefix + "/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input";
	private static final String LNAME = prefix + "/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input";
	private static final String PHONE = prefix + "/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/input";
	private static final String MAIL = prefix + "/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[5]/td[2]/input";
	private static final String ADDRESS = prefix + "/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/input";
	private static final String CITY = prefix + "/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/input";
	private static final String STATE = prefix + "/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/input";
	private static final String POSTAL = prefix + "/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/input";
	private static final String SELECT = prefix + "/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[12]/td[2]/select";
	private static final String USERNAME = "//*[@id=\"email\"]";
	private static final String PASSWORD = prefix + "/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input";
	private static final String PASSWORD2 = prefix + "/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[16]/td[2]/input";
	private static final String SUBMIT = prefix + "/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[18]/td/input";
	private static final String SIGNIN = prefix + "/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font/a[1]";
	private static final String SIGNINUSERN = prefix + "/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td[2]/input";
	private static final String SIGNINPASS = prefix + "/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input";
	private static final String SIGNINSUB = prefix + "/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/input";
	private static final String SIGNOFF = prefix + "/tr[2]/td/table/tbody/tr/td[1]/a";
	
	// user data
	private static final String MYUSER = "Uros";
	private static final String MYPASS = "orniturincus3";
	
	public static String getRegister() {
		return REGISTER;
	}
	public static String getFname() {
		return FNAME;
	}
	public static String getLname() {
		return LNAME;
	}
	public static String getPhone() {
		return PHONE;
	}
	public static String getMail() {
		return MAIL;
	}
	public static String getAddress() {
		return ADDRESS;
	}
	public static String getCity() {
		return CITY;
	}
	public static String getState() {
		return STATE;
	}
	public static String getPostal() {
		return POSTAL;
	}
	public static String getSelect() {
		return SELECT;
	}
	public static String getUsername() {
		return USERNAME;
	}
	public static String getPassword() {
		return PASSWORD;
	}
	public static String getPassword2() {
		return PASSWORD2;
	}
	public static String getSubmit() {
		return SUBMIT;
	}
	public static String getSignin() {
		return SIGNIN;
	}
	public static String getSigninUsern() {
		return SIGNINUSERN;
	}
	public static String getSigninPass() {
		return SIGNINPASS;
	}
	public static String getSigninSub() {
		return SIGNINSUB;
	}
	public static String getSignoff() {
		return SIGNOFF;
	}
	public static String getMyUser() {
		return MYUSER;
	}
	public static String getMyPass() {
		return MYPASS;
	}
	
}
