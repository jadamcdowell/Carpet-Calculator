public class RoomDimension
{
   /**
   First, you should create a class named RoomDimension that has two fields: 
   1) one for the length of the room 
   2) one for the width. 
   */
   
   //declare fields
   private double length;
   private double width;
   
   //no arg constructor
   public RoomDimension()
   {
      length = 1;
      width = 1;
   }
   
   /**
   Constructor with arguments
   @param length This is the length of the room
   @param width This is the width of the room
   */
   public RoomDimension(double length, double width)
   {
      this.length = length;
      this.width = width;
   }
   
   /**
	COPY CONSTRUCTOR
	@param obj A RoomDimension object to make a copy
	*/
	public RoomDimension(RoomDimension obj)
	{
		length = obj.length;
		width = obj.width;
	}

   //setter methods
   
   /**
   This is the setter method for length
   @param length This is the length of the room
   */
   public void setLength(double length)
   {
      this.length = length;
   }
   
   /**
   This is the setter method for width
   @param width This is the width of the room
   */
   public void setWidth(double width)
   {
      this.width = width;
   }
   
   //getter methods 
   
   /**
   This is the getter method for length
   @return length The length of the room
   */
   public double getLength()
   {
      return this.length;
   }
   
   /**
   This is the getter method for width
   @return width The width of the room
   */
   public double getWidth()
   {
      return this.width;
   }
   
   /**
   This method calculates and returns the area of the room.
   @return The area of the room 
   */
   public double getArea()
   {
      return length*width;
   }
   
   /**
   toString method (WORKS)
   */
   
   public String toString()
   {
      return "\n\tThe length: "+length+"\n"+
             "\tThe width: "+width;
   }
   
}