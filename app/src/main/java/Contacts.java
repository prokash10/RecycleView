public class Contacts {

    private String name;
    private String phone;
    private String imageid;

    //constructor


    public Contacts(String name, String phone, String imageid) {
        this.name = name;
        this.phone = phone;
        this.imageid = imageid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImageid() {
        return imageid;
    }

    public void setImageid(String imageid) {
        this.imageid = imageid;
    }
}
