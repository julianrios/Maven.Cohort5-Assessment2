package rocks.zipcode.assessment2.generics;


import java.util.*;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<_> implements Iterable<_> {
    private List housing;

    public Shelter() {
        this.housing = new ArrayList();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return this.housing.size();
    }

    public void add(Object object) {
        this.housing.add(object);
    }

    public Boolean contains(Object object) {
        return this.housing.contains(object);
    }

    public void remove(Object object) {
        this.housing.remove(object);
    }

    public Object get(Integer index) {
        return this.housing.get(index);
    }

    public Integer getIndexOf(Object ageable) {
        return this.housing.indexOf(ageable);
    }

    @Override
    public Iterator<_> iterator() {
        return null;
    }
}