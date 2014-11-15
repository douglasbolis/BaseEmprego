package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.ElementoLista;
import play.*;
import play.libs.F;
import play.libs.Json;
import play.libs.ws.WS;
import play.libs.ws.WSResponse;
import play.mvc.*;

import scala.Option;
import scala.util.parsing.json.JSON;
import scala.util.parsing.json.JSONObject$;
import views.html.*;

import java.util.ArrayList;
import java.util.List;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render());
    }

    public static List<ElementoLista> estados() {

        F.Promise<JsonNode> jsonPromise = WS.url("http://" + request().host() + "/assets/mock/estados.json").get().map(
                new F.Function<WSResponse, JsonNode>() {
                    public JsonNode apply(WSResponse response) {
                        return response.asJson();
                    }
                }
        );

        JsonNode node = jsonPromise.get(10000);
        ObjectNode saida = Json.newObject();


        ArrayList<ElementoLista> lista = new ArrayList<>();
        for (JsonNode el : node) {
//            if (q.isDefined() && !q.isEmpty() && !q.get().isEmpty()) {
//                if (el.findValue("text").toString().toUpperCase().contains(q.get().toUpperCase())) {
//                    lista.add(new ElementoLista(el.findValue("id").toString(),el.findValue("text").toString()));
//                }
//            } else {
//                lista.add(new ElementoLista(el.findValue("id").toString(),el.findValue("text").toString()));
//            }
            lista.add(new ElementoLista(el.findValue("id").toString().replace("\"",""),el.findValue("text").toString().replace("\"","")));


        }


        return lista;


    }

}
