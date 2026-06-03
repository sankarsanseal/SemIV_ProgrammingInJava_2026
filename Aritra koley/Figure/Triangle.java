public class Triangle extends Figure {
    void calculate(int s1,int s2,int s3){
        if((s1+s2)>s3 && (s2+s3)>s1 && (s1+s3)>s2){
        setperimeter(s1+s2+s3);
        double s=(getperimeter()/2);
        setArea(Math.pow((s*(s-1)*(s-s2)*(s-s3)), 0.5));
        setvolume(00);
        {
            System.out.println("volume can't be calculatd because triangle is a 2d object");
        }
        }
        else{
            System.out.println("Triangle can't be formed ,because the sum of smaller sides must be larger than largest side");
        }

    }
    
}
