public class Contatto {

    private String name;
    private String phoneNumber;

    public Contatto(String name, String phoneNumber) throws IllegalArgumentException {

        setName(name);
        setPhoneNumber(phoneNumber);
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getPhoneNumber() {

        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) throws IllegalArgumentException {

        for (Character c : phoneNumber.toCharArray())
            // if (!Character.isDigit(c))
            if (c < '0' || c > '9')
                throw new IllegalArgumentException("Il numero di telefono deve contenere solo cifre");

        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {

        return getName() + ": " + getPhoneNumber();
    }
}
