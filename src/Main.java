public class Main {
    public static void main(String[] args) {
        boolean result = ValidatorService.validate("java_skypro", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
        if (result){
            System.out.println("Проверка пройдена");
        }else{
            System.out.println("Проверка не пройдена");
        }
    }
}