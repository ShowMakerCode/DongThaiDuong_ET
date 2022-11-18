package com.smk.problem01;

import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        String input;
        int index = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Please enter: ");
            input = scanner.nextLine();
            if (input.isEmpty()) System.out.println("Please,do not leave blank");
        } while (input.isEmpty());
        String[] words = input.split("\\s", 0);
        for (int i = 1; i < words.length; i++) {
            if (words[index].length() < words[i].length()) {
                index = i;
            }
        }
        System.out.println("Result: " + words[index]);
    }
}
