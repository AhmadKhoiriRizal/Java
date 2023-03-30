/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ZBOOK 15U G5-I7
 */
public class netes2 {
public static void main(String[] args) {
for(int a=1;a<=5;a++){  
for(int b=1;b<=5;b++){  
        System.out.printf("* ");
        if(a==b){
            break;
        }
}  
System.out.println();
}
System.out.println();
for(int a=1;a<=5;a++){  
for(int b=1;b<=5;b++){  
        System.out.printf("* ");
        if((a+b)==6){
            break;
        }
}  
System.out.println();
}
System.out.println();
for(int a=1;a<=5;a++){  
for(int b=1;b<=5;b++){  
        if((b<=6)&&(a+b)<6){
            System.out.printf("  ");
            continue;
        }
        System.out.printf("* ");
}  
System.out.println();
}
System.out.println();
for(int a=1;a<=5;a++){  
for(int b=1;b<=5;b++){  
        if((b<=5)&&(a-b)>=1){
            System.out.printf("  ");
            continue;
        }
        System.out.printf("* ");
}  
System.out.println();
}  
}  
}