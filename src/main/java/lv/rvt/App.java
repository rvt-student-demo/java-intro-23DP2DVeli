package lv.rvt;

import java.util.*;


import java.io.*;

public class App {
    public static void main ( String[] args )
  {
     Box box = new Box( 2.5, 5.0, 6.0 ) ;
     Box box2 = new Box(9,9,9);
     System.out.println(box.nests(box2)); 
     System.out.println(box2.nests(box)); 
     System.out.println( "Area: "  + box.area() + " volume: " + box. volume() );


  }

}