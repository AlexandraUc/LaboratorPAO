package immutability;

public class OperatingSystem {
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String day) {
        this.name = day;
    }

    @Override
    public String toString() {
        return "OperatingSystem{" +
                "Name='" + name + '}';
    }
}
