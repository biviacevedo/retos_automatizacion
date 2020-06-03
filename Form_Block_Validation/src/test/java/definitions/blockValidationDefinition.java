package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.BlockValidationSteps;

public class blockValidationDefinition {

    @Steps
    BlockValidationSteps blockValidationSteps;


    @Given("^Autentico en colorlib con usuario \"([^\"]*)\" y clave \"([^\"]*)\"$")
    public void autenticoEnColorlibConUsuarioYClave(String User, String Pass) {
        blockValidationSteps.login_color_lib(User, Pass);

    }

    @Given("^Ingreso a la funcionalidad Forms Validation y Block Validation$")
    public void ingresoALaFuncionalidadFormsValidationYBlockValidation() {
        blockValidationSteps.ingresar_form_blockvalidation();

    }

    @When("^Diligencio los campos \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void diligencioLosCampos(String required, String email, String pass1, String pass2, String date, String url, String digits, String range) {
        blockValidationSteps.ingresar_datos_form(required,email,pass1,pass2,date,url,digits,range);
    }

    @Then("^Verifico ingreso exitoso$")
    public void verificoIngresoExitoso() {
        blockValidationSteps.verificar_ingreso_datos_formulario_exitoso();

    }

    @Then("^Verifico que se presente un mensaje de error$")
    public void verificoQueSePresenteUnMensajeDeError() {
        blockValidationSteps.verificar_ingreso_datos_con_error();
    }


}


