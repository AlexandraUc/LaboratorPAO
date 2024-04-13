package immutability;

public class Laptop {
    private final String name;
    private final OperatingSystem operatingSystem;
    public Laptop(String name, OperatingSystem operatingSystem) {
        this.name = name;
        OperatingSystem cloneOperatingSystem = new OperatingSystem();
        cloneOperatingSystem.setName(operatingSystem.getName());
        this.operatingSystem = cloneOperatingSystem;
    }
    public String getName() {
        return name;
    }
    public OperatingSystem getOperatingSystem() {
        OperatingSystem cloneOperatingSystem = new OperatingSystem();
        cloneOperatingSystem.setName(this.operatingSystem.getName());
        return cloneOperatingSystem;
    }

    @Override
    public String toString() {
        return "ImmutablePerson{" +
                "name='" + name + '\'' +
                ", operating system=" + operatingSystem +
                '}';
    }
}
