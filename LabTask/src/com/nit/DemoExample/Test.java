//RAHULGAIKWAD@GMAIL.COM, 2372732378, chandrakant@gamil.com, 2392839276, jagdish@gmail.com, 
package com.nit.DemoExample;
import java.util.ArrayList;
public class Test{
	public static void main(String []args){
	
	ArrayList <String> cont = new ArrayList <String>();
	ArrayList <String> newList = new ArrayList <String>();
	
	cont.add("rahulgaikwad@gmail.com");
	cont.add("2372732378");
	cont.add("chandrakant@gamil.com");
	cont.add("2392839276");
	cont.add("jagdish@gmail.com");
	cont.add("7878773231");
	
	 System.out.println(cont);
	
	System.out.println();
	
	for(int i = 0; i<cont.size(); i++){
		if(cont.get(i).contains("@")){
			 String d1 = "";
			for(int j= 0; j<cont.get(i).length(); j++){
				 
				 
				for( int l = 0; l < cont.get(i).indexOf("@")-4 ; l++){
						//System.out.print("X");
						
						d1 = d1+"X";
						
				}
				
				for( int t = cont.get(i).indexOf("@")-4 ; t < cont.get(i).length(); t++){
				 
						//System.out.print( cont.get(i).charAt(t));
						d1 = d1 +  cont.get(i).charAt(t);
			    }
				newList.add(d1);
				 
				break;
			 
			}
		  
		}
		else{
			String d2 = "";
			for(int k = 0; k<cont.get(i).length(); k++){
				
				for( int m = 0; m < cont.get(i).length() - 4; m++ ){				
				
					//	System.out.print("X");
						d2 = d2 + "X";
				 
				}
				
				for( int s = cont.get(i).length()-4 ; s < cont.get(i).length(); s++){
				
					 // System.out.print(cont.get(i).charAt(s));
					  d2 = d2 + cont.get(i).charAt(s);
				 	
				}
					newList.add(d2);
					//System.out.println();
					break;
			  
			} // inner Else block For loop end 
		} // else Block End 
		
	} // Big For loop end 
	
	System.out.println(newList);
	} // main method end 
} // class End 
	
	



