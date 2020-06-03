package pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.JavascriptExecutor;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class Form_Block_Validation_Object extends PageObject {

//Campo Required
    @FindBy(xpath = "//*[@id=\'required2\']")
    public WebElementFacade txtrequired2;
//Campo Email
    @FindBy(xpath = "//*[@id=\'email2\']")
    public WebElementFacade txtemail2;
//Campo Password
    @FindBy(name = "password2")
    public WebElementFacade txtpass2;
//Campo Confirm Password
    @FindBy(name = "confirm_password2")
    public WebElementFacade txtconfirmpass2;
//Campo Date
    @FindBy(id = "date2")
    public WebElementFacade txtdate;
//Campo Url
    @FindBy(name = "url2")
    public WebElementFacade txturl2;
//Campo Digits Only
    @FindBy(id = "digits")
    public WebElementFacade numdigit;
//Campo Range
    @FindBy(xpath = "//*[@id=\'range\']")
    public WebElementFacade numrange;
//Check agree to our policy
    @FindBy(xpath = "//*[@id=\'agree2\']")
    public WebElementFacade checpolicy;
//Boton validate
    @FindBy(xpath = "(//INPUT[@type='submit'])[2]")
    public WebElementFacade btnvalidate2;

    public void llenardatos(String required, String email, String pass1, String pass2, String date, String url, String digits, String range){

        JavascriptExecutor jse = (JavascriptExecutor)this.getDriver();
        jse.executeScript("window.scrollBy(0,600)");

        txtrequired2.click();
        txtrequired2.clear();
        txtrequired2.sendKeys(required);

        txtemail2.click();
        txtemail2.clear();
        txtemail2.sendKeys(email);

        txtpass2.click();
        txtpass2.clear();
        txtpass2.sendKeys(pass1);

        txtconfirmpass2.click();
        txtconfirmpass2.clear();
        txtconfirmpass2.sendKeys(pass2);

        txtdate.click();
        txtdate.sendKeys(date);

        txturl2.click();
        txturl2.clear();
        txturl2.sendKeys(url);

        numdigit.click();
        numdigit.clear();
        numdigit.sendKeys(digits);

        numrange.click();
        numrange.clear();
        numrange.sendKeys(range);

        checpolicy.click();

        btnvalidate2.click();


    }

    //Globo informativo
    @FindBy(xpath="//*[@class='form-group has-error']")
    public WebElementFacade txterror;

    public void form_sin_errores() {

        assertThat(txterror.isCurrentlyVisible(), is(false));
    }
    public void form_con_errores() {
        assertThat(txterror.isCurrentlyVisible(),is(true));
    }

}
