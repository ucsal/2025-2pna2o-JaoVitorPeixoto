import br.com.mariojp.solid.ocp.*;
import br.com.mariojp.solid.ocp.policies.*;

public class Main {
	public static void main(String[] args) {
		DiscountCalculator calc = new DiscountCalculator();
		System.out.println("REGULAR 100 -> " + calc.apply(100, new RegularPolicy()));
		System.out.println("PREMIUM 100 -> " + calc.apply(100, new PremiumPolicy()));
		// PARTNER deveria ter 12%
		System.out.println("PARTNER 100 -> " + calc.apply(100, new PartnerPolicy()));
	}
}
