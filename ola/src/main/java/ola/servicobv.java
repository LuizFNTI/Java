
package ola;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Stateless
@Path("Bemvindo")

public class servicobv {
    @GET
    @Path("oi/{nome}/{sobrenome}")
    @Produces("application/json")
    public String oi(@PathParam("nome") String nome, @PathParam("sobrenome") String sobrenome) {
        return "Oi Seja Bem-Vindo " + nome;
    }
}
