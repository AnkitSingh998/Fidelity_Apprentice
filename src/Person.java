public class Person {
    private String name;
    int age;
    String gender;
    Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void Display() {
        System.out.println("Name: " + name + " Age: " + age + " Gender: " + gender);
    }

}
