package com.conversordemonedas.modelos;

public class Menu {

    public void mostrarMenu(){
        String menu = """
                ********************************************
                Sea Bienvenido/a al Conversor de Moneda =]
                
                1) Dólar =>> Peso argentino
                2) Peso argentino =>> Dólar
                3) Dólar =>> Real brasileño
                4) Real brasileño =>> Dólar
                5) Dólar =>> Peso colombiano
                6) Peso colombiano =>> Dólar
                7)Salir
                Elija una opción válida:
                ********************************************
                """;
        System.out.println(menu);
    }
}
