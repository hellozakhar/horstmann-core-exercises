/* Using the list(FilenameFilter) method of the java.io.File class,
 * write a method that returns all files in a given directory
 * with a given extension. Use a lambda expression, not a FilenameFilter.
 * Which variable from the enclosing scope does it capture? */

package com.hellozakhar.chapter3_Interfaces_and_Lambda_Expressions;

import java.io.File;
import java.util.Arrays;

public class ch03_Task12 {

    public static File[] getFiles(File dir, String extension) {
        return dir.listFiles((f,s) -> s.endsWith("." + extension));
    }

    public static void main(String[] args) {
        // get full (absolute) path of this project
        String path = new File("").getAbsolutePath();
        File dir = new File(path + "/.idea");
        // creating directories if necessary
        boolean created = dir.mkdirs();

        File[] files = getFiles(dir, "xml");

        for (File file: files)
            System.out.println(file.getName());
    }
}
