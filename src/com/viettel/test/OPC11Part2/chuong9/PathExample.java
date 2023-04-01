package com.viettel.test.OPC11Part2.chuong9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {
    public static void main(String[] args) throws IOException {

        /*Path path = Paths.get("/land/hippo/harry.happy");
        System.out.println("The Path Name is: " +path);
        for (int i = 0; i < path.getNameCount(); i++) {
            System.out.println("Element " + i +" is: " +path.getName(i));
        }
        System.out.println("subpath(0,3): " + path.subpath(0, 3));
        System.out.println("subpath(1,2): " + path.subpath(1, 2));
        System.out.println("subpath(1,3): " + path.subpath(1, 3));*/

        /*printPathInformation(Path.of("zoo"));
        printPathInformation(Path.of("/zoo/armadillo/shells.txt"));
        printPathInformation(Path.of("./armadillo/../shells.txt"));*/

        /*var path1 = Path.of("fish.txt");
        var path2 = Path.of("friendly/birds.txt");
        System.out.println(path1.relativize(path2));
        System.out.println(path2.relativize(path1));*/

        /*var p1 = Path.of("./armadillo/../shells.txt");
        System.out.println(p1.normalize());// shells.txt*/

        System.out.println(Paths.get("zebar/food.txt").toRealPath());
        System.out.println(Paths.get("../../food.txt").toRealPath());

    }

    public static void printPathInformation(Path path) {
        System.out.println("Filename is: " +path.getFileName());
        System.out.println("Root is: " + path.getRoot());
        Path currentPath = path;
        while ((currentPath = currentPath.getParent()) != null) {
            System.out.println("Current parent is: " +currentPath);
        }
    }
}
