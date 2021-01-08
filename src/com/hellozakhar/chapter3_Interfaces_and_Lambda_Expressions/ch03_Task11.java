/* Using the listFiles(FileFilter) and isDirectory methods of
 * the java.io.File class, write a method that
 * returns all subdirectories of a given directory.
 * Use a lambda expression instead of a FileFilter object.
 * Repeat with a method expression and an anonymous inner class. */

package com.hellozakhar.chapter3_Interfaces_and_Lambda_Expressions;

import java.io.File;
import java.io.FileFilter;

public class ch03_Task11 {
    public static File[] getDirectories(File dir) {
        return dir.listFiles(File::isDirectory);
    }

    public static File[] getDirectoriesAnonymous(File dir) {
        return dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory();
            }
        });
    }

    static private void printFiles(File[] files) {
        for (File file: files) {
            System.out.println(file.getName());
        }
    }

    public static void main(String[] args) {
        // get full (absolute) path of this project
        String path = new File("").getAbsolutePath();
        File dir = new File(path);
        // creating directories if necessary
        boolean created = dir.mkdirs();

        System.out.println("print directories using lambda expression: ");
        printFiles(getDirectories(dir));

        System.out.println("print directories using anonymous inner class: ");
        printFiles(getDirectoriesAnonymous(dir));
    }
}
