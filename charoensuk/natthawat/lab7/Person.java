/**
 * Abstract class representing a general Person.
 *
 * @author Natthawat Charoensuk
 * @version 1.0, 06/02/2026
 * @Student_ID 683040410-1
 * @Section 2   
 */
package charoensuk.natthawat.lab7;

public abstract class Person {
    protected String name;
    protected String id;

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + "]";
    }

    /**
     * Abstract method to be implemented by subclasses to return their specific
     * role.
     */
    public abstract String getRole();
}