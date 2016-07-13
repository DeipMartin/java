public class While {
    public static void main(String[] args) {
        int count=0;
        while(buscarPassword());         
    }
    public static boolean buscarPassword(){
        int valor =(int)(Math.random()*100); 
        if(valor ==20){
            System.out.println("ya salio..."+valor);
            return false;
        } else{
            System.out.println("nada....."+valor);
            return true;
        }
    }
}
