package co.com.choucair.certification.retoautomatizacion.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInfoPersonal   {
    public static final Target NOMBRE = Target.the("Ingresar el nombre").located(By.id("firstName"));
    public static final Target APELLIDO = Target.the("Ingresar el apellido").located(By.id("lastName"));
    public static final Target CORREO = Target.the("Ingresar el correo").located(By.id("email"));
    public static final Target MES = Target.the("Ingresar mes de nacimiento").located(By.id("birthMonth"));
    public static final Target DIA = Target.the("Ingresar dia de nacimiento").located(By.id("birthDay"));
    public static final Target ANO = Target.the("Ingresar año de nacimiento").located(By.id("birthYear"));
    public static final Target BOTON_UBICACION = Target.the("Boton que nos dirige al formulario ubicación").located(By.xpath("//a[@class = 'btn btn-blue']"));
}
