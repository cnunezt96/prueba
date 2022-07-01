package co.com.choucair.certification.retoautomatizacion.questions;

import co.com.choucair.certification.retoautomatizacion.model.UtestDatos;
import co.com.choucair.certification.retoautomatizacion.userinterface.PaginaFinal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Responder implements Question {

    private List<UtestDatos> datos;

    public Responder(List<UtestDatos> datos) {
        this.datos = datos;
    }

    public static Responder aLos(List<UtestDatos> datos) {
        return new Responder(datos);
    }



    @Override
    public Object answeredBy(Actor actor) {
        String Boton_final = Text.of(PaginaFinal.BOTON_COMPLETADO).viewedBy(actor).asString();
        return datos.get(0).getStrTextoFinal().equals(Boton_final);
    }
}
