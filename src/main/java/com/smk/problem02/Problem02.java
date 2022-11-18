package com.smk.problem02;

import com.smk.problem02.dao.Service.BookOnTapeService;
import com.smk.problem02.dao.Service.FurnitureService;
import com.smk.problem02.dao.Service.VideoService;
import com.smk.problem02.entity.BookOnTape;
import com.smk.problem02.entity.Furniture;
import com.smk.problem02.entity.Video;

import java.io.IOException;
import java.util.Scanner;


public class Problem02 {
    public static VideoService videoService = new VideoService();
    public static FurnitureService furnitureService = new FurnitureService();
    public static BookOnTapeService bookOnTapeService = new BookOnTapeService();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int option;
        do {
            System.out.println("\n--------------------");
            System.out.println("1.Start");
            System.out.println("2.Stop");
            System.out.println("--------------------");
            System.out.println("Enter Your Option : ");
            try {
                option = Integer.parseInt(scanner.nextLine());
                if (option == 1) menu();
                if (option == 2) {
                    System.out.println("The system has stopped");
                    break;
                }
            } catch (Exception e) {
                System.out.println("Pls Enter 1 to 2");
            }

        } while (true);
    }

    public static void menu() throws IOException {
        int index;
        Long seri = null;
        do {
            System.out.println("------------------Your Options--------------");
            System.out.println("1.Video");
            System.out.println("2.BookOnTape");
            System.out.println("3.Furniture");
            System.out.println("4.Exit");
            System.out.println("---------------------------------------------\n");
            try {
                index = Integer.parseInt(scanner.nextLine());
                if (index > 0 && index < 5) break;
            } catch (Exception e) {
                System.out.println("Pls Enter Number 1 to 4");
            }
        } while (true);
        if (index > 0 && index < 4) {
            do {
                try {
                    System.out.println("Enter Your Seri: ");
                    seri = Long.parseLong(scanner.nextLine());
                    break;
                }catch (Exception e ){
                    System.out.println("Serial number Incorrect format pls try again");
                }
            }while (true);

        }
        switch (index) {
            case 1:
                Video video = videoService.FindBySeri(seri);
                if (video != null) System.out.println(video.getDescription());
                else System.out.println("Serial number does not exist");
                break;
            case 2:
                BookOnTape bookOnTape = bookOnTapeService.findBySeri(seri);
                if (bookOnTape != null) System.out.println(bookOnTape.getDescription());
                else System.out.println("Serial number does not exist");
                break;
            case 3:
                Furniture furniture = furnitureService.findBySeri(seri);
                if (furniture != null) System.out.println(furniture.getDescription());
                else System.out.println("Serial number does not exist");
                break;
            case 4:
                System.out.println("System is exits");
                break;
        }
    }
}
