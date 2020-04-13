public class Person {
    private String phoneNumber;
    private String info;

    public Person(String phoneNumber, String info) {
        this.phoneNumber = phoneNumber;
        this.info = info;
    }

    public Person() {
        this.phoneNumber = "";
        this.info = "";
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
