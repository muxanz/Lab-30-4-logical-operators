import java.util.Scanner;

public class ValidadorPerfilUsuario {
    public static void validador() {
        Scanner scanner = new Scanner(System.in);
        String userName;
        int age;
        double accountBalance;
        boolean isPremium;

        System.out.printf("Ingresa Nombre de Usuario => ");
        userName = scanner.nextLine();
        System.out.printf("Ingresa tu edad => ");
        age = scanner.nextInt();
        System.out.printf("Ingresa tu saldo => $");
        accountBalance = scanner.nextDouble();
        System.out.printf("¿Tienes cuenta premium? ('true' para SI / 'false' para NO => ");
        isPremium = scanner.nextBoolean();

        String isPremiumCheck = isPremium ? "Wow si, muy bien!" : "Ouch no, pásate a premium!";

        boolean exclusiveAccess = (age >= 18) && isPremium;
        boolean hasPromotion = (accountBalance > 1000) || (age < 25);
        boolean incompleteProfile = (accountBalance == 0) || (userName.equals("invitado"));
        boolean totalActiveProfile = !incompleteProfile && (exclusiveAccess || hasPromotion);

        System.out.println(
                "\n*** PORTAL DE STREAMING ***" +
                "\n---------------------------" +
                "\nHola " + userName + "." +
                "\nQue bien tienes " + age + " años." +
                "\nTienes un saldo de: " + accountBalance + "." +
                "\nTu cuenta es premium: " + isPremiumCheck +
                "\n--- TUS BENEFICIOS 👇 ---" +
                "\n👉🏼 Acceso exclusivo: " + exclusiveAccess +
                "\n👉🏼 Promociones activas: " + hasPromotion +
                "\n👉🏼 Perfil activo total: " + totalActiveProfile);
    }
}
