package co.com.choucair.certification.retoautomatizacion.stepdefinitions;

import co.com.choucair.certification.retoautomatizacion.model.UtestDatos;
import co.com.choucair.certification.retoautomatizacion.questions.Responder;
import co.com.choucair.certification.retoautomatizacion.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^: Camilo quiere registrarse en Utest$")
    public void camiloQuiereRegistrarseEnUtest() throws Exception {
        OnStage.theActorCalled("Camilo").wasAbleTo(Abrir.laPagina());
    }

    @When("^: El  usuario ingresa los datos requeridos por el sistema$")
    public void elUsuarioIngresaLosDatosRequeridosPorElSistema(List<UtestDatos> datos) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Llenar.laPagina(datos), LlenarUbicacion.laPagina(datos),
                LlenarDispositivos.laPagina(datos), LlenarFinal.laPagina(datos));
    }

    @Then("^: El registro se completa al ver el boton de Complete Setup$")
    public void elRegistroSeCompletaAlVerElBotonDeCompleteSetup(List<UtestDatos> datos) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Responder.aLos(datos)));

    }



}
