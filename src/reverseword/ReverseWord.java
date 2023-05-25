/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reverseword;

import java.util.Scanner;

/**
 *
 * @author navni  navvv
 */
public class ReverseWord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        String wordv = input.next();
        //step 2 read word and separate each charachter then stoe in array 
        char[] reverse = new char[wordv.length()];
        
        for(int i=0;i<wordv.length();i++)
        {
            reverse[i]=wordv.charAt(i);
        }
        for( int j=reverse.length-1;j>=0;j--)
        {
            System.out.println(reverse[j])
                    ;
        }
    }
    
}

