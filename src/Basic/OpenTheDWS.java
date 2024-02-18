package Basic;

public class OpenTheDWS extends UtilityClass {
public static void main(String[] args) {
	precondition();
	driver.get("https://demowebshop.tricentis.com/");
	postCondition();
}
}
