import java.util.Scanner; //import for scanner

import java.util.ArrayList; //import for ArrayList

public class CarpetDemo_UPDATED
{  
   /**
   In this UPDATED demo, the user is allowed to do as many rooms as they want.
   When the user decides to stop, output all the information of each room
   */
   
   public static void main(String[]args)
   {
      //declare variables
      double length = 0, width = 0, cost = 0;
      String response = "";
      
      //create ArrayList
      ArrayList<RoomCarpet> room = new ArrayList<>();

      //start of do-while loop
      do
      {
         //create a scanner object 
         Scanner scan = new Scanner(System.in);
         
         //prompt for length from user 
         System.out.print("Enter the length of the room: ");
         length = scan.nextDouble();
         
         //prompt for width from user 
         System.out.print("Enter the width of the room: ");
         width = scan.nextDouble();
                        
         //prompt user for cost per square foot
         System.out.print("Enter the cost per square foot: $");
         cost = scan.nextDouble();
                 
         //create our RoomDimension object and pass it length and width
         RoomDimension dimension = new RoomDimension(length,width);
         
         //create our RoomCarpet object and pass it dimension and cost
         RoomCarpet carpet = new RoomCarpet(dimension,cost);
         
         room.add(new RoomCarpet(dimension,cost));
         
         //clear buffer
         scan.nextLine();
             
         //prompt user for continuation 
         System.out.print("Do you wish to enter information for another room (y/n): ");
         response = scan.nextLine();
         
         //blank line
         System.out.println();
      }
      while(response.equalsIgnoreCase("y"));
      {
         //create our RoomDimension object and pass it length and width
         RoomDimension dimension = new RoomDimension(length,width);

         //create our RoomCarpet object and pass it dimension and cost
         RoomCarpet carpet = new RoomCarpet(dimension,cost);
         
         //for loop to output information for each room
         for(int i = 0; i < room.size(); i++)
         {  
            //output the dimensions of the room
            System.out.println("\nDimension for Room "+(i+1)+room.get(i).getArea());
            
            /**
               THIS WORKS IF USING THE TO STRING METHOD*/
               //System.out.println(room.get(i).getArea().toString()); //this works by implicity calling the toString method            
            
            //output the cost of the room w/o using toString method
            System.out.println("\nCost for Room "+(i+1));
            System.out.printf("\tTotal Cost: $%,.2f",room.get(i).calculateCost());
            
            //blank line
            System.out.println();
         }
      }
   }
   
}