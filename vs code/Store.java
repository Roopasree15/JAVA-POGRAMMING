public class Store{
    void getchoco(int money){
        System.err.println(money);
        System.out.println("choci is purchased");
    }
    void powder(int money){
        System.err.println(money);
        System.out.println("powder is purchased");
    }
    public static void main(String[] args) {
        Store gro = new Store();
        gro.getchoco(10);
        gro.powder(50);
    
    }
}