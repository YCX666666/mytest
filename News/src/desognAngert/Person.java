package desognAngert;

public class Person implements Consumer{
    private String name;
    public String getName(){ return name;}
    public void setName(String name){this.name = name;}
    @Override
    public void buy(){
        System.out.println(name+"支付货款，购物");
    }
}
