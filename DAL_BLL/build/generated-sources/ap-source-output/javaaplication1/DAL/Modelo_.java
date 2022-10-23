package javaaplication1.DAL;

import javaaplication1.DAL.Anuncio;
import javaaplication1.DAL.Marcas;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-10-22T07:09:06")
@StaticMetamodel(Modelo.class)
public class Modelo_ { 

    public static volatile ListAttribute<Modelo, Anuncio> anuncioList;
    public static volatile SingularAttribute<Modelo, String> designacao;
    public static volatile SingularAttribute<Modelo, Integer> idModelo;
    public static volatile SingularAttribute<Modelo, Marcas> idMarca;

}