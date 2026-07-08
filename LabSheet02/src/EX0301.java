package lab02;

import java.util.ArrayList;

public class EX0301 {

    // ฟังก์ชันแสดงข้อมูล
    public static void displayArray(ArrayList<Integer> arr) {
        System.out.println(arr);
    }

    // ฟังก์ชันเพิ่มข้อมูล
    public static void addArraySize(ArrayList<Integer> arr, int value) {
        arr.add(value);
    }

    // ฟังก์ชันลบข้อมูล
    public static void deleteElement(ArrayList<Integer> arr, int index) {
        if(index >= 0 && index < arr.size()) {
            arr.remove(index);
        }
    }

    // ฟังก์ชันแก้ไขข้อมูล
    public static void updateElement(ArrayList<Integer> arr, int index, int value) {
        if(index >= 0 && index < arr.size()) {
            arr.set(index, value);
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // แสดงข้อมูลเริ่มต้น
        System.out.print("Original : ");
        displayArray(numbers);

        // เพิ่มข้อมูล
        addArraySize(numbers, 50);
        System.out.print("After Add : ");
        displayArray(numbers);

        // ลบข้อมูลตำแหน่งที่ 2
        deleteElement(numbers, 2);
        System.out.print("After Delete : ");
        displayArray(numbers);

        // แก้ไขข้อมูลตำแหน่งที่ 1
        updateElement(numbers, 1, 99);
        System.out.print("After Update : ");
        displayArray(numbers);

    }
}