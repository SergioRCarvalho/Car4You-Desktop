package javaaplication1.DAL;

import java.math.BigInteger;
import java.util.Date;
import javaaplication1.DAL.Anuncio;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-10-22T07:09:06")
@StaticMetamodel(Denuncia.class)
public class Denuncia_ { 

    public static volatile SingularAttribute<Denuncia, BigInteger> relsovido;
    public static volatile SingularAttribute<Denuncia, Date> data;
    public static volatile SingularAttribute<Denuncia, Integer> idDenuncia;
    public static volatile SingularAttribute<Denuncia, String> titulo;
    public static volatile SingularAttribute<Denuncia, BigInteger> visto;
    public static volatile SingularAttribute<Denuncia, Anuncio> idAnuncio;
    public static volatile SingularAttribute<Denuncia, String> descricao;

}