package test4;

import java.util.HashSet;

public class Numbers {
    public static void main(String[] args) {
        
        int[] numbers = {1, 2, 3, 4, 5, 6, 4, 8, 3, 10};

       
        HashSet<Integer> Numbers = new HashSet<>();

        
        for (int number : numbers) {
            Numbers.add(number);
        }

        
        System.out.println("จำนวนตัวเลขที่ไม่ซ้ำกันทั้งหมด " + Numbers);
        System.out.print("ตัวเลขที่ไม่ซ้ำกัน: ");
        
     
        for (int number : Numbers) {
            System.out.print(number + "ตัวเลขที่ไม่ซ้ำกัน");
        }
    }
}
