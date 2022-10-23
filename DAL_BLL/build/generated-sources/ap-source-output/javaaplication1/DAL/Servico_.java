package javaaplication1.DAL;

import java.util.Date;
import javaaplication1.DAL.Anuncio;
import javaaplication1.DAL.TiposPagamento;
import javaaplication1.DAL.TiposServico;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-10-22T07:09:06")
@StaticMetamodel(Servico.class)
public class Servico_ { 

    public static volatile SingularAttribute<Servico, Date> dataFim;
    public static volatile SingularAttribute<Servico, Double> valor;
    public static volatile SingularAttribute<Servico, TiposPagamento> meioPagamento;
    public static volatile SingularAttribute<Servico, String> designacao;
    public static volatile SingularAttribute<Servico, Date> dataInicio;
    public static volatile SingularAttribute<Servico, TiposServico> idTipoServico;
    public static volatile SingularAttribute<Servico, Anuncio> idAnuncio;
    public static volatile SingularAttribute<Servico, Integer> idSevico;

}