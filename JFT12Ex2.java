public class JFT12Ex2 {

    public static void main(String[] args){

        String javaFoundations = new String("Java Foundations");
        String jFoundations = "Java Foundations";
        System.out.println(javaFoundations == jFoundations); // false - different memory locations
        System.out.println(javaFoundations.equals(jFoundations)); // true - values are the same
        System.out.println(javaFoundations.compareTo(jFoundations)); // 0 - because they are lexicographically equal
    }

}
