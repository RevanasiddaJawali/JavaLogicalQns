package app_java_8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
// \\Ss \\Dd \\Ww [a-z] [A-Z] [0-9] [a-zA-Z0-9] [a-z]^
public class RegularExpression {
public static void main(String[] args) {
	Pattern p = Pattern.compile("[a-z]");
	Matcher m = p.matcher("Pankaj Sir Academy@#1997");
	while (m.find()) {
		System.out.print(m.group());
	}
}
}
