/**
 * class Temperatures that	models	the	average	day	temperatures
 */
public class Temperatures {
    double[][] temp= new double[4][30];
    private double temperature;
    private double sum=0;
    private double average=0;
    private double maximumTemp=-100;
    private double minimumTemp=100;


    /**
     *To set the temperature
     * @param day
     * @param cityCode
     * @param temperature
     */

     public void setTemperature (int day, int cityCode, int temperature){
        for (int i = 0; i<4; i++ ){
            if (this.temp[i][0]== cityCode){
                this.temp[i][day] = (int) this.temperature;
            }
        }

     }

    /**
     * To get the temperature
     * @param day
     * @param cityCode
     * @return temperature
     */
     public double getTemperature (int day, int cityCode){
         for (int i = 0; i<4; i++ ){
             if (this.temp[i][0] == cityCode){
                 temperature = this.temp[i][day];
             }
         }
        return this.temperature;


     }

    /**
     * To get the minimum temperature
     * @param cityCode
     * @return minimumTemp
     */
     public double getMinimumTemperature (int cityCode){
         for (int i = 0; i<4; i++ ){
             if (this.temp[i][0] == cityCode){
                 for (int j = 0; j<=30; j++ ){
                     if(minimumTemp< this.temp[i][1]){
                         minimumTemp = this.temp[i][1];
                     }
                 }
             }

             }
         return this.minimumTemp;
     }

    /**
     * To get the maximum temperature
     * @param cityCode
     * @return maximumTemp
     */
     public double getMaximumTemperature (int cityCode) {
         for (int i = 0; i < 4; i++) {
             if (this.temp[i][0] == cityCode) {
                 for (int j = 0; j <= 30; j++) {
                     if (maximumTemp > this.temp[i][1]) {
                         maximumTemp = this.temp[i][1];

                     }
                 }

             }
         }
         return this.maximumTemp;

     }

    /**
     * To get the average temperatur
     * @param cityCode
     * @return average
     */

     public double getAverageTemperature (int cityCode){
         for (int i = 0; i < 4; i++) {
             if (this.temp[i][0] == cityCode) {
                 for (int j = 0; j <= 30; j++) {
                     sum +=this.temp[i][j];
                 }

             }
         }
         average = sum/30;
         return average;
     }
}
