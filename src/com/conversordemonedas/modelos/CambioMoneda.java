package com.conversordemonedas.modelos;

public class CambioMoneda {
    private String codigoBase;
    private String codigoSeleccionado;
    private double resultadoDeConversion;

    public CambioMoneda(ApiCambio apicambio) {
        this.codigoBase = apicambio.base_code();
        this.codigoSeleccionado = apicambio.target_code();
        this.resultadoDeConversion = apicambio.conversion_result();
    }

    public String getCodigoBase() {
        return codigoBase;
    }

    public String getCodigoSeleccionado() {
        return codigoSeleccionado;
    }

    public double getResultadoDeConversion() {
        return resultadoDeConversion;
    }

    @Override
    public String toString(){
        return "Moneda base: " + this.codigoBase
                + "Moneda Cambio: " + this.codigoSeleccionado
                +"Monto resultante: "+ this.resultadoDeConversion;
    }
}
