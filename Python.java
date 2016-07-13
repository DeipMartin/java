public class Python {
    public static void main(String[] args) {
        boolean resultado = devolverFalse() || devolverTrue() && devolverFalse() || devolverTrue() ;//jugar con la pocicion de false & true
        System.out.println("resultado: "+resultado);
        System.out.println('a' | 'd');
        System.out.println(192 & 100);
        
        int a=2,b=3;
        
        Object answer = (a>b) ? new Object() : (a<b) ? "A":"C";
        System.out.println("el mayor es "+ answer);
        
        
        if(!('a'<'b')){
            System.out.println("se ejecuta el if");
        } else if ('a' == 'a') {
            System.out.println("son iguales");
            if ('b'>'c'){
                System.out.println("b es mayor");
            }else{
                System.out.println("b es menor");
            }
        }else if ('a' <= 'b') {
            System.out.println("son menor igual");
        }else {
            System.out.println("Se ejecuta el else");
        }
    }
    public static boolean devolverTrue(){
        System.out.println("devuelve true");
        return true;
    }
    public static boolean devolverFalse(){
        System.out.println("devuelve false");
        return false;
    }
}
/*
public class Python {
    public static void main(String[] args) {
        boolean resultado = devolverFalse() || devolverTrue() && devolverFalse() || devolverTrue() ;//jugar con la pocicion de false & true
        System.out.println("resultado: "+resultado);
    }
    public static boolean devolverTrue(){
        System.out.println("devuelve true");
        return true;
    }
    public static boolean devolverFalse(){
        System.out.println("devuelve false");
        return false;
    }
}
*/
