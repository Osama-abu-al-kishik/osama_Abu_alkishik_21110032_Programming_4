package finalProject;



public class Main {


	public static void main(String[] args) {
		
		
		
		Team Team1 = new Team();
		

		
		
		
		
		Team Team2 = new Team();
		
		
		
		
		
		
		Team Team3 = new Team();
		
		
		
		
		
		
		Team Team4 = new Team();
		
		
		
		
		
		
		
		Team Team5 = new Team();
		
		
		
		
		
		
		
		Team Team6 = new Team();
		
		
		
		
		
		
		
		Team Team7 = new Team();
		
		
		
		
		
		
		
		Team Team8 = new Team();
		
		
		
		
		
		
		Team Team9 = new Team();
		
		
		
		
		
		
		
		
		Team Team10 = new Team();
		
		
		
		
		
		//----------------------------------------------------------------------------------------------------------------------

		
		int [] arr1 = new int [] {Team1.Random_S(), Team2.Random_S() , Team3.Random_S() , Team4.Random_S() , Team5.Random_S() , Team6.Random_S() , Team7.Random_S() , Team8.Random_S() , Team9.Random_S() , Team10.Random_S()};
		int num1 = 0;
		int [] arr2 = new int [] {Team1.Random_T(), Team2.Random_T() , Team3.Random_T() , Team4.Random_T() , Team5.Random_T() , Team6.Random_T() , Team7.Random_T() , Team8.Random_T() , Team9.Random_T() , Team10.Random_T()};
		int num2 = 0;
		
		String [] arr3 = new String [10];
		int [] arr4 = new int [10];
		String [] arr5 = new String [10];
		
		//----------------------------------------------------------------------------------------------------------------------

		
		arr3[0] = "Team1";
		arr3[1] = "Team2";
		arr3[2] = "Team3";
		arr3[3] = "Team4";
		arr3[4] = "Team5";
		arr3[5] = "Team6";
		arr3[6] = "Team7";
		arr3[7] = "Team8";
		arr3[8] = "Team9";
		arr3[9] = "Team10";
		
		
		//----------------------------------------------------------------------------------------------------------------------

		
		arr4[0] = 101;
		arr4[1] = 102;
		arr4[2] = 103;
		arr4[3] = 104;
		arr4[4] = 105;
		arr4[5] = 106;
		arr4[6] = 107;
		arr4[7] = 108;
		arr4[8] = 109;
		arr4[9] = 110;
		
		//----------------------------------------------------------------------------------------------------------------------

		
		
		
		int h = 0;
		
		while ( h < 10) { 
	
			if(arr1[h] == Team1.Random_S())
			{
				Team.setName(arr3[h]);
				Team.setId(arr4[h]);
				break;
			}
			
			else if(arr1[h] == Team2.Random_S())
			{
				Team.setName(arr3[h]);
				Team.setId(arr4[h]);
				break;
			}
				
			else if(arr1[h] == Team3.Random_S())
			{
				Team.setName(arr3[h]);
				Team.setId(arr4[h]);
				break;
			}
				
			else if(arr1[h] == Team4.Random_S())
			{
				Team.setName(arr3[h]);
				Team.setId(arr4[h]);
				break;
			}
			
			else if(arr1[h] == Team5.Random_S())
			{
				Team.setName(arr3[h]);
				Team.setId(arr4[h]);
				break;
			}
			
			else if(arr1[h] == Team6.Random_S())
			{
				Team.setName(arr3[h]);
				Team.setId(arr4[h]);
				break;
			}
			
			else if(arr1[h] == Team7.Random_S())
			{
				Team.setName(arr3[h]);
				Team.setId(arr4[h]);
				break;
			}
			
			else if(arr1[h] == Team8.Random_S())
			{
				Team.setName(arr3[h]);
				Team.setId(arr4[h]);
				break;
			}
			
			else if(arr1[h] == Team9.Random_S())
			{
				Team.setName(arr3[h]);
				Team.setId(arr4[h]);
				break;
			}
			
			
			else if(arr1[h] == Team10.Random_S())
			{
				Team.setName(arr3[h]);
				Team.setId(arr4[h]);
				break;
			}
			h++;
			
		}
        
		
		
		
		
		
		//---------------------------------------------------------------------------------------------------------------------
		//arr1 (Random_solved())	
		
       
		 
		for (int i = 0; i < 10; i++) {     
            for (int j = i+1; j < 10; j++) {     
               if(arr1[i] < arr1[j]) {    
                   num1 = arr1[i];    
                   arr1[i] = arr1[j];    
                   arr1[j] = num1;
               }     
            }

            
        }


        
		//----------------------------------------------------------------------------------------------------------------------
        //arr2 (Random_Time())
		
	
        for (int i = 0; i < arr2.length; i++) {     
            for (int j = i+1; j < arr2.length; j++) {     
               if(arr2[i] > arr2[j]) {    
                   num2 = arr2[i];
                   arr2[i] = arr2[j];    
                   arr2[j] = num2;
               }     
            }     
        }    
          
           
		
		//----------------------------------------------------------------------------------------------------------------------
        //arr5 (Rank)
        
        arr5[0]="1st";
        arr5[1]="2nd";
        arr5[2]="3rd";
        arr5[3]="4th";
        arr5[4]="5th";
        arr5[5]="6th";
        arr5[6]="7th";
        arr5[7]="8th";
        arr5[8]="9th";
        arr5[9]="10th";
    
        System.out.println();
        System.out.println();       
        
        
        
        
		
		System.out.println("############################################################################");
		System.out.println("#   Rank   #   Team ID #   Team Name   #   Solved Questions # Elapsed Time #");
		System.out.println("############################################################################");
		System.out.println("# "+arr5[0]+"       # "+   Team.getId()     +"       # "+ Team.getName() +"         # " +  arr1[0]  + "/10               # "+arr2[0] +"          #");
		System.out.println("# "+arr5[1]+"       # "+   Team.getId()     +"       # "+ Team.getName() +"         # " + arr1[1]   + "/10               # "+arr2[1] +"          #");
		System.out.println("# "+arr5[2]+"       # "+   Team.getId()     +"       # "+ Team.getName() +"         # " + arr1[2]   + "/10               # "+arr2[2] +"          #");
		System.out.println("# "+arr5[3]+"       # "+   Team.getId()     +"       # "+ Team.getName() +"         # " + arr1[3]   + "/10               # "+arr2[3] +"          #");
		System.out.println("# "+arr5[4]+"       # "+   Team.getId()     +"       # "+ Team.getName() +"         # " + arr1[4]   + "/10               # "+arr2[4] +"          #");
		System.out.println("# "+arr5[5]+"       # "+   Team.getId()     +"       # "+ Team.getName() +"         # " + arr1[5]   + "/10               # "+arr2[5] +"          #");
		System.out.println("# "+arr5[6]+"       # "+   Team.getId()     +"       # "+ Team.getName() +"         # " + arr1[6]   + "/10               # "+arr2[6] +"          #");
		System.out.println("# "+arr5[7]+"       # "+   Team.getId()     +"       # "+ Team.getName() +"         # " + arr1[7]   + "/10               # "+arr2[7] +"          #");
		System.out.println("# "+arr5[8]+"       # "+   Team.getId()     +"       # "+ Team.getName() +"         # " + arr1[8]   + "/10               # "+arr2[8] +"          #");
		System.out.println("# "+arr5[9]+"       # "+   Team.getId()    +"       # "+ Team.getName()+"         # " + arr1[9]   + "/10               # "+arr2[9] +"          #");
		
		

	}

}
