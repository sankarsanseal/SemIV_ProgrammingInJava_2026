public class Sphere extends Figure {

    void calculate(double radius){
        if(radius>0){
        setperimeter(2 * Math.PI *radius);
        setArea(4*Math.PI*Math.pow(radius,2));
        setvolume((4.0/3.0)*Math.PI *Math.pow(radius,3));
        }
        else{
            System.out.println("Radius can't be 0 or a nagetive value!!!!!");
        }
    }
    
}
