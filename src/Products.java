import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Products {
    static HashMap<String, Integer> productsAndCalories = new HashMap<>();
    public static void main(String[] args) throws IOException {
        String product;
        productsAndCalories.put("Рис", 360);
        productsAndCalories.put("Адреналин раш", 234);
        productsAndCalories.put("Ролл", 325);
        productsAndCalories.put("Куриная грудка", 170);
        productsAndCalories.put("Куриная ножка", 198);
        productsAndCalories.put("Гречка", 343);
        productsAndCalories.put("Свинина", 242);
        productsAndCalories.put("Говядина", 250);
        productsAndCalories.put("Сахар", 387);
        productsAndCalories.put("Кофе растворимый", 432);
        productsAndCalories.put("Макароны", 371);
        productsAndCalories.put("Чипсы", 510);
        productsAndCalories.put("Шампиньоны", 22);

        do {
            System.out.println("Введите название продукта, чтобы узнать его калорийность");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            product = reader.readLine();
        } while (!productsAndCalories.containsKey(product));

        int ccl = calcCcl(product);
        System.out.println(ccl);
    }

    static int calcCcl(String product){
        return productsAndCalories.get(product);
    }
}

















//HashMap<String, Integer> productsAndCalories = new HashMap<>();
//        productsAndCalories.put("Рис", 360);
//        int i = productsAndCalories.get("Рис");
//        System.out.println(i);
//        productsAndCalories.put("", );