package finalProject;

import java.util.Random;

public class Team {
	
	
	
	//--------------------------------------------------------------
	
	
		//attributes
		
		private static String name;
		private static int id;
		private static String rank;
		private static int time = 300;
		private static int solvedQ = 10;
		
		
		
		//--------------------------------------------------------------
		
		
		//getters setters name
		public static String getName() {
			return name;
		}
		public static void setName(String name) {
			Team.name = name;
		}
		
		//getters setters id
		public static int getId() {
			return id;
		}
		public static void setId(int id) {
			Team.id = id;
		}
		
		
		//getters setters rank
		public static String getRank() {
			return rank;
		}
		public static void setRank(String rank) {
			Team.rank = rank;
		}
		
		
		//getters setters time
		public static int getTime() {
			return time;
		}
		public static void setTime(int time) {
			Team.time = time;
		}
		
		
		
		//getters setters solvedQ
		public static int getSolvedQ() {
			return solvedQ;
		}
		public static void setSolvedQ(int solvedQ) {
			Team.solvedQ = solvedQ;
		}
		
		
		public int Random_T()
		{
		 Random r = new Random();
		 int random_time =  r.nextInt(time);
		 return random_time;
		}
		
		
		public int Random_S()
		{
		 Random r = new Random();
		 int random_Solved =  r.nextInt(solvedQ);
		 return random_Solved;
		}
		
		

}
