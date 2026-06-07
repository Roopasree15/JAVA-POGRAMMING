public class Mobile{
    void iphone() {
        System.err.println("this is iphone");
    }
    void vivo(){
        System.err.println("this is vivo");
    }
    void samsung(){
        System.err.println("this is samsung");
    }
    public static void main(String[] args) {
        Mobile phone = new Mobile();
        phone.iphone();
        phone.vivo();
        phone.samsung();
    }
}
