package desognAngert;

/**代理商
 import java.util.function.Consumer;
 **/
public class Angent implements Consumer {
    private String name;
    public String getName(){return name;}
    public void setName(String name){this.name = name;}
    Person person;
    public Angent(Person person){ this.person = person;}
    @Override
    public void buy(){
        System.out.println(name+"提供货源，供"+person.getName()+"选择...");
        person.buy();
        System.out.println(name+"收到货款，向"+person.getName()+"发货...");
    }
}
