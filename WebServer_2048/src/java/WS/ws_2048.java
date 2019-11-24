/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS;

import com.google.gson.Gson;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/**
 * REST Web Service
 *
 * @author John
 */
@Path("ws_2048")
public class ws_2048  extends Arquivo{

     @Context
    private UriInfo context;
    
    String Var=new String("teste");
    public ws_2048() {
    }
    
    @GET
    @Produces("application/Json")
    public String getJson() { //requisita os valores
        
        String saida=   Read();
        Gson g= new Gson();
        String aux=g.toJson(saida);
        Write("null");
        
        System.out.println(aux);
        return aux;
    }
    
    @POST
    @Consumes("application/json")
    @Path("inserir")
    public void putInserir(String content){ //escreve os valores
       //System.out.println(content);
        Write(content);
        Var=content;
    }
}
