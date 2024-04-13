package immutability;

public class MutableLaptop {
    private final String name;
    private final OperatingSystem operatingSystem;
    public MutableLaptop(String name, OperatingSystem operatingSystem) {
        this.name = name;
        this.operatingSystem = operatingSystem;
    }
    public String getName() {
        return name;
    }
    public OperatingSystem getOperatingSystem() {
        return operatingSystem;
    }

    @Override
    public String toString() {
        return "ImmutablePerson{" +
                "name='" + name + '\'' +
                ", operating system=" + operatingSystem +
                '}';
    }
}
