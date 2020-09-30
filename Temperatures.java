import java.util.ArrayList;
/**.
* hold a set of integer values representing daily temperature
* Activity 6 
*@author Brian Forde Comp1210-001
@version 9/29/20
*/
public class Temperatures { 
   private ArrayList<Integer> temperatures;

/**
@param temperaturesIn - paramater to the temps.
*/

   public Temperatures(ArrayList<Integer> temperaturesIn) {
      temperatures = temperaturesIn;
   
   }

/**
@return returns an integer value for low temp
*/
   public int getLowTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      
      }
   
      int low = temperatures.get(0);
      for (int i = 0; i < temperatures.size(); i++) { 
         if (temperatures.get(i) < low) {
            low = temperatures.get(i);
         }
      
      }
   
      return low;
   
   }

/**
*@return returns an integer value for high temp
*/
   public int getHighTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
   
      int high = temperatures.get(0);
      for (Integer temp : temperatures) {
         if (temp > high) {
            high = temp;
         
         } 
      
      }
   
      return high;
   }

/**
*@param lowIn takes an int parameter 
*@return returns an integer value for low in
*/
   public int lowerMinimum(int lowIn) {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }

/**
*@param highIn takes an int parameter 
*@return returns an integer value 
*/
   public int higherMaximum(int highIn) {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }

/**
*@return returns a String
*/
   public String toString()  {
      return "\tTemperatures: " + temperatures 
         + "\n\tLow:  " + getLowTemp()
         + "\n\tHigh: " + getHighTemp();
   }
 
}
 





