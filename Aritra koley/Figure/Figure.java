public class Figure {

    private double perimeter;
    private double Area;
    private double volume;

    public Figure()
    {
        System.out.println("This is a default constructor.");

    }

    // Constructor of Figure with Parameters

    public Figure(double perimeter, double Area, double volume
        
    )
    {
        this.perimeter = perimeter;
        this.Area = Area;
        this.volume = volume;
  

        System.out.println("This is an example of constructor" 
        + " with parameters");

    }

    public void setperimeter(double perimeter)
    {
        this.perimeter = perimeter;
    }

  public double getperimeter()
 {
        return this.perimeter;
   }

    public void setArea(double Area)
    {
        this.Area = Area;
    }

//    public double getArea()
//    {
//        return this.Area;
 //   }
    public void setvolume(double volume)
    {
        this.volume= volume;
    }
//    public double getvolume()
 //   {
 //       return this.volume;
//    }
    public void display(){
        System.out.println(perimeter == 0 ? "perimeter: N/A" : "perimeter:" + perimeter);
        System.out.println(Area == 0 ? "Area:" + Area : "Area:" + Area);
        System.out.println(volume == 0 ? "volume : N/A" : "volume:" + volume);
    }
}
