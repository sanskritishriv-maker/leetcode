class Solution {
    public int daysBetweenDates(String date1, String date2) {
      
        return Math.abs(days(date1) - days(date2));
    }

    private int days(String date) {

        String[] arr = date.split("-");

        int year = Integer.parseInt(arr[0]);
        int month = Integer.parseInt(arr[1]);
        int day = Integer.parseInt(arr[2]);

        int total = 0;

        for (int y = 1971; y < year; y++) {
            total += isLeap(y) ? 366 : 365;
        }

        int[] months = {
            31,28,31,30,31,30,
            31,31,30,31,30,31
        };

        for (int m = 1; m < month; m++) {
            total += months[m - 1];

            if (m == 2 && isLeap(year)) {
                total++;
            }
        }

        total += day;

        return total;
    }

    private boolean isLeap(int year) {
        return (year % 400 == 0)
            || (year % 4 == 0 && year % 100 != 0);
    
        
    }
}