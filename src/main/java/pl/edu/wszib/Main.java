package pl.edu.wszib;

import java.math.BigInteger;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Scanner;
import jdk.swing.interop.DragSourceContextWrapper;

public class Main {
  public static void main(String[] args) {

        String imie = "imie";
        Integer k = 0;

        Scanner scanner = new Scanner(System.in);
        List arrayList = new ArrayList();

    while (true){

      System.out.println("Give all names you know, dont try to cheat!(write = to end)");

      imie = scanner.next();
      arrayList.add(imie);
      System.out.println(arrayList.get(k));

      if (arrayList.get(k) == "=" ){
        break;
      }
      k++;
    }

        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
  }
}
