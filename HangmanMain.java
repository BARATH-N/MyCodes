import java.util.*;
public class HangmanMain {
	
	public static void main(String[] args) {
		
		ArrayList<ArrayList<String>> riddles = new ArrayList();
		
		ArrayList<String> questionList = new ArrayList();
		questionList.add("Capital of India  _ _ _ _ _ _ _ _ ");
		questionList.add("Capital of Canada  _ _ _ _ _ _ ");
		questionList.add("Capital of Uk  _ _ _ _ _ _");
		
		ArrayList<String> answerList = new ArrayList();
		answerList.add("newdelhi");
		answerList.add("ottawa");
		answerList.add("london");
		
		riddles.add(questionList);
		riddles.add(answerList);
		
		
		
		
		Scanner inputs = new Scanner(System.in);
		
		System.out.println("Enter your name : ");
		String player = inputs.next();
	
		
		Random random = new Random();
		int generate_random = random.nextInt(3);
		
		String que = riddles.get(0).get(generate_random);
		String ans = riddles.get(1).get(generate_random);
	     
		
		
		System.out.println("                "+player+", Let's Play the Game");          System.out.println();
		System.out.println("find the capital of a country :");
		System.out.println(que);
		
		boolean playerturn = playgame(ans,player);
		
	    
		if(playerturn==true) {
			System.out.println("     "+player+", You Won...");
		}
		else {
			System.out.println("     "+player+", You Lose..."+" Try Again!...");
		}
		inputs.close();
		
	}
	
	
	public static boolean playgame(String ans,String name) {
		System.out.println();
		char[][] hanger = new char[8][7];
		for(int i=1;i<=5;i++) {		
			hanger[0][i] = '-';
		}
		for(int i=1;i<=7;i++) {
			hanger[i][0] = '|';
		}
		for(int i=0;i<8;i++) {
			for(int j=0;j<7;j++) {
				System.out.print(hanger[i][j]);
			}
			System.out.println();
		}
		System.out.println("Hey "+name+", Enter letter by letter to find the "+ans.length()+" letter word");
		
		Scanner sc = new Scanner(System.in);
		int count=0;
		int chance = 1;
		int wrong = 0;
		int flag = 0;
		while(chance<= ans.length() + 7){
		     char ch = sc.next().charAt(0);
		     char c = Character.toLowerCase(ch);
		     if(ans.indexOf(c)==-1) {
		    	 wrong++;
		    	 if(wrong==1) {
		    		 hanger[1][5] = '|';
		    	 }
		    	 else if(wrong==2) {
		    		 hanger[2][5] = 'o'; 
		    	 }
		    	 else if(wrong==3) {
		    		 hanger[3][5] = '|';
		    	     hanger[4][5] = '|';
		    	 }
		    	 else if(wrong==4) {
		    		 hanger[3][4] = '\\';
		    	 }
		    	 else if(wrong==5) {
		    		 hanger[3][6] = '/';
		    	 }
		    	 else if(wrong==6) {
		    		 hanger[5][4] = '/';
		    	 }
		    	 else if(wrong==7) {
		    		 hanger[5][6] = '\\';
		    	 }
		    	 for(int i=0;i<8;i++) {
		 			for(int j=0;j<7;j++) {
		 				System.out.print(hanger[i][j]);
		 			}
		 			System.out.println();
		 		}
		    	 if(hanger[5][6]=='\\') {
		    		 flag = 1;
		    		 break;
		    	 }
		     }
		     else {
		    	 count++;
		     }
		     if(count == ans.length()) {
		    	 break;
		     }
		     chance++;
		}
		if(flag==0) {
			if(count==ans.length()) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
		
	}

}
