public class Date {
    public int DateDifference(String DateIn, String DateOut) 
    {
        String dateIn = DateIn;// takes check in date from method call
        String dateOut = DateOut;//takes checkout date from method call
        
        int NightsOfStay = DaysBetween(dateIn, dateOut);//calls daysbetween to calculate the amount of nights of the stay, uses variables set to the inputs from the method call
        int Nights = (int) NightsOfStay; //(int) left over from when i was using long instead of int for testing, sets int Nights to the output of NightsOf Stay
        return Nights;//returns number of nights to the original method call
    }
    
    public static int DaysBetween(String datein, String dateout) 
    {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};//using this array to dsetermine the lenght of each month in days, not accounting for leap years
        //parses check in date
        int dayin= Integer.parseInt(datein.substring(3, 5));//takes in check in day
        int monthin=  Integer.parseInt(datein.substring(0, 2));//takes in check in month
        int yearin= Integer.parseInt(datein.substring(6));// takes in check in year
        
        //parses check  out date
        int dayout= Integer.parseInt(dateout.substring(3, 5));//takes in check out day
        int monthout= Integer.parseInt(dateout.substring(0, 2));//takes in check out month
        int yearout= Integer.parseInt(dateout.substring(6));// takes in check in year
        
        int days= 0;
        
        for (int year= yearin; year < yearout; year++) //calculates the difference in years, checks if year in is less than year out, if it is then it adds 365 or 366 to days for each year
        {
            days+= isLeapYear (year) ? 366 : 365;//calls isleapyear to check if leap year, if it is then it adds 366 to days and if its not then it adds 365
        }
        
        for (int month= 1; month < monthout; month++) //calculates the number of days from the begining of the check out year by month accept for the last month, and checks for leap years
        {
            days+= daysInMonth[month - 1];//adds number of days in the month using the values in the array accept for the last month
            if (month== 2 && isLeapYear (yearout)) //checks if there is a leap year in the check out year and adds a day if applicable
            {
                days++;//adds the leap year day
            }
        }
        
        days += dayout - 1; // adds the days of the checkout month to the count and removes one day
        
        for (int month = 1; month < monthin; month++) //calculates the number of days from the begining of the check in year by month accept for the last month, and checks for leap years
        {
            days -= daysInMonth[month - 1];//removes number of days in the month using the values in the array accept for the last month
            if (month == 2 && isLeapYear (yearin)) //checks if there is a leap year in the check in year and removes a day if applicable
            {
                days--;// removes one day for leap year
            }
        }
        
        days-= dayin - 1; // removes the days of the checkin month to the count and adds a day 
        
        return days; //returns the number of days to DaysBetween
    }
    
    public static boolean isLeapYear( int year) //checks if it is a leap year and returns a boolean value
    {
        return(year % 4 == 0 && year % 100 != 0)|| (year % 400 == 0);//if the (year is divisable by 4 and not 100) OR (divisable by 400) then it will return true 
    }

    
}
