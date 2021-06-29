import java.time.*;

public class NewDateTimeApi {

    public static void main(String[] args) {
        //public static ZonedDateTime of();
        //System.out.println(ZoneId.systemDefault());
        System.out.println("Let's start: ");
        ZonedDateTime zdt = ZonedDateTime.of(LocalDate.now(), LocalTime.now(), ZoneId.of("Europe/Moscow"));
        System.out.println(zdt);
        System.out.println("Next exercise: ");

        LocalTime time = LocalTime.of(16,30);
        LocalTime newTime = time.withHour(14).plusMinutes(15);
        System.out.println(newTime);
        System.out.println(time);
        System.out.println("Next exercise: ");

        LocalDate date = LocalDate.of(2009,4,22);
        System.out.println(date);
        Period period = Period.ofYears(4);
        System.out.println(date.minus(period));
        LocalTime timme = LocalTime.of(16,30);
        System.out.println(timme);
        Duration duration = Duration.ofMinutes(15);
        System.out.println(timme.plus(duration));

//        public static boolean isGreaterTime(LocalTime time, Duration duration) {
//            return time.plus(duration).isAfter(LocalTime.now());
//        }
        System.out.println("Next exercise: ");
        LocalTime timei = LocalTime.of(12, 30); // строка 1
        timei.minusHours(4); // строка 2
        timei = timei.plusMinutes(30);
        System.out.println(timei);


//        public static LocalTime convertDateToTime(Date date) {
//            Instant instant = date.toInstant();
//            ZonedDateTime zonedDateTime = instant.atZone(ZoneId.systemDefault());
//            return zonedDateTime.toLocalTime();
//        }
    }
}
