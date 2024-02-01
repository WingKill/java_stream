package com.java.thread;

import java.util.HashMap;
import java.util.Scanner;

public class ThreadMain5 {

	 public static void main(String[] args){
	        HashMap<String, Integer> menu = new HashMap<>();
	        Scanner sc = new Scanner(System.in);

	        menu.put("에스프레소", 2000);
	        menu.put("아메리카노", 2500);
	        menu.put("카푸치노", 3000);
	        menu.put("카페라떼", 3500);
	        while (true){
	            try {
	                System.out.print("주문 > ");
	                String input = sc.nextLine();

	                if(input.equals("그만")){
	                    break;
	                }       
                    System.out.println(input + "는 " + menu.get(input) + "원 입니다.");	              
	            }catch (Exception e){
	                e.printStackTrace();
	            }
	        }
	        sc.close();
	    }
}

