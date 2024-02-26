package br.com.gritti.heranca;

public class Teste {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.setAlimenta("Todo animal se alimenta");
        animal.setLocomove("Todo animal se locomove");

        Cachorro cachorro = new Cachorro();
        cachorro.setAlimenta("Cachorro come ração de cachorro");
        cachorro.setLocomove("Cachorro usa 4 patas");
        cachorro.setLatido("Cachorro late");

        Animal poodle = new Cachorro();
        poodle.setAlimenta("O poodle come ração para raças pequenas");
        poodle.setLocomove("Poodle tem 4 patas");
        
    }

}
