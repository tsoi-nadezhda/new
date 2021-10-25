package telran.util;

import java.util.function.Predicate;

public class EqualStringsPredicate implements Predicate<String> {
	private String str;

	public EqualStringsPredicate(String str) {
	this.str = str;
	
}

	@Override
	public boolean test(String t) {
		return t.equals(str);
	}
}
