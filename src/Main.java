import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Map<DayOfWeek, Integer> map = new LinkedHashMap<>();
        map.put(DayOfWeek.MONDAY,0);
        map.put(DayOfWeek.TUESDAY,0);
        map.put(DayOfWeek.WEDNESDAY,0);
        map.put(DayOfWeek.THURSDAY,0);
        map.put(DayOfWeek.FRIDAY,0);
        map.put(DayOfWeek.SATURDAY,0);
        map.put(DayOfWeek.SUNDAY,0);

        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            LocalDate date  = LocalDate.ofYearDay(2022, random.nextInt(100)+1);
            map.put(date.getDayOfWeek(), map.get(date.getDayOfWeek())+1);
            System.out.println("выбран "+date+", это "+ date.getDayOfWeek().name()+",+1");
        }

        System.out.println(map);
    }
}
