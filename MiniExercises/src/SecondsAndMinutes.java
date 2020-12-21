public class SecondsAndMinutes {
    public static void main(String[] args) {
        System.out.println(getDurationString(23455));
    }

    public static String getDurationString(long minutes, long seconds) {
        if (minutes <= 0 || seconds <= 0 || seconds >= 59) {
            return "Invalid Value";
        }
        long hour = minutes / 60;
        long mins = minutes % 60;

        String hourString = hour + "h";
        if (hour < 10) {
            hourString = "0" + hourString;
        }

        String minsString = mins + "m";
        if (mins < 10) {
            minsString = "0" + minsString;
        }

        String secondString = seconds + "s";
        if (seconds < 10) {
            secondString = "0" + secondString;
        }

        return hourString + " " + minsString + " " + secondString;
    }

    public static String getDurationString(long seconds) {
        if (seconds < 0) {
            return "Invalid Value";
        }

        long mins = seconds / 60;
        long secs = seconds % 60;

        return getDurationString(mins, secs);
    }
}
