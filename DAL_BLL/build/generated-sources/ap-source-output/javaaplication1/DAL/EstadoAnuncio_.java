package javaaplication1.DAL;

import javaaplication1.DAL.Anuncio;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-10-22T07:09:06")
@StaticMetamodel(EstadoAnuncio.class)
public class EstadoAnuncio_ { 

    public static volatile SingularAttribute<EstadoAnuncio, Integer> idEstado;
    public static volatile ListAttribute<EstadoAnuncio, Anuncio> anuncioList;
    public static volatile SingularAttribute<EstadoAnuncio, String> designacao;

}