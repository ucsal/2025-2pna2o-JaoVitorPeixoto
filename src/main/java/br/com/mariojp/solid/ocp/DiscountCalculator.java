package br.com.mariojp.solid.ocp;

public class DiscountCalculator {
    public double apply(double amount, DiscountPolicy policy) {
        return policy.apply(amount);
    }
}
