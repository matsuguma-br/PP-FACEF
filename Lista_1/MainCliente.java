package Lista_1;

import Lista_1.src.exe_02.Cliente;

public class MainCliente {
    public static void main(String args[]) {
        // Criando um cliente sem informações iniciais
        Cliente obj1 = new Cliente();
        obj1.depositar(1000);
        obj1.sacar(300);
        obj1.exibirDetalhes();

        // Criando um cliente com informações definidas
        Cliente obj2 = new Cliente(123, 456, "Julio", 3000.0f);
        obj2.depositar(1500);
        obj2.sacar(5000); // Deve exibir "Saldo insuficiente."
        obj2.exibirDetalhes();
    }
}