package basic.day2.task1;

import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pilih;
        Employee employee = new Employee();
        Developer developer = new Developer();
        Designer designer = new Designer();
        employee.name = employee.inputNm();
        developer.gitHubLink = "http:github.blackeye.id/muhammadIkhsanulFa";
        designer.dribbleLink = "https:dribble.com/IkhsanulFa";
        employee.id = 1;
        employee.phone = employee.inputTlp();
        employee.Detail();
        designer.Detail();
        developer.Detail();

        System.out.print("\nIngin update no telp? (y/n) : ");
        pilih = input.next();
        if(pilih != "n"){
            System.out.print("Masukkan Nomer telpon yg baru : ");
            String newPhone = input.next();
            employee.updatePhone(newPhone);
            employee.Detail();
            developer.Detail();
            designer.Detail();
        }
        else {
            System.out.println("oke");
        }

    }
}
