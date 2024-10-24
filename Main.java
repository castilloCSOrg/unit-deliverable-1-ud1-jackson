//********************************************
//*	AUTHORS:	Jackson Addy
//*	LAST MODIFIED:	10/13/2024
//********************************************

//********************************************
//Water In Take Calculator
//*	PROGRAM DESCRIPTION:
//*The purpose of my program is to find how much water should be drank based on multiple facotrs.
//*As an athlete water intake is extremely important so knowing how much water should be drank is dire.
//*I realized that through computer science, I could address this weakness by having a computer quickly cacluate how much water I should be drinking. 
//********************************************

//*********************************************
//*	ALGORITHM:
//*	Get the users input for their weight, tempature outside, and activeness. 
//*Caculate the amount of water they should be drinking. 
//*********************************************

//********************************************
//* I worked alone
//*********************************************


public class Main 
{
  /***** CONSTANT SECTION *****/
  
  public static void main(String[] args)
  {
    /***** DECLARATION SECTION *****/
    double waterIntake;
    String activityLevel;

    
    /***** INITIALIZATION SECTION *****/
    int weight = UtilityBelt.readInt("What is your Weight? (lbs): " , 1, 600);
    int activityChoice = UtilityBelt.readInt("Enter your Activity Level (1-3)? \n(1)Very Actice \n(2)Active  \n(3)Not Active \n: ", 1, 3);
    int temperature = UtilityBelt.readInt("What is the tempature outside? (F): ", 1, 9999);
  
  
    
    
    /***** PROCESSING SECTION *****/
    activityLevel = findActivityLevel(activityChoice);
    waterIntake = findWaterIntake(weight, activityChoice, temperature);
    
  
    /***** OUTPUT SECTION *****/
    System.out.printf("Based on your weight of %d lbs, activity level of %s, and a temperature of %d°F, you should drink %.2f ounces of water today." , weight, activityLevel, temperature, waterIntake);
  }

  /***** STATIC METHODS *****/
  public static String findActivityLevel(int choice)
  {
    switch(choice)
    {
      case 1:
        return "Very Active";
      case 2:
        return "Active";
      case 3:
        return "Not Active";
      default:
        return "Unknown";
    }
  }
  


public static double findWaterIntake(int weight, int activityLevel, int temperature)
{
  double baseWaterIntake = weight * 0.5;

  switch (activityLevel)
  {
    case 1:
      baseWaterIntake *= 1.5;
      break;
    case 2:
      baseWaterIntake *= 1.2;
      break;
    case 3:
      baseWaterIntake *= 1.0;
      break;
  }
  if (temperature > 80)
  {
    baseWaterIntake += 10.0;
  }
  return baseWaterIntake;
}
}
