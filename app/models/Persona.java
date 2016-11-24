package models;


import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import play.db.ebean.*;
import play.data.validation.*;


@Entity
public class Persona extends Model{
  @Id
  public Long id;

  public String nombre;
 /**
 * para buscar elementos
 */
  public static Finder<Long, Persona> find = new Finder<Long,Persona>(Persona.class);
}
