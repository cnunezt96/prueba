package co.com.choucair.certification.retoautomatizacion.tasks;

import co.com.choucair.certification.retoautomatizacion.model.UtestDatos;
import co.com.choucair.certification.retoautomatizacion.userinterface.PaginaFinal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static co.com.choucair.certification.retoautomatizacion.userinterface.PaginaFinal.*;

import java.util.List;

public class LlenarFinal implements Task {

    private List<UtestDatos> datos;

    public LlenarFinal(List<UtestDatos> datos) {
        this.datos = datos;
    }

    public static LlenarFinal laPagina(List<UtestDatos> datos) {
        return Tasks.instrumented(LlenarFinal.class,datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(datos.get(0).getStrClave()).into(CLAVE),
                Enter.theValue(datos.get(0).getStrClave()).into(CONFIRMAR_CLAVE),
                Click.on(CHECKBOX1),
                Click.on(CHECKBOX2),
                Click.on(CHECKBOX3),
                Click.on(BOTON_COMPLETADO)

        );
        
    }
}
