package com.example.demo.logging_with_log4j;
import java.util.*;


 

import org.apache.log4j.Logger;

 

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Logger log = Logger.getRootLogger();
        
        Scanner sc = new Scanner(System.in) ;
        
        System.out.println("Enter the number");
        
        int number = sc.nextInt();
        
        log.info("You entered number = "+ number);
        
        try{
            
            if(number<0) {
                log.error("number should be a positive integer");
                throw new Exception("Invalid Number");
            }
            
        } catch (Exception e) {
            
            log.debug(e.getMessage());
            e.printStackTrace();
            // TODO: handle exception
        }
        
    double result = Math.sqrt(number);
    
    log.info("Square Root of a number = " + result);
        
        sc.close();
        
    }
}