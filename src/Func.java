import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Func {
    public static void main(String[] args) throws IOException {
        String gender = "";
        double activity = 0.0;
        String job = "";
        int age = 0;
        double weight = 0;

        // Выбор пола
        do {
            System.out.println("Введите свой пол (male/female)");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            gender = reader.readLine();
        } while (!gender.equals("male") && !gender.equals("female"));

        // Выбор активности
        do {
            System.out.println("Оцените свою активность по шкале от 1 до 3 (больше - активнее)");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            job = reader.readLine();
            if(job.equals("1")){
                activity = 1.1;
            } else if(job.equals("2")){
                activity = 1.3;
            } else
                activity = 1.5;
        } while (!job.equals("1") && !job.equals("2") && !job.equals("3") );

        // Ввод возраста
        do {
            System.out.println("Ваш возраст?");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try{
                age = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException e){

            }
        } while (age < 18 || age > 100);

        // Ввод веса
        do {
            System.out.println("Ваш вес?");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try{
                weight = Double.parseDouble(reader.readLine());
            } catch (NumberFormatException e){

            }

        } while (weight < 30 || weight > 300);


        double value = calc(gender, activity, age, weight);
        System.out.println(value);
    }

    static double calc(String gender, double activity, int age, double weight){
        if(gender.equals("female")){
            if(age <= 30){
                return (0.0621 * weight + 2.0357) * 240 * activity;
            } else if(age > 31 && age < 60){
                return (0.0342 * weight + 3.5377) * 240 * activity;
            } else{
                return (0.0377 *weight + 2.7545) * 240 * activity;
            }
        } else{
            if(age <= 30){
                return (0.0630 * weight + 2.8957) * 240 * activity;
            } else if(age > 31 && age < 60){
                return (0.0484 * weight + 3.6534) * 240 * activity;
            } else{
                return (0.0491 * weight + 2.4587) * 240 * activity;
            }
        }
    }
}
