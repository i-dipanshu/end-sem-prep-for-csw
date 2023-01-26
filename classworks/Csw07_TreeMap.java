import java.util.Map;
import java.util.TreeMap;

/*  Create a class Address having member variables plot no, post, 
    city and required member functions.
    Create a TreeMap having key as name of a person and 
    value as address. Insert the required key and 
    value in the TreeMap and display it. 
*/

public class Csw07_TreeMap {
    public static void main(String[] args) {

        // data
        String[] persons = { "Sam", "Ram", "Val", "Kia" };
        String[] city = { "city1", "city2", "city2", "city2" };

        // initializing a treeMap
        Map<String, Address> treeMap = new TreeMap<>();

        // inserting elements
        for (int i = 0; i < city.length; i++) {
            treeMap.put(persons[i], new Address(i, i * 10, city[i]));
        }

        // Note: TreeMap sorts the elements on the basis of key
        System.out.println(treeMap);
    }
}

class Address {
    int plot_no;
    int post;
    String city;

    Address(int plot_no, int post, String city) {
        this.plot_no = plot_no;
        this.post = post;
        this.city = city;
    }

    // overriding to print the data for each person
    @Override
    public String toString() {
        return "[ Plot No: " + plot_no + ", Post: " + post + ", City: " + city + " ]";
    }
}
