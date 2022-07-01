package co.com.choucair.certification.retoautomatizacion.tasks;

import co.com.choucair.certification.retoautomatizacion.model.UtestDatos;
import co.com.choucair.certification.retoautomatizacion.userinterface.PaginaDispositivos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static  co.com.choucair.certification.retoautomatizacion.userinterface.PaginaDispositivos.*;

import java.util.List;

public class LlenarDispositivos implements Task {

    private List<UtestDatos> datos;

    public LlenarDispositivos(List<UtestDatos> datos) {
        this.datos = datos;
    }

    public static LlenarDispositivos laPagina(List<UtestDatos> datos) {
        return Tasks.instrumented(LlenarDispositivos.class,datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(CONTENEDOR_DISPOSITIVO),
            Enter.theValue(datos.get(0).getStrDispositivoMovil()).into(DISPOSITIVO_MOVIL).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
            Click.on(CONTENEDOR_MODELO_MOVIL),
            Enter.theValue(datos.get(0).getStrModeloMovil()).into(MODELO_MOVIL).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
            Click.on(CONTENEDOR_SO),
            Enter.theValue(datos.get(0).getStrSoMovil()).into(SO).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
            Click.on(BOTON_FINAL)


            );
    }
}
