/*
 Coderbyte coding challenge: Time Convert

 Using the C++ language, have the function TimeConvert(num) take the num
 parameter being passed and return the number of hours and minutes the parameter
 converts to (ie. if num = 63 then the output should be 1:3). Separate the
 number of hours and minutes with a colon.

 Sample test cases:

 Input:  126
 Output: "2:6"

 Input:  45
 Output: "0:45"
 */

package Easy08TimeConvert;

public class TimeConvert {
    String minuteToHour(int totalMinute) {
        int remain = 0;
        int hour = totalMinute / 60;
        remain = totalMinute % 60;
        int minute = remain;
        return hour + ":" + minute;

    }

    public static void main(String[] args) {
        var timeConvert = new TimeConvert();
        System.out.println(timeConvert.minuteToHour(126));

    }

}
