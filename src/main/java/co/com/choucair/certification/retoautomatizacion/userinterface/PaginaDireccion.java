package co.com.choucair.certification.retoautomatizacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaDireccion {

    public static final Target CIUDAD = Target.the("Seleccionar ciudad").located(By.id("city"));
    public static final Target ZIP = Target.the("Ingresar zip").located(By.id("zip"));
    public static final Target CONTENEDOR_PAIS = Target.the("Contenedor Pais").located(By.name("countryId"));
    public static final Target PAIS = Target.the("Seleccionar pais").locatedBy("//*[@name='countryId']/input");
    public static final Target BOTON_DISPOSITIVOS = Target.the("Boton que nos dirige al formulario dispositivos").located(By.xpath("//a[@class='btn btn-blue pull-right']"));



}
