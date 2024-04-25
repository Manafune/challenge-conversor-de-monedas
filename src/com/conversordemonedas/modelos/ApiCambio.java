package com.conversordemonedas.modelos;

public record ApiCambio(String base_code, String target_code, double conversion_result) {
}
