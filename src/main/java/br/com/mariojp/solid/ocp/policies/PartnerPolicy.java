package br.com.mariojp.solid.ocp.policies;

import br.com.mariojp.solid.ocp.CustomerType;
import br.com.mariojp.solid.ocp.DiscountPolicy;

public class PartnerPolicy implements DiscountPolicy{

    private final CustomerType customerType = CustomerType.PARTNER;
    private final double discountRate = 0.88; // 12% de desconto

    // Caso queira usar uma taxa de desconto personalizada passando por injeção de depêndencia
    // public PartnerPolicy(double discountRate) {
    //     this.discountRate = discountRate;
    // }

    public double apply(double amount) {
        return amount * this.discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }
}
