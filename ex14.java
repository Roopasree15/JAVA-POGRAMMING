public class ex14{
    public static void main(String[] args) {
        for(int i = 1 ; i<=100 ;i++){
            if(i%3 == 0 && i%5==0){
                System.err.println("dicisible by both 3 and 5 : "+i);
            }
        }
    }
}