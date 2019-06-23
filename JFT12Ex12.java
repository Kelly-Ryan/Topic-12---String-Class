public class JFT12Ex12 {

    public static void main(String[] args) {

        String name = "Daniel Franks";
        int age = 30;
        int averageAge = 23;

        if(age > averageAge) {

            System.out.printf("%s your age of %d is greater than the average age (%d)\n", name, age, averageAge);

        } else if (age < averageAge) {

            System.out.printf("%s your age of %d is less than the average age (%d)\n", name, age, averageAge);

        } else if (age == averageAge) {

            System.out.printf("%s your age of %d is equal to the average age (%d)\n", name, age, averageAge);

        }
    }
}
