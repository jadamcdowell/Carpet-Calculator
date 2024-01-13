public class RoomCarpet
{
   /**
   Fields:
   1) RoomDimension object as a field. 
   2) cost of the carpet per square foot. 
   */
   
   //declare fields
   private RoomDimension dimension;
   private double cost;
   
   /**
   Constructor with arguments
   @param dimension The dimension of the room
   @param cost The cost of carpet per square foot
   */
   public RoomCarpet(RoomDimension dimension, double cost)
   {
      this.dimension = new RoomDimension(dimension); //make a deep copy 
      this.cost = cost;
   }
   
   /**
	COPY CONSTRUCTOR
	@param obj A RoomCarpet object to make a copy
	*/
	public RoomCarpet(RoomCarpet obj)
	{
		dimension = obj.dimension;
		cost = obj.cost;
	}

   //setter methods
   
   /**
   This is the setter method for the dimension
   @param dimension This is the dimension of the room
   */
   public void setDimension(RoomDimension dimension)
   {
      this.dimension = new RoomDimension(dimension); //make a deep copy 
   }
   
   /**
   This is the setter method for the cost
   @param cost This is the cost for the room
   */
   public void setCost(double cost)
   {
      this.cost = cost;
   }
   
   //getter methods
   
   /**
   This is the getter method for the dimension
   @return dimension The dimension of the room
   */
   public RoomDimension getArea()
   {
      return new RoomDimension(dimension);
   }
   
   /**
   This is the getter method for the cost
   @return cost The cost for the room
   */
   public double getCost()
   {
      return this.cost;
   }
   
   /**
   The RoomCarpet class should have a method that returns the total cost of the carpet
   */
   public double calculateCost()
   {
      return this.dimension.getArea() * cost;
   }
   
   /**
   toString method
   */
   
   public String toString()
   {
      return "\nCost for Room"+
             "\n\tCost: "+calculateCost();
             
   }
  
}