package DSA_mqt.Functions;

public class AreaOfCircle {

    public static float Area(float radius){
        return (3.14f *radius*radius);
    }
    public static void main(String[] args) {
        float rad = 45.445f;
        float area = Area(rad);
        System.out.println(area);
    }
}
