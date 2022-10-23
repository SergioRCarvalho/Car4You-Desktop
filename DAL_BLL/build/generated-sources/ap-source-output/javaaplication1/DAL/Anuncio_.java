package javaaplication1.DAL;

import java.util.Date;
import javaaplication1.DAL.Combustivel;
import javaaplication1.DAL.Denuncia;
import javaaplication1.DAL.EstadoAnuncio;
import javaaplication1.DAL.Imagem;
import javaaplication1.DAL.Modelo;
import javaaplication1.DAL.Servico;
import javaaplication1.DAL.TipoDesgaste;
import javaaplication1.DAL.TipoSegmento;
import javaaplication1.DAL.TipoVeiculo;
import javaaplication1.DAL.Utilizador;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-10-22T07:09:06")
@StaticMetamodel(Anuncio.class)
public class Anuncio_ { 

    public static volatile SingularAttribute<Anuncio, Integer> nPortas;
    public static volatile SingularAttribute<Anuncio, Date> dataFim;
    public static volatile SingularAttribute<Anuncio, String> cor;
    public static volatile SingularAttribute<Anuncio, String> designacao;
    public static volatile SingularAttribute<Anuncio, Integer> kms;
    public static volatile SingularAttribute<Anuncio, Utilizador> idUtilizador;
    public static volatile SingularAttribute<Anuncio, String> caixa;
    public static volatile SingularAttribute<Anuncio, Integer> cilindrada;
    public static volatile SingularAttribute<Anuncio, Combustivel> idCombustivel;
    public static volatile SingularAttribute<Anuncio, Modelo> idModelo;
    public static volatile SingularAttribute<Anuncio, Integer> ano;
    public static volatile SingularAttribute<Anuncio, String> urlVideo;
    public static volatile SingularAttribute<Anuncio, Imagem> idImagem;
    public static volatile SingularAttribute<Anuncio, TipoDesgaste> idDesgaste;
    public static volatile ListAttribute<Anuncio, Servico> servicoList;
    public static volatile SingularAttribute<Anuncio, TipoVeiculo> idTipoVeiculo;
    public static volatile SingularAttribute<Anuncio, Double> valor;
    public static volatile SingularAttribute<Anuncio, String> descricao;
    public static volatile SingularAttribute<Anuncio, Integer> estadoVeiculo;
    public static volatile SingularAttribute<Anuncio, Integer> renegociar;
    public static volatile SingularAttribute<Anuncio, Integer> potencia;
    public static volatile SingularAttribute<Anuncio, EstadoAnuncio> idEstado;
    public static volatile SingularAttribute<Anuncio, Date> dataCriado;
    public static volatile SingularAttribute<Anuncio, TipoSegmento> idSegmento;
    public static volatile ListAttribute<Anuncio, Denuncia> denunciaList;
    public static volatile SingularAttribute<Anuncio, String> matricula;
    public static volatile SingularAttribute<Anuncio, Integer> lotacao;
    public static volatile SingularAttribute<Anuncio, Integer> idAnuncio;

}