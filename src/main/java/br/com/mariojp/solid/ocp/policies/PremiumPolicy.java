package br.com.mariojp.solid.ocp.policies;

import br.com.mariojp.solid.ocp.CustomerType;
import br.com.mariojp.solid.ocp.DiscountPolicy;

public class PremiumPolicy implements DiscountPolicy{

    private final CustomerType customerType = CustomerType.PREMIUM;
    private final double discountRate = 0.90; // 10% de desconto

    // Caso queira usar uma taxa de desconto personalizada passando por injeção de depêndencia
    // public PremiumPolicy(double discountRate) {
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
