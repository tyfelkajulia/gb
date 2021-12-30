package ru.gb;

import java.util.Iterator;
import java.util.Set;

public class PhoneBook {

    private Set<PhoneItem> phones;

    public PhoneBook(Set<PhoneItem> phones) {
        this.phones = phones;
    }

    public void add(PhoneItem phoneItem){
        phones.add(phoneItem);
    }

    public PhoneItem get(String lastname){
        Iterator<PhoneItem> iterator = phones.iterator();
        while(iterator.hasNext() ){
            PhoneItem phoneItem = iterator.next();
            if(phoneItem.getLastname().equals(lastname)){
                return phoneItem;
            }
        }
        return null;
    }

    public Set<PhoneItem> getPhones() {
        return phones;
    }

    public void setPhones(Set<PhoneItem> phones) {
        this.phones = phones;
    }
}
