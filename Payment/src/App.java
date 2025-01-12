import java.util.Scanner;

import models.PaymentType;
import service.PaymentService;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("[CARD/UPI/CASH] [amount]");
        PaymentService paymentService = new PaymentService();
        while (true) {
            try (Scanner scanner = new Scanner(System.in)){
                String[] command = scanner.nextLine().trim().split("\\s");
                if ("CASH".equals(command[0])) {
                    paymentService.makePayment(PaymentType.CASH, Double.parseDouble(command[1]));
                } else if ("UPI".equals(command[0])) {
                    paymentService.makePayment(PaymentType.UPI, Double.parseDouble(command[1]));
                } else if ("CARD".equals(command[0])) {
                    paymentService.makePayment(PaymentType.CARD, Double.parseDouble(command[1]));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
