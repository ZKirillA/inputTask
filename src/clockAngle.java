public class clockAngle {
    public static double calculateAngle(int hours, int minutes) {
        if (hours < 0 || hours >= 24 || minutes < 0 || minutes >= 60) {
            throw new IllegalArgumentException("Некорректное время");
        }
        if (hours >= 12) {
            hours -= 12;
        }
        double minuteAngle = 6 * minutes;
        double hourAngle = (30 * hours) + (0.5 * minutes);
        double angleDifference = Math.abs(hourAngle - minuteAngle);
        return Math.min(angleDifference, 360 - angleDifference);
    }

    public static void main(String[] args) {
        int hours = 18;
        int minutes = 00;
        double angle = calculateAngle(hours, minutes);
        System.out.println("Угол между часовой и минутной стрелками при " + hours + " часах и " + minutes + " минутах: " + angle + " градусов");
    }
}
