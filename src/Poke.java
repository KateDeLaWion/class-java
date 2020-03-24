public class Poke {

    public static class Pokemon{
        String type;
        String name;

        public Pokemon(String another, String name){
          //this.type = type;    if the above is type instead of another
            this.type = another;
            this.name = name;
        }
    }


    public static void main(String[] args) {
        Pokemon animal = new Pokemon( "fighting", "Pikachu" );
        System.out.println("This type is  " + animal.type);
        System.out.println("This name is " + animal.name);
    }



}
