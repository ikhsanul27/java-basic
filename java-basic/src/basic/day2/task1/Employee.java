package basic.day2.task1;

import java.util.Optional;
import java.util.Scanner;

public class Employee {
    String name;
    int id;
    String phone;
    Scanner userinput = new Scanner(System.in);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    void Detail(){
        System.out.println("Id : " + getId());
        System.out.println("Name : "  + getName());
        System.out.println("Phone : " + getPhone());
    }

    public String inputNm(){
        System.out.print("Masukkan Nama : ");
        String nm;
        nm =userinput.next();
        return nm;
    }
    public String inputTlp(){
        System.out.print("Masukkan no tlp : ");
        String tlp;
        tlp =userinput.next();
        return tlp;
    }

    public boolean updatePhone(String phone){

        if(phone != null) {
            this.phone = phone;
            return true;
        }else{
            return false;
        }
    }

}
