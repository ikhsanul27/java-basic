package basic.day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FirstCourse {
    static String fileName;
    static ArrayList<String> dataLists;
    static boolean isEditing = false;
    static Scanner input;

    static void menu() {
        System.out.println("=== Task Java Basic ===");
        System.out.println("[1] Lihat Data");
        System.out.println("[2] Tambah Data");
        System.out.println("[3] Edit Data");
        System.out.println("[4] Hapus Data");
        System.out.println("[0] Keluar");
        System.out.println("---------------------");
        System.out.print("Pilih menu> ");

        String selectedMenu = input.nextLine();

        if (selectedMenu.equals("1")) {
            loadData();
        } else if (selectedMenu.equals("2")) {
            simpanData();
        } else if (selectedMenu.equals("3")) {
            ubahData();
        } else if (selectedMenu.equals("4")) {
            hapusData();
        } else if (selectedMenu.equals("0")) {
            System.exit(0);
        } else {
            System.out.println("Kamu salah pilih menu!");
            backToMenu();
        }
    }
    static void clear() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                // clear screen untuk windows
                new ProcessBuilder("cmd", "/c", "cls")
                        .inheritIO()
                        .start()
                        .waitFor();
            } else {
                // clear screen untuk Linux, Unix, Mac
                Runtime.getRuntime().exec("clear");
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            System.out.println("Error karena: " + e.getMessage());
        }
    }

    static void backToMenu() {
        System.out.println("");
        System.out.print("Tekan [Enter] untuk kembali..");
        input.nextLine();
        clear();
    }

    static void loadData() {
        try {
            System.out.println(dataLists);
        } catch (Exception e) {
            System.out.println("Error karena: " + e.getMessage());
        }
    }

    static void bacaData() {
        clear();
        loadData();
        if (dataLists.size() > 0) {
            System.out.println("Data :");
            int index = 0;
            for (String data : dataLists) {
                System.out.println(String.format("[%d] %s", index, data));
                index++;
            }
        } else {
            System.out.println("Tidak ada data!");
        }

        if (!isEditing) {
            backToMenu();
        }
    }

    static void simpanData() {
        clear();

        System.out.print("Silahkan masukkan Data yang ingin dtambahkan : ");
        String newDataList = input.nextLine();

        try {
            // tulis file
            dataLists.add(newDataList);
            System.out.println("Berhasil ditambahkan!");
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan karena: " + e.getMessage());
        }

        backToMenu();
    }

    static void ubahData() {
        isEditing = true;
        bacaData();

        try {
            System.out.println("-----------------");
            System.out.print("Pilih Indeks> ");
            int index = Integer.parseInt(input.nextLine());

            if (index > dataLists.size()) {
                throw new IndexOutOfBoundsException("Kamu memasukan data yang salah!");
            } else {

                System.out.print("Data baru: ");
                String newData = input.nextLine();

                // update data
                dataLists.set(index, newData);

                System.out.println(dataLists.toString());

                try {

                    // write new data
                    System.out.println("Berhasil diubah!");
                } catch (Exception e) {
                    System.out.println("Terjadi kesalahan karena: " + e.getMessage());
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        isEditing = false;
        backToMenu();
    }

    static void hapusData() {
        isEditing = true;
        bacaData();

        System.out.println("-----------------");
        System.out.print("Pilih Indeks> ");
        int index = Integer.parseInt(input.nextLine());

        try {
            if (index > dataLists.size()) {
                throw new IndexOutOfBoundsException("Kamu memasukan data yang salah!");
            } else {

                System.out.println("Kamu akan menghapus:");
                System.out.println(String.format("[%d] %s", index, dataLists.get(index)));
                System.out.println("Apa kamu yakin?");
                System.out.print("Jawab (y/t): ");
                String jawab = input.nextLine();

                if (jawab.equalsIgnoreCase("y")) {
                    // hapus data
                    dataLists.remove(index);

                    // tulis ulang file
                    try {
                        System.out.println("Berhasil dihapus!");
                    } catch (Exception e) {
                        System.out.println("Terjadi kesalahan karena: " + e.getMessage());
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        isEditing = false;
        backToMenu();
    }

    public static void main(String[] args) {
        dataLists = new ArrayList<>();
        input = new Scanner(System.in);

        // run the program (main loop)
        while (true) {
            menu();
        }
    }
}
