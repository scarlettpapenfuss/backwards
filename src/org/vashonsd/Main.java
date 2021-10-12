package org.vashonsd;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    System.out.println("Give any word! ");
    String str = scan.nextLine();
    StringBuilder sb = new StringBuilder(str);
    System.out.println("Your word reversed is: " + sb.reverse() . toString());
    }
}
