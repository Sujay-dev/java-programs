package Sets.LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

class Customer{
    private int id;
    private String name;

    Customer(int id,String name){
        this.id=id;
        this.name=name;
    }
    public int getid(){
        return id;
    }
    public String getName(){
        return name;
    }
    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Customer)) return false;
        Customer other=(Customer) obj;
        return this.id==other.id;
    }
    @Override
    public int hashCode(){
        return Integer.hashCode(id);
    }
}
public class CustomerEx {
    public static void main(String[] args) {
        Customer c1=new Customer(1, "Sk");
        Customer c2=new Customer(2, "Vedant");
        Customer c3=new Customer(1, "Sk");
        Customer c4=new Customer(3, "Rohan");

        LinkedHashSet<Customer> set=new LinkedHashSet<>();

        set.add(c1);
        set.add(c2);
        set.add(c3);
        set.add(c4);

        Iterator<Customer> it=set.iterator();

        System.out.println("Customers: ");
        while (it.hasNext()) {
            Customer c=it.next();
            System.out.println(c.getid() + " " + c.getName());
        }
        System.out.println(set.size());
    }
}
