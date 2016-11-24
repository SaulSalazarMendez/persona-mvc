package controllers;


import views.html.*;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Transaction;
import play.mvc.*;
import play.data.*;
import play.db.ebean.*;
import com.avaje.ebean.Model;
import static play.data.Form.*;
import static play.libs.Json.toJson;



import models.*;
import javax.inject.Inject;
import javax.persistence.PersistenceException;
import java.util.List;



/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(index.render("Your new application is ready."));
    }


    public Result verPersonas(){
      List<Persona> personas = new Model.Finder(String.class, Persona.class).all();
      return ok(views.html.verPersonas.render(personas));
    }

    public Result crear(){
      return ok(views.html.nuevo.render("Nuevo nombre"));
    }

    public Result guardarPersona(){
      //cargamos los datos del formulario
      Persona persona = Form.form(Persona.class).bindFromRequest().get();
      persona.save();
      return redirect(routes.HomeController.verPersonas());
    }

}
