package context;

public class Context {

    public static String lastName = "Борисов";
    public static String receiver = "pix2003@mail.ru"; //ilya.filinin@simbirsoft.com
    public static String searchParam = "from:(филинин илья)"; //ilya.filinin@simbirsoft.com
    public static String user = System.getProperty("gmail.username", "testsimbirsoft2");
    public static String password = System.getProperty("gmail.password", "2207test");

}
