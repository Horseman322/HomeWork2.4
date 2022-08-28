public interface Checker {
    void checkLogin(String login) throws WrongLoginException;
    void checkPassword(String password) throws WrongLoginException;
}
