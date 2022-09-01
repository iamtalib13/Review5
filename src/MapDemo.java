import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Person{
    Map<String,Person> map = new HashMap<String,Person>();
    public String name;
    public int contact;
    public Person getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public void setPerson(String name, int contact) {
        Person personObj = new Person();

        personObj.setName(name);
        personObj.setContact(contact);
     map.put("Name",personObj.getName());
    }

    public  void getPerson(){
        Set<String> Keys=map.keySet();
        for(String key : Keys)
        {
            System.out.println(key + " = " + map.get(key));
        }

    }

}

public class MapDemo {
    public static void main(String[] args) {

    Person p=new Person();
    p.setContact("Talib",8793679424);




    }
}
