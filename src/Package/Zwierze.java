package Package;

public class Zwierze {

    String name;
    Integer age;

    public Zwierze(String name, Integer age) {
        name = name;
        age = age;
    }


    @Override
    public String toString() {
        return "Zwierze{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}



