package telran.util;

import java.util.function.Predicate;

public class EqualNumbersPredicate implements Predicate<Integer> {
	private Integer number;

	public EqualNumbersPredicate(Integer number) {
		this.number = number;
	}

	@Override
	public boolean test(Integer t) {
		return t == number;
	}

}
