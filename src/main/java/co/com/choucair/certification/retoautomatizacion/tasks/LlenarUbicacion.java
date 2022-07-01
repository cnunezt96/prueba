package co.com.choucair.certification.retoautomatizacion.tasks;

import co.com.choucair.certification.retoautomatizacion.model.UtestDatos;
import co.com.choucair.certification.retoautomatizacion.userinterface.PaginaDireccion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.choucair.certification.retoautomatizacion.userinterface.PaginaDireccion.*;

import java.util.List;

public class LlenarUbicacion implements Task {
    private List<UtestDatos> datos;


    public LlenarUbicacion(List<UtestDatos> datos) {
        this.datos = datos;
    }

    public static LlenarUbicacion laPagina(List<UtestDatos> datos) {
        return Tasks.instrumented(LlenarUbicacion.class,datos);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(


                Enter.theValue(datos.get(0).getStrCiudad()).into(CIUDAD),
                Hit.the(Keys.ARROW_DOWN).into(CIUDAD),
                Hit.the(Keys.ENTER).into(CIUDAD),
                Enter.theValue(datos.get(0).getStrZip()).into(ZIP),
                Click.on(CONTENEDOR_PAIS),
                Enter.theValue(datos.get(0).getStrPais()).into(PAIS),
                Click.on(BOTON_DISPOSITIVOS)


        );
    }
}
