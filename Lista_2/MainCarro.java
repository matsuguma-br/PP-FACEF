package Lista_2;

import Lista_2.src.exe_00.Carro;

public class MainCarro {
    public static void main(String[] args) {
        Carro obj1 =  new Carro();

        obj1.setMarca("Volkswagen");
        obj1.setModelo("Golf");
        obj1.setAno(2018);
        obj1.setVelocidade(118);

        System.out.println("Ano: " +  obj1.getAno());

        Carro obj2 =  new Carro("Chevrolet", "Onix", 2021, 0);


    }
}
