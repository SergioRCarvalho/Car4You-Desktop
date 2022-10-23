package javaaplication1.DAL;

import javaaplication1.DAL.Anuncio;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-10-22T07:09:06")
@StaticMetamodel(Imagem.class)
public class Imagem_ { 

    public static volatile SingularAttribute<Imagem, Integer> idImagem;
    public static volatile ListAttribute<Imagem, Anuncio> anuncioList;
    public static volatile SingularAttribute<Imagem, String> link;
    public static volatile SingularAttribute<Imagem, String> designacao;

}