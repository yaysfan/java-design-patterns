package singleton;

public class President {

    private static President instance = new President();

    private President() {}

    public static President getInstance() {
        return instance;
    }


}
