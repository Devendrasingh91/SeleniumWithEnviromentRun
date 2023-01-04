package businessClasses;

import com.BaseClasses.Keywords;

public class SignInPage extends Keywords{

		
	public void enterEmail(String email)
	{
	//	click("CreateAccount_XPATH");
		type("Email_CSS", email);
		
	}

}
