public class Contact {
    private  String Name;
    private  int age;
    private  String phoneNo;
    private  String city;
    private  String state;

    public String getName() {
        return Name;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                ", phoneNo='" + phoneNo + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    public void setName(String name) {

        Name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
