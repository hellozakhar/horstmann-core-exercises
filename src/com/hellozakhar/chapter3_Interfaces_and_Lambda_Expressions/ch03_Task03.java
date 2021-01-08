/* What are all the supertypes of String? Of Scanner?
 * Of ImageOutputStream? Note that each type is its own supertype.
 * A class or interface without declared supertype has supertype Object. */

package com.hellozakhar.chapter3_Interfaces_and_Lambda_Expressions;

import javax.imageio.stream.ImageOutputStream;
import java.util.Scanner;

public class ch03_Task03 {
    public static void main(String[] args) {
        String str = new String();
        System.out.println("String 'str' has type: " + str.getClass().getSimpleName());
        System.out.println("Superclass of " + str.getClass().getSimpleName() +
                           " is class "     + str.getClass().getSuperclass().getSimpleName());
        System.out.println("Superclass of " + str.getClass().getSuperclass().getSimpleName() +
                           " is "           + str.getClass().getSuperclass().getSuperclass());

        Scanner in = new Scanner(System.in);
        System.out.println("\nScanner 'in' has type: " + in.getClass().getSimpleName());
        System.out.println("Superclass of " + in.getClass().getSimpleName() +
                           " is class "     + in.getClass().getSuperclass().getSimpleName());
        System.out.println("Superclass of " + in.getClass().getSuperclass().getSimpleName() +
                           " is "           + in.getClass().getSuperclass().getSuperclass());
    }
}
