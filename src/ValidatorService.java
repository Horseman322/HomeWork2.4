public class ValidatorService {
    public static boolean validate(String login,
                                   String password,
                                   String confirmPassword) {
        try {
            Checker checker = new LoopChecker();
            validateParams(login, password, confirmPassword, checker);
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    private static void validateParams(String login,
                                       String password,
                                       String confirmPassword,
                                       Checker checker) throws WrongLoginException, WrongPasswordException{
        if(login==null || login.length() > 20){
            throw new WrongLoginException("Длиан логина должна быть меньше или равной 20");
        }
        if(password==null || confirmPassword==null || password.length() >= 20 || confirmPassword.length()>= 20){
            throw new WrongPasswordException("Пароль должен быть длинной меньше 20 символов");
        }
        if(!password.equals(confirmPassword)){
            throw new WrongPasswordException("пароли должны совпадать");
        }
        checker.checkLogin(login);
        checker.checkPassword(password);
    }
}
