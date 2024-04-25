package com.conversordemonedas.modelos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {
    private String apikey = "14a3d529ed2944bdcbdbfe99";
    public String convertir(double cantidad, String monedaBase, String monedaCambio){

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/"+apikey+"/pair/"+monedaBase+"/"+monedaCambio+"/"+cantidad);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            Gson gson = new GsonBuilder().create();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            ApiCambio apiCambio =gson.fromJson(response.body(), ApiCambio.class);
            CambioMoneda miMoneda = new CambioMoneda(apiCambio);

            return "El valor de: "+ cantidad +"["+miMoneda.getCodigoBase()+"]"+" corresponde al valor final de =>>> "+miMoneda.getResultadoDeConversion() +" ["+miMoneda.getCodigoSeleccionado() + "]";
        } catch (Exception e) {
            throw new RuntimeException("No se recibio respuesta.");
        }
    }
}
