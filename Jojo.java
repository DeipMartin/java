public class Jojo {

    public static void main(String[] args) {
        StringBuilder nombre = new StringBuilder("hola");
        
        nombre.reverse();
        System.out.println(nombre);
        
        String nada = new String("jose:chema:alonso:fer:Carlos");
        nada.toUpperCase();
        
        String[] partes = nada.split(":");
        for(String parte : partes){
            System.out.println(parte.trim().toUpperCase());
        }
    }

}
