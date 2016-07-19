package Static;
public class TestMarciano {
    public static void main(String[] args) {
        Santo santo = new Santo();
        Rambo rambo = new Rambo();
        
        santo.matarMarciano();
        rambo.matarMarciano();
        santo.matarMarciano();
        rambo.lanzarGranada();
        rambo.matarMarciano();
        santo.matarMarciano();
        rambo.lanzarGranada();
        santo.matarMarciano();
    }
   
}
