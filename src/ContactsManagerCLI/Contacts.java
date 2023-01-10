package ContactsManagerCLI;

class Contacts {
    private final String name;
    private final String phoneNumber;

    public Contacts(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return name + " | " + phoneNumber;
    }

    public static Contacts fromString(String string) {
        String[] parts = string.split(" \\| ");
        return new Contacts(parts[0], parts[1]);
    }

    //TODO creating the get name method

    public Object getName() {
        return null;
    }
}
