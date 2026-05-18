package DSA_mqt.Loops;

public class BatteryPercentage {
    public static void main(String[] args) {
        int battery = 10;
        int count = 0;
        while(battery <100){  // bettery < 100 because if <= 100 then after reaching 100% it will still increment count
            battery += 10;
            count++;
        }
        System.out.println(count);
    }
}
