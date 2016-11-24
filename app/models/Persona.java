package models;

import com.avaje.ebean.Model;
import play.db.ebean.*;
import play.data.validation.*;

public class Persona extends Model{

  public Long id;

  public String nombre;
}
