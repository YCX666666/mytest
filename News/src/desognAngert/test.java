package desognAngert;

public class test {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("peter");
        Angent angent = new Angent(person);
        angent.setName("驻马店代理A");
        angent.buy();
    }
}
