package com.choucair.formacion.pageobjects;



import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ColorlibFormValidationPage extends PageObject {

//Campo Required
	@FindBy(id="req")
	public WebElementFacade txtRequired;
//Campo Seleccion de deporte 1
	@FindBy(xpath="//*[@id=\'sport\']")
	public WebElementFacade comboSport1;
//Campo Seleccion de deporte 2
	@FindBy(xpath="//*[@id=\'sport2\']")
	public WebElementFacade cmbSport2;
//Campo Url
	@FindBy(xpath="//*[@id=\'url1\']")
	public WebElementFacade txtUrl;
//Campo email	
	@FindBy(id="email1")
	public WebElementFacade txtEmail;
//Campo password1
	@FindBy(id="pass1")
	public WebElementFacade txtpass1;
//Campo password2
	@FindBy(id="pass2")
	public WebElementFacade txtpass2;
//Campo MinSize
	@FindBy(id="minsize1")
	public WebElementFacade txtMinsize;
//Campo MaxSize
	@FindBy(name="maxsize1")
	public WebElementFacade txtMaxsize;
//Campo Number
	@FindBy(id="number2")
	public WebElementFacade txtNumber;
//Campo IP
	@FindBy(id="ip")
	public WebElementFacade txtIp;
//Campo Date
	@FindBy(id="date3")
	public WebElementFacade txtDate;
//Campo Date Earlier
	@FindBy(id="past")
	public WebElementFacade txtDateEarlier;
//Boton Validate
	@FindBy(xpath="//*[@id=\'popup-validation\']/div[14]/input")
	public WebElementFacade btnValidate;

	public void required(String datoPrueba) {
		txtRequired.click();
		txtRequired.clear();
		txtRequired.sendKeys(datoPrueba);
	}
	public void select_sport(String datoPrueba) {
		comboSport1.click();
		comboSport1.selectByVisibleText(datoPrueba);
	}
	public void multiple_select(String datoPrueba) {
		cmbSport2.selectByVisibleText(datoPrueba);
	}
	public void url(String datoPrueba) {
		txtUrl.click();
		txtUrl.clear();
		txtUrl.sendKeys(datoPrueba);
	}
	public void email(String datoPrueba) {
		txtEmail.click();
		txtEmail.clear();
		txtEmail.sendKeys(datoPrueba);
	}
	public void password(String datoPrueba) {
		txtpass1.click();
		txtpass1.clear();
		txtpass1.sendKeys(datoPrueba);
	}
	public void confirm_password(String datoPrueba) {
		txtpass2.click();
		txtpass2.clear();
		txtpass2.sendKeys(datoPrueba);
	}
	public void minimun_field_size(String datoPrueba) {
		txtMinsize.click();
		txtMinsize.clear();
		txtMinsize.sendKeys(datoPrueba);
	}
	public void maximun_field_size(String datoPrueba) {
		txtMaxsize.click();
		txtMaxsize.clear();
		txtMaxsize.sendKeys(datoPrueba);
	}
	public void number(String datoPrueba) {
		txtNumber.click();
		txtNumber.clear();
		txtNumber.sendKeys(datoPrueba);
	}
	public void ip(String datoPrueba) {
		txtIp.click();
		txtIp.clear();
		txtIp.sendKeys(datoPrueba);
	}
	public void date(String datoPrueba) {
		txtDate.click();
		txtDate.clear();
		txtDate.sendKeys(datoPrueba);
	}
	public void date_earlier(String datoPrueba) {
		txtDateEarlier.click();
		txtDateEarlier.clear();
		txtDateEarlier.sendKeys(datoPrueba);
	}
	public void boton_Validate() {
		btnValidate.click();
	}
//Globo informativo
	@FindBy(xpath="(//DIV[@class='formErrorContent'])[1]")
	public WebElementFacade globo_Informativo;
	
	public void form_sin_errores() {
		assertThat(globo_Informativo.isCurrentlyVisible(), is(false));
	}
	public void form_con_errores() {
		assertThat(globo_Informativo.isCurrentlyVisible(),is(true));
	}
}
