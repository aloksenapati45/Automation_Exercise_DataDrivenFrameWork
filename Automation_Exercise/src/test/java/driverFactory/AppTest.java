package driverFactory;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import applicationLayer.Login_User_With_InCorrect_Email_And_Password;
import applicationLayer.Login_User_with_correct_email_and_password;
import applicationLayer.RegisterUser;
import config.Base;
import utilites.ExcelFileUtil;

public class AppTest extends Base
{
	String FileInput = "./FileInput/UserRegistration.xlsx";
	String sheetNameUserReg = "UserReg";
	String sheetNameLoginWithValidCredential = "LoginWithValidCredential";
	String sheetNameLoginWithInvalidCredential = "LoginWithInValidCredential";
	@Test(priority = 1)
	public void registerUserCheck() throws Throwable
	{		
		ExcelFileUtil excel = new ExcelFileUtil(FileInput);
		int rc = excel.getRow(sheetNameUserReg);
		for(int i = 1;i<=rc;i++)
		{
			String Name = excel.getCellData(sheetNameUserReg, i, 0);
			String Email = excel.getCellData(sheetNameUserReg, i, 1);
			String Password = excel.getCellData(sheetNameUserReg, i, 2);
			String Day = excel.getCellData(sheetNameUserReg, i, 3);
			String Month = excel.getCellData(sheetNameUserReg, i, 4);
			String Year = excel.getCellData(sheetNameUserReg, i, 5);
			String FirstName = excel.getCellData(sheetNameUserReg, i, 6);
			String LastName = excel.getCellData(sheetNameUserReg, i, 7);
			String Company = excel.getCellData(sheetNameUserReg, i, 8);
			String Address1 = excel.getCellData(sheetNameUserReg, i, 9);
			String Address2 = excel.getCellData(sheetNameUserReg, i, 10);
			String Country = excel.getCellData(sheetNameUserReg, i, 11);
			String State = excel.getCellData(sheetNameUserReg, i, 12);
			String City = excel.getCellData(sheetNameUserReg, i, 13);
			String ZipCode = excel.getCellData(sheetNameUserReg, i, 14);
			String Mobile = excel.getCellData(sheetNameUserReg, i, 15);
			RegisterUser ru = PageFactory.initElements(driver, RegisterUser.class);
			ru.userRegistration(Name, Email, Password, Day, Month, Year, FirstName,
					LastName, Company, Address1, Address2, Country, State, City, ZipCode, Mobile);
		}
	}
	@Test(priority = 0)
	public void loginWithValidCredentialCheck() throws Throwable
	{
		ExcelFileUtil excel = new ExcelFileUtil(FileInput);
		int rc = excel.getRow(sheetNameLoginWithValidCredential);
		for(int i = 1;i<=rc;i++)
		{
			String Email = excel.getCellData(sheetNameLoginWithValidCredential, i, 0);
			String Password = excel.getCellData(sheetNameLoginWithValidCredential, i, 1);
			Login_User_with_correct_email_and_password validcredential = PageFactory.initElements(driver, Login_User_with_correct_email_and_password.class);
			validcredential.loginUserWithValidInput(Email, Password);
		}
	}
	@Test(priority = 2)
	public void loginWithInValidCredentialCheck() throws Throwable
	{
		ExcelFileUtil excel = new ExcelFileUtil(FileInput);
		int rc = excel.getRow(sheetNameLoginWithInvalidCredential);
		for(int i = 1;i<=rc;i++)
		{
			String Email = excel.getCellData(sheetNameLoginWithInvalidCredential, i, 0);
			String Password = excel.getCellData(sheetNameLoginWithInvalidCredential, i, 1);
			Login_User_With_InCorrect_Email_And_Password invalidcredential = PageFactory.initElements(driver, Login_User_With_InCorrect_Email_And_Password.class);
			invalidcredential.loginUserWithInvalidCredential(Email, Password);
		}
	}
}

