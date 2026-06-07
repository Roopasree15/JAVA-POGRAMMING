public class ex6{
    public static void main(String[] args) {
        boolean kfc = true ;
        boolean chicken = true;
        boolean pepsi = false;
        if(kfc){
            System.err.println("enter into kfc ");
            if(chicken){
                System.err.println("eat chicken");
                if(pepsi){
                    System.err.println("pepsi drink");
                }
            }
        }
    }
}