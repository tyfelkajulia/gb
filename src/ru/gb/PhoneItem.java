package ru.gb;

public class PhoneItem {

    private String lastname;
    private int phone;

    public PhoneItem(String lastname, int phone) {
        this.lastname = lastname;
        this.phone = phone;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "PhoneItem{" +
                "lastname='" + lastname + '\'' +
                ", phone=" + phone +
                '}';
    }
}
