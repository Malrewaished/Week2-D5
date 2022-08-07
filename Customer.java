public class Customer {

    private int ID;
    private String name;
    private char gender;
    int discount;

    public Customer(int ID, String name, char gender , int discount) {
        this.ID = ID;
        this.name = name;
        setGender(gender);
        this.discount = discount;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setGender(char gender) {
        if (this.gender == 'f' || this.gender == 'm') {
            this.gender = this.gender;
        }
        else
            throw new RuntimeException("warning ");
    }

    @Override
    public String toString() {
        return "Main{" +
                "name='" + name + '\'' +
                '}';
    }
}