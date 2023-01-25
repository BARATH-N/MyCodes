package MASH_fortune;
import java.util.*;
public class MashMain {
	
	public static void main(String[] args) {
		
		String[] fortune = new String[20];
		fortune[0] = "M";
		fortune[1] = "A";
		fortune[2] = "S";
		fortune[3] = "H";
		fortune[4] = "Crush";
		fortune[5] = "Lover";
		fortune[6] = "Bestie";
		fortune[7] = "Actress";
		fortune[8] = "1";
		fortune[9] = "2";
		fortune[10] = "3";
		fortune[11] = "1000";
		fortune[12] = "Benz";
		fortune[13] = "Audi";
		fortune[14] = "Volswagen";
		fortune[15] = "BMW";
		fortune[16] = "Italy";
		fortune[17] = "America";
		fortune[18] = "Ladakh";
		fortune[19] = "London";
		int index = 4;
	    Scanner input = new Scanner(System.in);
	    System.out.println("\t        " + "MASH Fortune Teller      ");
	    
	    System.out.println("\t");
	    System.out.println("MASH - which stands for " + "Mansion, Apartment, Shack, House");
	    System.out.println("\t");
	    
//	    System.out.println("Enter 4 womens name who you want to marry:");
//	    for(int i=index;i<8;i++) {
//	         String wifes = input.next();
//	         fortune[i] = wifes;
//	    }
//	    
//	    System.out.println("Enter 4 inputs - Number of kids you want to have :");
//	    for(int i=8;i<12;i++) {
//	         String kids = input.next();
//	         fortune[i] = kids;
//	    }
//	    
//	    System.out.println("Enter 4 name of cars you want to buy :");
//	    for(int i=12;i<16;i++) {
//	         String cars = input.next();
//	         fortune[i] = cars;
//	    }
//	    
//	    System.out.println("Enter 4 favourite places :");
//	    for(int i=16;i<20;i++) {
//	         String places = input.next();
//	         fortune[i] = places;
//	    }
//	    
	    System.out.println("    Wifes  "+"\t"+"      kids");
	    for(int i=4;i<8;i++) {
	    	
	      System.out.print(fortune[i]+"\t" +     "\t"+fortune[i+4]);	
	      System.out.println();
	    	
	    }
	    
	    System.out.println("    Cars  "+"\t"+"       Place");
	    for(int i=12;i<16;i++) {
	    	System.out.print(fortune[i]+"\t" +     " \t "+fortune[i+4]);	
		    System.out.println();
	    }
	    
	    
	    System.out.println("Enter a number for 1 to 9 to see your future:");
	    int number = input.nextInt();
	    int count = 0;
	    int  i = 0;
	    int mashcount = 0,wifecount = 0,kidcount = 0,carcount = 0,placecount = 0;
	    String mashpos = null;
	    String wifepos = null;
	    String kidpos = null;
	    String carpos = null;
	    String placepos = null;
	    while(i<20) {
	    	count++;
	    	if(fortune[i]=="#@$") {
	    		count--;
	    		i++;
	    		continue;
	    	}
	    	if(count==number) {
	    		fortune[i]="#@$";
	    		if(i>=0&&i<4) {
	    			mashcount++;
	    		}
	    		if(i>=4&&i<8) {
	    			wifecount++;
	    		}
	    		if(i>=8&&i<12) {
	    			kidcount++;
	    		}
	    		if(i>=12&&i<16) {
	    			carcount++;
	    		}
	    		if(i>=16 && i<20) {
	    			placecount++;
	    		}
	    		count=0;
	    	}
	    	
	    	
	    	
	    	
	    	if(mashcount==3) {
	    		for(int j=0;j<4;j++) {
	    			if(!(fortune[j].equals("#@$"))){
	    				mashpos = fortune[j];
	    			//	System.out.println(mashpos);
	    				fortune[j]="#@$";
	    			}
	    		}
	    	}
	    	if(wifecount==3) {
	    		for(int j=4;j<8;j++) {
	    			if(!(fortune[j].equals("#@$"))){
	    				wifepos = fortune[j];
	    			//	System.out.println(wifepos);
	    				fortune[j]="#@$";
	    			}
	    		}
	    	}
	    	if(kidcount==3) {
	    		for(int j=8;j<12;j++) {
	    			if(!(fortune[j].equals("#@$"))){
	    				kidpos = fortune[j];
	    			//	System.out.println(kidpos);
	    				fortune[j]="#@$";
	    			}
	    		}
	    	}
	    	if(carcount==3) {
	    		for(int j=12;j<16;j++) {
	    			if(!(fortune[j].equals("#@$"))){
	    				carpos = fortune[j];
	    			//	System.out.println(carpos);

	    				fortune[j]="#@$";
	    			}
	    		}
	    	}
	    	if(placecount==3) {
	    		for(int j=16;j<20;j++) {
	    			if(!(fortune[j].equals("#@$"))){
	    				placepos = fortune[j] ;
	    		//		System.out.println(placepos);
	    				fortune[j]="#@$";
	    			}
	    		}
	    	}
	    	
	    	if(mashcount==3&&wifecount==3&&kidcount==3&&carcount==3&&placecount==3) {
	    		break;
	    	}
	    	
	    	i++;
	    	if(i==20) {
	    		i=0;
	    	}
	    }
	    System.out.println("Rohit will marry "+wifepos + " and have "+kidpos +" kids and buy a " + carpos +" car for a "+placepos +" tour");
	    
	}
	

}
