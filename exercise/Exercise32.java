package test;

import java.util.Random;
public class Exercise32 {

	public static void main(String[] args) {
		Random random = new Random();

        int firstPart = random.nextInt(700) + 100; 
        
        int secondPart = random.nextInt(656); 
        
        int thirdPart = random.nextInt(10000); 

        String phoneNumber = String.format("%03d-%03d-%04d", firstPart, secondPart, thirdPart);

        System.out.println("Oluşturulan telefon numarası: " + phoneNumber);
	}

}
