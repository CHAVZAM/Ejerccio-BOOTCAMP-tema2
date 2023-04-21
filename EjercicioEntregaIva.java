package com.company;

import java.math.BigDecimal;

public class EjercicioEntregaIva {
    public static void main(String[] args) {
        BigDecimal price = new BigDecimal(10.0);
        BigDecimal priceWithTax = addTax(price, 0.13);
        System.out.println(priceWithTax);
    }

    public static BigDecimal addTax(BigDecimal price, double taxRate) {
        return price.multiply(new BigDecimal(1 + taxRate));
    }
}
