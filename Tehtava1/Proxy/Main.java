package Proxy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Image> photolibrary = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            photolibrary.add(new ProxyImage("Photo_"+(i+1)));
        }

        System.out.println("Names of the photos in the library:");

        for (Image image : photolibrary) {
            image.showData();
        }

        System.out.println("Display images");
        for (Image image : photolibrary) {
            image.displayImage();
        }

    }
}
