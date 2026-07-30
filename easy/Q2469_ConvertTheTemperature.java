package easy;

public class Q2469_ConvertTheTemperature {
    public static void main(String[] args) {

        double [] result = ConvertTheTemperature(32);
        for(int i = 0;i<result.length ;i++){
            System.out.println(result[i]);
        }
        
    }
    public static double[] ConvertTheTemperature(double celsius){
        double kelvin;
        double fahrenheit;
        double arr[] = new double[2];
        kelvin = celsius + 273.15;
        fahrenheit = celsius * 1.80 + 32.00;
        arr[0] = kelvin;
        arr[1] = fahrenheit;
        return arr;
    }
}
