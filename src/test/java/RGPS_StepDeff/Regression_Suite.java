package RGPS_StepDeff;

import RGPS_Page_Actions.RGPS_BlogDetailsPage_Action;
import RGPS_Page_Actions.RGPS_BlogPage_Action;
import RGPS_Page_Actions.RGPS_HomePage_Action;
import RGPS_Page_Actions.RGPS_LibraryPage_Action;
import RGPS_Page_Actions.RGPS_NoticePage_Action;
import RGPS_Page_Actions.RGPS_NoticeboardDetailsPage_Action;
import RGPS_Page_Actions.RGPS_ProfilePage_Action;
import RGPS_Page_Actions.RGPS_SigninPage_Action;
import RGPS_Page_Actions.RGPS_SignupPage_Action;
import RGPS_Page_Actions.RGPS_StudentSupportPage_Action;
import RGPS_Page_Actions.RGPS_TeachersPage_Action;
import RGPS_Page_Locators.RGPS_SignupPage_Locator;
import RGPS_Utility.RGPS_Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Regression_Suite extends RGPS_Base{
	RGPS_HomePage_Action RRGPS_HomePage_Action = new RGPS_HomePage_Action();
	RGPS_SigninPage_Action RRGPS_SigninPage_Action = new RGPS_SigninPage_Action();
	RGPS_SignupPage_Action RRGPS_SignupPage_Action =new RGPS_SignupPage_Action();
	RGPS_ProfilePage_Action RRGPS_ProfilePage_Action = new RGPS_ProfilePage_Action();
	RGPS_NoticePage_Action RRGPS_NoticePage_Action = new RGPS_NoticePage_Action();
	RGPS_NoticeboardDetailsPage_Action RRGPS_NoticeboardDetailsPage_Action = new RGPS_NoticeboardDetailsPage_Action();
	RGPS_BlogPage_Action RRGPS_BlogPage_Action = new RGPS_BlogPage_Action();
	RGPS_BlogDetailsPage_Action RRGPS_BlogDetailsPage_Action = new RGPS_BlogDetailsPage_Action();
	RGPS_LibraryPage_Action RRGPS_LibraryPage_Action = new RGPS_LibraryPage_Action();
	RGPS_StudentSupportPage_Action RRGPS_StudentSupportPage_Action = new RGPS_StudentSupportPage_Action();
	RGPS_TeachersPage_Action RRGPS_TeachersPage_Action = new RGPS_TeachersPage_Action();
	
	@Given("^Open \"([^\"]*)\" Application$")
	public void open_Application(String arg1) throws Throwable {
		RGPSLaunchingURL("RGPS_URL");
		Thread.sleep(3000);
	}

	@Then("^click login button$")
	public void click_login_button() throws Throwable {
		RRGPS_HomePage_Action.Login_button();
	}

	@Then("^Verify sign in page display$")
	public void verify_sign_in_page_display_after_clicking_login_button() throws Throwable {
		RRGPS_SigninPage_Action.Signin_display();

	}

	@Then("^Verify all fields display in sign in page$")
	public void verify_all_fields_display_in_sign_in_page() throws Throwable {
		RRGPS_SigninPage_Action.Fieldsdisplay();
	}
	
	@Then("^Verify Forget Password Link display$")
	public void verify_Forget_Password_Link_display() throws Throwable {
		RRGPS_SigninPage_Action.forgetpassword();	
	}
	
	@Then("^Verify sign up link display in Signin page$")
	public void verify_sign_up_link_display_in_Signin_page() throws Throwable {
		RRGPS_SigninPage_Action.Signup_display();
	}
	
	@Then("^click Sign up link$")
	public void click_Sign_up_link() throws Throwable {
		RRGPS_SigninPage_Action.Signupclick();
		
	}

	@Then("^Verify sign up page display when click sign up link$")
	public void verify_sign_up_page_display_when_click_sign_up_link() throws Throwable {
		RRGPS_SignupPage_Action.signupdisplay();
	}
	
	@Then("^enter Email Address and password$")
	public void enter_Email_Address_and_password() throws Throwable {
		RRGPS_SigninPage_Action.enteremailpassword();
	}

	@Then("^click Sign In button$")
	public void click_Sign_In_button() throws Throwable {
		RRGPS_SigninPage_Action.signin_button();
	    
	}

	@Then("^Verify user able to Sign in$")
	public void verify_user_able_to_Sign_in() throws Throwable {
		RRGPS_ProfilePage_Action.able_tosign();
		
	}	
	@Then("^mouse hover to Acadamic Link$")
	public void mouse_hover_to_Acadamic_Link() throws Throwable {
		RRGPS_HomePage_Action.mouse_hover(); 
	}

	@Then("^Verify Four option link display$")
	public void verify_Four_option_link_display() throws Throwable {
		RRGPS_HomePage_Action.Option_Page_Display();  
	}
	
	@Then("^Verify Notice page appear when click Notice link$")
	public void verify_Notice_page_appear_when_click_Notice_link() throws Throwable {
		RRGPS_NoticePage_Action.VerifyNoticepageappear_whenclickNoticelink();
	}

	   
	@Then("^click notice link$")
	public void click_notice_link() throws Throwable {
		RRGPS_HomePage_Action.Click_Notice_Link();
	}

	@Then("^Verify notice board displays$")
	public void verify_notice_board_displays() throws Throwable {
		RRGPS_NoticePage_Action.Notice_Board_Display();
	}
	
	@Then("^Verify Title Data and View display$")
	public void verify_Title_Data_and_View_display() throws Throwable {
		RRGPS_NoticePage_Action.Title_Data_View_Display();
	}
	
	@Then("^click view$")
	public void click_view() throws Throwable {
		RRGPS_NoticePage_Action.Click_View();
	}

	@Then("^Verify notice board details display$")
	public void verify_notice_board_details_display() throws Throwable {
		RRGPS_NoticeboardDetailsPage_Action.Verify_noticeboard_detailsdisplay();
	}
	
	@Then("^click Blog Link$")
	public void click_Blog_Link() throws Throwable {
		RRGPS_HomePage_Action.Click_Blog_Link();
	}

	@Then("^Verify Blog page display$")
	public void verify_Blog_page_display() throws Throwable {
		RRGPS_BlogPage_Action.Verify_Blogpage_display();
	}
	
	@Then("^click on the details$")
	public void click_on_the_details() throws Throwable {
		RRGPS_BlogPage_Action.click_thedetails();	
	}

	@Then("^Verify Blog Notice details will display Grandpartents$")
	public void verify_Blog_Notice_details_will_display_Grandpartents() throws Throwable {
		RRGPS_BlogDetailsPage_Action.BlogNoticedetailsdisplay_Grandpartents();
	}
	
	@Then("^click on the annual details$")
	public void click_on_the_annual_details() throws Throwable {
		RRGPS_BlogPage_Action.clickannual_details();
	}
	
	@Then("^Verify Blog Notice details will display AnnualDay$")
	public void verify_Blog_Notice_details_will_display_AnnualDay() throws Throwable {
		RRGPS_BlogDetailsPage_Action.Verifyblogdetailsdisplay_AnnualDay();
	}
	
	@Then("^click on the field trip details$")
	public void click_on_the_field_trip_details() throws Throwable {
		RRGPS_BlogPage_Action.click_fieldtrip_details();
	}

	@Then("^Verify Blog Notice will display FieldTrip$")
	public void verify_Blog_Notice_will_display_FieldTrip() throws Throwable {
		RRGPS_BlogDetailsPage_Action.VerifyBlogNoticedisplay_FieldTrip();
	}
	
	@Then("^click on the Festival Celebrations details$")
	public void click_on_the_Festival_Celebrations_details() throws Throwable {
		RRGPS_BlogPage_Action.clickFestivalCelebrations_details();
	}

	@Then("^Verify Blog Notice details will display Festival$")
	public void verify_Blog_Notice_details_will_display_Festival() throws Throwable {
		RRGPS_BlogDetailsPage_Action.VerifyBlogNoticedetailsdisplay_Festival();
	}
	
	@Then("^click on the Science Fair details$")
	public void click_on_the_Science_Fair_details() throws Throwable {
		RRGPS_BlogPage_Action.clickScienceFair_details();
	}

	@Then("^Verify Blog Notice details will display ScienceFair$")
	public void verify_Blog_Notice_details_will_display_ScienceFair() throws Throwable {
		RRGPS_BlogDetailsPage_Action.VerifyBlogNoticedetailsdisplay_ScienceFair();
	}
	
	@Then("^Verify signup page is display$")
	public void verify_signup_page_is_display() throws Throwable {
		RRGPS_SignupPage_Action.Verifysignuppage_display();
	}
	
	@Then("^Verify All fields and button available$")
	public void verify_All_fields_and_button_available() throws Throwable {
		RRGPS_SignupPage_Action.VerifyNamefielddisplay_signuppage();
		RRGPS_SignupPage_Action.VerifyEmailfielddisplay_signuppage();
		RRGPS_SignupPage_Action.VerifyPasswordfielddisplay_signuppage();
		RRGPS_SignupPage_Action.VerifySignUpfielddisplay_signuppage();
	}
	
	@Then("^Verify Choose File button is available in signup page$")
	public void verify_Choose_File_button_is_available_in_signup_page() throws Throwable {
		RRGPS_SignupPage_Action.Verify_ChooseFilebuttonavailable_signuppage();
	}
	
	@Then("^Verify Already have an account yet Sign In is available$")
	public void verify_Already_have_an_account_yet_Sign_In_is_available() throws Throwable {
		RRGPS_SignupPage_Action.Verify_AlreadyhaveanaccountyetSignIn_isavailable();
	}
	
	@Then("^click Sign In link$")
	public void click_Sign_In_link() throws Throwable {
		RRGPS_SignupPage_Action.click_SignIn_link();
	}

	@Then("^Verify Sign in page appear when click Sign In link$")
	public void verify_Sign_in_page_appear_when_click_Sign_In_link() throws Throwable {
		RRGPS_SigninPage_Action.Verify_Signinpageappearwhenclick_SignInlink();
	}
	
	@Then("^click examinations link$")
	public void click_examination_link() throws Throwable {
		RRGPS_HomePage_Action.clickexamination_link();
	}

	@Then("^Verify after clicking Examination link Sign in page will appear$")
	public void verify_after_clicking_Examination_link_Sign_in_page_will_appear() throws Throwable {
		RRGPS_SigninPage_Action.Verify_Signinpageappearafterclick_Examinationlink();
	}
	
	@Then("^click Library link$")
	public void click_Library_link() throws Throwable {
		RRGPS_HomePage_Action.click_Librarylink();
	}

	@Then("^Verify after clicking Library link Labrary page will appear$")
	public void verify_after_clicking_Library_link_Labrary_page_will_appear() throws Throwable {
		RRGPS_LibraryPage_Action.VerifyLabrarypageappear_afterclickingLibrarylink();
	}

	@Then("^click Student Support link$")
	public void click_Student_Support_link() throws Throwable {
		RRGPS_HomePage_Action.click_StudentSupportlink();  
	}

	@Then("^Verify after clicking Student Support link Student Support page will appear$")
	public void verify_after_clicking_Student_Support_link_Student_Support_page_will_appear() throws Throwable {
		RRGPS_StudentSupportPage_Action.VerifyStudentSupportpageappear_afterclickingStudentSupportlink(); 
	}
	
	@Then("^click Teachers link$")
	public void click_Teachers_link() throws Throwable {
		RRGPS_HomePage_Action.click_Teacherslink();
	}

	@Then("^Verify after clicking Teachers link Teachers page will appear$")
	public void verify_after_clicking_Teachers_link_Teachers_page_will_appear() throws Throwable {
		RRGPS_TeachersPage_Action.VerifyTeacherspageappear_afterclickingTeacherslink();
	}


}


















