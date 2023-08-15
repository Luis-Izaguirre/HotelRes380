public class Date {
    public int DateDifference(String DateIn, String DateOut) {
        String date1 = DateIn;
        String date2 = DateOut;
        
        long daysBetween = calculateDaysBetween(date1, date2);
        int use = (int) daysBetween;
        return use;
    }
    
    public static long calculateDaysBetween(String dateStr1, String dateStr2) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int day1 = Integer.parseInt(dateStr1.substring(3, 5));
        int month1 = Integer.parseInt(dateStr1.substring(0, 2));
        int year1 = Integer.parseInt(dateStr1.substring(6));
        
        int day2 = Integer.parseInt(dateStr2.substring(3, 5));
        int month2 = Integer.parseInt(dateStr2.substring(0, 2));
        int year2 = Integer.parseInt(dateStr2.substring(6));
        
        long days = 0;
        
        for (int year = year1; year < year2; year++) {
            days += isLeapYear(year) ? 366 : 365;
        }
        
        for (int month = 1; month < month2; month++) {
            days += daysInMonth[month - 1];
            if (month == 2 && isLeapYear(year2)) {
                days++;
            }
        }
        
        days += day2 - 1;
        
        for (int month = 1; month < month1; month++) {
            days -= daysInMonth[month - 1];
            if (month == 2 && isLeapYear(year1)) {
                days--;
            }
        }
        
        days -= day1 - 1;
        
        return days;
    }
    
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
