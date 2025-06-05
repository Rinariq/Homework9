public class Main {
    public static void main(String[] args) {
        System.out.println("задание 1");
        int [] expense = {1000, 1250, 1300, 1150, 1400};
        int sumExpense = 0;
        for (int element : expense){
            sumExpense += element;
        }
        System.out.println("Сумма трат за месяц составила "+sumExpense+" рублей");
        System.out.println("");

        System.out.println("задание 2");
        int[] wastes = {1000, 7000, 300, 3800, 2500};
        int maxWastes = -1;
        int minWastes = 1000000;
        for (int i = 0; i < wastes.length; i++) {
            final int currentMax = wastes[i];
            if (currentMax > maxWastes) {
                maxWastes = currentMax;
            }
        }
        for (int i = 0; i < wastes.length; i++) {
            final int currentMin = wastes[i];
            if (currentMin < minWastes) {
                minWastes = currentMin;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила "+minWastes+" рублей. Максимальная сумма трат за неделю составила "+maxWastes+" рублей");
        System.out.println("");

        System.out.println("задание 3");
        double [] payment = {125, 300, 400, 120, 100};
        double sumPayment = 0;
        for (double element : payment){
            sumPayment += element;
        }
        double averageValue = sumPayment/payment.length;
        String formatSum = String.format("%.2f", averageValue);
        System.out.println("Средняя сумма трат за месяц составила "+formatSum+" рублей");
        System.out.println("");

        System.out.println("задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--){
            System.out.print(reverseFullName[i]);
        }
        System.out.println("");
    }
}