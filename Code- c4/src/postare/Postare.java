package postare;
import java.util.List;

public  interface Postare { 
      List <Pair <User, Reaction>> getReaction();
      List <Pair <User,Share>>getShares() ;
      Integer Impact() ;
       int  ComentCount() ;


}
