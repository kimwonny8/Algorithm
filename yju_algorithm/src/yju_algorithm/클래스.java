package yju_algorithm;

public class 클래스 {

    public static void main(String[] args) {
        PhyscData[] x = {
                new PhyscData("가", 162, 1.2),
                new PhyscData("나", 168, 0.4),
                new PhyscData("다", 161, 0.8),
                new PhyscData("라", 150, 0.1),
                new PhyscData("마", 178, 0.5),
                new PhyscData("바", 190, 1.0),
                new PhyscData("사", 198, 0.9),
        };
        // 신체데이터 출력
        for (int i=0; i<x.length; i++) {
            System.out.printf("%-6s %3d %5.1f \n", x[i].name, x[i].height, x[i].vision);
        }

        System.out.printf("\n평균 키 %5.1fcm\n", aveHeight(x));
    }
    private static double aveHeight(PhyscData[] dat){
        double sum=0;
        for(int i=0; i<dat.length; i++){
            sum+=dat[i].height;
        }
        return (sum/ dat.length);
    }
}

class PhyscData {
    String name;
    int height;
    double vision;

    public PhyscData(String name, int height, double vision){
        this.name=name;
        this.height=height;
        this.vision=vision;
    }
}

