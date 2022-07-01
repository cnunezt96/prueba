package co.com.choucair.certification.retoautomatizacion.tasks;

import co.com.choucair.certification.retoautomatizacion.model.UtestDatos;
import co.com.choucair.certification.retoautomatizacion.userinterface.PaginaInfoPersonal;
import cucumber.api.java.af.En;
import net.bytebuddy.asm.Advice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.choucair.certification.retoautomatizacion.userinterface.PaginaInfoPersonal.*;

import java.util.List;

public class Llenar implements Task {

    private List<UtestDatos> datos;

    public Llenar(List<UtestDatos> datos) {
        this.datos = datos;
    }

    public static Llenar laPagina(List<UtestDatos> datos) {
        return Tasks.instrumented(Llenar.class,datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(datos.get(0).getStrNombre()).into(NOMBRE),
        Enter.theValue(datos.get(0).getStrApellido()).into(APELLIDO),
        Enter.theValue(datos.get(0).getStrCorreo()).into(CORREO),
        SelectFromOptions.byVisibleText(datos.get(0).getStrMes()).from(MES),
        SelectFromOptions.byVisibleText(datos.get(0).getStrDia()).from(DIA),
        SelectFromOptions.byVisibleText(datos.get(0).getStrAno()).from(ANO),
        Click.on(BOTON_UBICACION)
        );

    }
}
