/* Given an array of File objects, sort it so that directories
 * come before files, and within each group, elements are sorted by path name.
 * Use a lambda expression to specify the Comparator. */

package com.hellozakhar.chapter3_Interfaces_and_Lambda_Expressions;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class ch03_Task13 {

    private static void sortDirectoryContents(File[] files) {
        Comparator<File> comp = Comparator
                .comparing(File::isDirectory,
                           (isDirLeft, isDirRight) -> isDirLeft == isDirRight ? 0 : isDirLeft ? -1 : 1)
                .thenComparing(File::getPath, String::compareTo);

        Arrays.sort(files, comp);
    }

    public static void main(String[] args) {
        // get full (absolute) path of this project
        String path = new File("").getAbsolutePath();
        File dir = new File(path + "");
        // creating directories if necessary
        boolean created = dir.mkdirs();
        File[] files = dir.listFiles();

        sortDirectoryContents(files);

        System.out.println("sorted directories with files: ");
        for (File file : files) {
            System.out.println(file);
        }
    }
}
