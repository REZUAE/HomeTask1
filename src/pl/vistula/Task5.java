package pl.vistula;

import java.math.BigDecimal;

public class Task5 {
    public static void main(String[] args) {

        double productCost= 9.99;
        System.out.println("price without VAT" + productCost);

        double priceWithVat = productCost * 1.23;
        System.out.println("Price with VAT" + priceWithVat);

        double valueWithVat = priceWithVat * 10000;
        System.out.println("Value with VAT" + valueWithVat);

        double priceWithoutVat = valueWithVat / 1.23;
        System.out.println("Value WITHOUT VAT" + priceWithoutVat);

        /// decimal
        BigDecimal dbproductCost = new BigDecimal("9.99");
        System.out.println("Price w/o VAT " + dbproductCost);

        BigDecimal dbPriceWithVat = dbproductCost.multiply(new BigDecimal("1.23"));

        dbPriceWithVat = dbPriceWithVat.setScale(2,BigDecimal.ROUND_HALF_EVEN);
        System.out.println("Price with VT rounded : " + dbPriceWithVat);

        BigDecimal dbValueWithVat = dbPriceWithVat.multiply(new BigDecimal(10000));
        System.out.println("Value with VAT" + dbValueWithVat);

        BigDecimal dbPriceWithoutVat = dbValueWithVat.divide(new BigDecimal("1.23"),
                BigDecimal.ROUND_HALF_EVEN);
        System.out.println("Value without VAT:" + dbPriceWithoutVat);

        //STUDENT ID 56297


    }
}
