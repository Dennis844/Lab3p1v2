package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Parabola> lista=new ArrayList<Parabola>();
        String numeFix="in.txt";
        int a, b, c;

        try(BufferedReader reader=new BufferedReader(new FileReader(numeFix))) {
            String obiect;
            while((obiect= reader.readLine())!=null) {
                String[] parts=obiect.split(" ");

                int int1=Integer.parseInt(parts[0]);
                int int2=Integer.parseInt(parts[1]);
                int int3=Integer.parseInt(parts[2]);
                lista.add(new Parabola(int1, int2, int3));

            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }

        for(Parabola p:lista) {
            System.out.println(p.toString());
            System.out.println(p.Mijloc(lista.get(1)).toString());
        }


    }
}
