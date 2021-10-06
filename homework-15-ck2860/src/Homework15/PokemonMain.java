package Homework15;

public class PokemonMain {
    /**
     * 31 pokemons are created in order to add into a binary tree.
     *the test would show to how we compare the pokemon's numbers by its comparator and comparable methods.
     * @param args
     */
    public static void main(String[] args) {
        PokemonComparator comparator = new PokemonComparator();
        Pokemon Pikachu = new Pokemon("Pikachu",25);
        Pokemon Bulbasaur = new Pokemon("Bulbasaur",1);
        Pokemon Ivysaur = new Pokemon("Ivysaur",2);
        Pokemon Venusaur = new Pokemon("Venusaur",3);
        Pokemon Charmander = new Pokemon("Charmander",4);
        Pokemon Charmeleon = new Pokemon("Charmeleon",5);
        Pokemon Charizard = new Pokemon("Charizard",6);
        Pokemon Squirtle = new Pokemon("Squirtle",7);
        Pokemon Wartortle = new Pokemon("Wartortle",8);
        Pokemon Blastoise = new Pokemon("Blastoise",9);
        Pokemon Rattata = new Pokemon("Rattata",19);
        Pokemon Clefairy = new Pokemon("Clefairy",35);
        Pokemon Clefable = new Pokemon("Clefable",36);
        Pokemon Jigglypuff = new Pokemon("Jigglypuff",39);
        Pokemon Oddish = new Pokemon("Oddish",43);
        Pokemon Dugtrio = new Pokemon("Dugtrio",51);
        Pokemon Meowth = new Pokemon("Meowth",52);
        Pokemon Mankey = new Pokemon("Mankey",56);
        Pokemon Poliwag = new Pokemon("Poliwag",60);
        Pokemon Slowbro = new Pokemon("Slowbro",80);
        Pokemon Farfetchd = new Pokemon("Farfetch'd",83);
        Pokemon Seel = new Pokemon("Seel",86);
        Pokemon Muk = new Pokemon("Muk",89);
        Pokemon Gastly = new Pokemon("Gastly",92);
        Pokemon Drowzee = new Pokemon("Drowzee",96);
        Pokemon Hypno = new Pokemon("Hypno",97);
        Pokemon Krabby = new Pokemon("Krabby",98);
        Pokemon Kingler = new Pokemon("Kingler",99);
        Pokemon Voltorb = new Pokemon("Voltorb",100);
        Pokemon Golem = new Pokemon("Golem",76);
        Pokemon Ponyta = new Pokemon("Ponyta",77);


        BinaryNode pokemonRoot = new BinaryNode(Pikachu, comparator);
        StringifyVisitor visitor = new StringifyVisitor();
//        pokemonRoot.infixTraversal(visitor);
//        System.out.println(visitor); // prints pikachu

        pokemonRoot.binaryInsert(Bulbasaur); // adding bulbasaur
        pokemonRoot.binaryInsert(Krabby); // adding krabby
        pokemonRoot.binaryInsert(Golem);
        pokemonRoot.binaryInsert(Hypno);
        pokemonRoot.binaryInsert(Kingler);
        pokemonRoot.binaryInsert(Slowbro);
        pokemonRoot.binaryInsert(Meowth);
        pokemonRoot.binaryInsert(Clefable);
        pokemonRoot.binaryInsert(Squirtle);
        pokemonRoot.binaryInsert(Ivysaur);
        pokemonRoot.binaryInsert(Charizard);
        pokemonRoot.binaryInsert(Seel);


        pokemonRoot.infixTraversal(visitor);
        System.out.println("Comparator: "+ visitor);
        System.out.println("Contains Ivysaur: " + pokemonRoot.binarySearch(Ivysaur));
        System.out.println("Contains Seel: " + pokemonRoot.binarySearch(Seel));
        System.out.println("Contains Muk: " + pokemonRoot.binarySearch(Muk));

        visitor.clear();
        BinaryNode pokemonRootOne = new BinaryNode(Pikachu);
        pokemonRootOne.binaryInsert(Bulbasaur);
        pokemonRootOne.binaryInsert(Krabby);
        pokemonRootOne.binaryInsert(Golem);
        pokemonRootOne.binaryInsert(Hypno);
        pokemonRootOne.binaryInsert(Kingler);
        pokemonRootOne.binaryInsert(Slowbro);
        pokemonRootOne.binaryInsert(Meowth);
        pokemonRootOne.binaryInsert(Clefable);
        pokemonRootOne.binaryInsert(Squirtle);
        pokemonRootOne.binaryInsert(Ivysaur);
        pokemonRootOne.binaryInsert(Charizard);
        pokemonRootOne.binaryInsert(Seel);


        pokemonRootOne.infixTraversal(visitor);
        System.out.println("Comparable: " + visitor);


        System.out.println("Contains Ivysaur: " + pokemonRootOne.binarySearch(Ivysaur));
        System.out.println("Contains Seel: " + pokemonRootOne.binarySearch(Seel));
        System.out.println("Contains Muk: " + pokemonRootOne.binarySearch(Muk));

//        visitor.clear();
//        pokemonRootOne.prefixTraversal(visitor);
//        System.out.println(visitor);
    }
}
