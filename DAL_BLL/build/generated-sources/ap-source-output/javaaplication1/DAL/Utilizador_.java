package javaaplication1.DAL;

import javaaplication1.DAL.Anuncio;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-10-22T07:09:06")
@StaticMetamodel(Utilizador.class)
public class Utilizador_ { 

    public static volatile SingularAttribute<Utilizador, String> distrito;
    public static volatile SingularAttribute<Utilizador, String> cidade;
    public static volatile SingularAttribute<Utilizador, Integer> nif;
    public static volatile SingularAttribute<Utilizador, String> nome;
    public static volatile SingularAttribute<Utilizador, String> passe;
    public static volatile SingularAttribute<Utilizador, Integer> idUtilizador;
    public static volatile ListAttribute<Utilizador, Anuncio> anuncioList;
    public static volatile SingularAttribute<Utilizador, Integer> telemovel;
    public static volatile SingularAttribute<Utilizador, Integer> tipo_utilizador;
    public static volatile SingularAttribute<Utilizador, String> portaAndar;
    public static volatile SingularAttribute<Utilizador, String> dataRegisto;
    public static volatile SingularAttribute<Utilizador, String> codPostal;
    public static volatile SingularAttribute<Utilizador, String> email;
    public static volatile SingularAttribute<Utilizador, String> morada;

}