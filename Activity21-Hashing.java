
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, String> capitalCities = new HashMap<String, String>();

        capitalCities.put("England", "London");
        capitalCities.put("India", "New Delhi");
        capitalCities.put("Austria", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        System.out.println(capitalCities);
        System.out.println(capitalCities.get("England"));

        capitalCities.remove("England");
        System.out.println(capitalCities);

        capitalCities.clear();

        System.out.println(capitalCities);
    }
}
