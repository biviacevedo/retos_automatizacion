package steps;

import net.thucydides.core.annotations.Step;
import pageobjects.BlockValidationObject;
import pageobjects.Form_Block_Validation_Object;
import pageobjects.Menu_Page_Object;

public class BlockValidationSteps {

    BlockValidationObject blockValidationObject;
    Menu_Page_Object menu_page_object;
    Form_Block_Validation_Object form_block_validation_object;

    @Step
    public void login_color_lib(String User, String Pass) {
        blockValidationObject.open();
        blockValidationObject.ingresar_datos_acceso(User, Pass);
        blockValidationObject.verificarHome();
    }

    @Step
    public void ingresar_form_blockvalidation() {
        menu_page_object.menuFormBlockValidation();
    }

    @Step
    public void ingresar_datos_form(String required, String email, String pass1, String pass2, String date, String url, String digits, String range) {
        form_block_validation_object.llenardatos(required, email, pass1, pass2, date, url, digits, range);

    }

    @Step
    public void verificar_ingreso_datos_formulario_exitoso() {
        form_block_validation_object.form_sin_errores();
    }


    @Step
    public void verificar_ingreso_datos_con_error() {
        form_block_validation_object.form_con_errores();
    }
}
