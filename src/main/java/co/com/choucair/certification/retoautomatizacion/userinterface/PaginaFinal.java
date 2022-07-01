package co.com.choucair.certification.retoautomatizacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaFinal {

    public static final Target CLAVE = Target.the("Clave de usuario").located(By.id("password"));
    public static final Target CONFIRMAR_CLAVE = Target.the("Confirmar clave de usuario").located(By.id("confirmPassword"));
    public static final Target CHECKBOX1 = Target.the("Checbox 1").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target CHECKBOX2 = Target.the("Checbox 2").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECKBOX3 = Target.the("Checbox 3").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BOTON_COMPLETADO = Target.the("Boton de completar el registro").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div/a"));



}
