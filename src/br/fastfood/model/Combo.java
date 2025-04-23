package br.fastfood.model;

public class Combo {
    private final ItemCombo burger;
    private final ItemCombo bebida;
    private final ItemCombo sobremesa;

    public Combo(ItemCombo burger, ItemCombo bebida, ItemCombo sobremesa) {
        this.burger = burger;
        this.bebida = bebida;
        this.sobremesa = sobremesa;
    }

    public ItemCombo getBurger() {
        return burger;
    }

    public ItemCombo getBebida() {
        return bebida;
    }

    public ItemCombo getSobremesa() {
        return sobremesa;
    }
}
