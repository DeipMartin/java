package oxxo.enums;

public class TestCafe {
    public static void main(String[] args) {
        Cafe americano = Cafe.CHICO;
        System.out.println(americano);
        americano = Cafe.GRANDE;
        System.out.println(americano);
        System.out.println("-------------------------------------");
        //for each
        for(Cafe c:Cafe.values()){
            System.out.println(c);
        }
    }
}
