package br.fastfood.facade;

import br.fastfood.model.*;

public class ComboFacade {
    private Combo combo;

    public void criarCombo(int codigo) {
        switch (codigo) {
            case 1:
                combo = new Combo(new Burger("Big Cheddar", 15.0),
                                  new Bebida("Coca-Cola", 5.0),
                                  new Sobremesa("Sorvete", 8.0));
                break;
            case 2:
                combo = new Combo(new Burger("Chicken Deluxe", 18.0),
                                  new Bebida("Suco de Laranja", 6.0),
                                  new Sobremesa("Brownie", 10.0));
                break;
            default:
                System.out.println("Código de combo inválido!");
        }
    }

    public void exibirItens() {
        if (combo != null) {
            System.out.println("Itens do Combo:");
            System.out.println(combo.getBurger());
            System.out.println(combo.getBebida());
            System.out.println(combo.getSobremesa());
        } else {
            System.out.println("Nenhum combo foi criado.");
        }
    }

    public double getPrecoTotal() {
        if (combo != null) {
            return combo.getBurger().getPreco()
                 + combo.getBebida().getPreco()
                 + combo.getSobremesa().getPreco();
        }
        return 0;
    }
}
