public class Arrays{

    public static void main (String[] args){

        double[] weatherDayWeek = new double[7];

        for(int i = 0; i < weatherDayWeek.length; i++){
            System.out.println("Weather in day " + i + " : " + weatherDayWeek[i]);
        }

        for(int i = 0; i < weatherDayWeek.length; i++){
            if(0 == i % 2){
                weatherDayWeek[i] = 30.0;
            } else{
                weatherDayWeek[i] = 25.0;
            }
        }

        for(int i = 0; i < weatherDayWeek.length; i++){
            System.out.println("Weather in day " + i + " : " + weatherDayWeek[i]);
        }
    }
}