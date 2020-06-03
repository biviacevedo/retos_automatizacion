package pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class Menu_Page_Object extends PageObject {
    @FindBy(xpath="//*[@id=\'menu\']/li[6]/a/span[1]")
    public WebElement menuForms;

    @FindBy(xpath="//*[@id=\'menu\']/li[6]/ul/li[2]/a")
    public WebElement formValidation;

    @FindBy(xpath="//*[@id=\'menu\']/li[6]/ul/li[1]/a")
    public WebElement formGeneral;

    @FindBy(xpath="//*[@id=\"content\"]/div/div/div[2]/div/div/header/h5")
    public WebElement lblFormBlockValidation;

    public void menuFormBlockValidation() {

        menuForms.click();
        formValidation.click();
        String strMensaje = lblFormBlockValidation.getText();
        assertThat(strMensaje,containsString("Block Validation"));
    }
}
