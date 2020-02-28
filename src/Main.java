public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        try {
            Card card=Card.class.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
