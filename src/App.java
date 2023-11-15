import java.util.Scanner;
public class App {

    public static void main(String[] args) throws Exception {
    // int varv=0;
    // while(varv<6)
    // {
    // System.out.println(varv);
    // varv++;
    // }
    
    // int varv=2;
    // while(varv<6)
    // {
    // System.out.println(varv);
    // varv++;
    // }

    
    // for(int v=0; v<6; v++)
    // {
    // System.out.println(v);
    // }
   
    // }
    // int v=2;
    // do{
    // System.out.println(v);
    // v++;
    // }
    // while(v<6);

    // int varv=5;
    // while(varv>-1)
    // {
    // System.out.println(varv);
    // varv--;
    // }
    
    // for(int v=5; v>-1; v--)
    // {
    // System.out.println(v);
    // }

    int[] tal = new int[5];

    Scanner t = new Scanner(System.in);
    for (int index = 0; index < tal.length; index++) {
        System.out.print("Ange tal: ");
        tal[index] = t.nextInt();
    }
    for (int index = 0; index < tal.length; index++) {
        System.out.print(tal[index] + " ");
    }
    
    
    int[] tal2 = new int[5];
Scanner t2 = new Scanner(System.in);


for (int index = 0; index < tal2.length; index++) {
    System.out.print("Ange tal: ");
    tal2[index] = t2.nextInt();
}


for (int index = tal2.length - 1; index >= 0; index--) {
    System.out.print(tal2[index] + " ");
}


  }
}
