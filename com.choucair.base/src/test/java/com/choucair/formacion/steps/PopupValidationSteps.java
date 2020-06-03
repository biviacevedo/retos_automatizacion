package com.choucair.formacion.steps;



import com.choucair.formacion.pageobjects.ColorlibLoginPage;
import com.choucair.formacion.pageobjects.ColorlibMenuPage;

import net.thucydides.core.annotations.Step;

public class PopupValidationSteps{
	
	ColorlibMenuPage colorlibMenuPage;
	ColorlibLoginPage colorlibLoginPage;
	

	@Step
	public void login_colorlib (String strUsuario, String strPass) {
		colorlibLoginPage.open();
		colorlibLoginPage.IngresarDatos(strUsuario,strPass);
		colorlibLoginPage.VerificarHome();
	}
	
	@Step
	public void ingresar_form_validation() {
		colorlibMenuPage.menuFormValidation();
	}

}
