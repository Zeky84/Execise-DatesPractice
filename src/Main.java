import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
// In this exercise, we are going to be using ZonedDateTime from the java.time package.  Like LocalDate and LocalDateTime,
    // starting from Java 8 onwards, we can easily add in timezones to our date to get the correct time information
    // from different countries.  If you chose your own countries, you may need to do a quick google search on your country
    // zone id.  The format is usually <Continent>/<City>

    private final static ZoneId BRISBANE = ZoneId.of("Australia/Brisbane");
    private final static ZoneId DUBLIN = ZoneId.of("Europe/Dublin");
    private final static ZoneId MADRID = ZoneId.of("Europe/Madrid");
    private final static ZoneId HAVANA = ZoneId.of("America/Havana");
    private final static ZoneId MALDIVES = ZoneId.of("Indian/Maldives");
    private final static ZoneId TORONTO = ZoneId.of("America/Toronto");

    public static void main(String[] args) {


        // Capturing the exact time in actual location
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("Miami, US->" + zonedDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd h:mm a")));
        //
        ZonedDateTime brisbaneAustralia = zonedDateTime.withZoneSameInstant(BRISBANE);
        System.out.println("Brisbane, Australia ->" +brisbaneAustralia.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
        ZonedDateTime dublinEurope = zonedDateTime.withZoneSameInstant(DUBLIN);
        System.out.println("Dublin, Ireland ->" +dublinEurope.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
        ZonedDateTime madridEurope = zonedDateTime.withZoneSameInstant(MADRID);
        System.out.println("Madrid, Spain ->" +madridEurope.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
        ZonedDateTime havanaCuba = zonedDateTime.withZoneSameInstant(HAVANA);
        System.out.println("Havana, Cuba ->" +havanaCuba.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
        ZonedDateTime maldivesIndia = zonedDateTime.withZoneSameInstant(MALDIVES);
        System.out.println("Maldives, India ->" +maldivesIndia.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
        ZonedDateTime torontoCanada = zonedDateTime.withZoneSameInstant(TORONTO);
        System.out.println("Toronto, Canada ->" +torontoCanada.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));

    }
}
