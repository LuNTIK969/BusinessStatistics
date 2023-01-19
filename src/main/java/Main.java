import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        long[] month = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        StatsService service = new StatsService();

        System.out.println("Общая сумма продаж за год: " + service.getSum(month) + "р.");
        System.out.println("Средняя сумма продаж в месяц: " + service.getSumАverage(month) + "р.");
        System.out.println("Пик продаж за год (месяц): " + service.getMaxSum(month) + "р.");
        System.out.println("Минимум продаж за год (месяц): " + service.getMinSum(month) + "р.");
        System.out.println("Кол-во месяцев с суммой продаж ниже средней суммы продаж за год: " + service.getBelowAverage(month) + ".");
        System.out.println("Кол-во месяцев с суммой продаж выше средней суммы продаж за год: " + service.getBelowAverage(month) + ".");
    }
}