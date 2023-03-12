public class Main {
    public static void main(String[] args) {
        MagicBox<String> magicBox = new MagicBox<>(4);
        magicBox.add("12");
        magicBox.add("fgfgfg");
        magicBox.add("555");
        magicBox.add("555455");


        String pick = magicBox.pick();
        System.out.println(pick);



    }
}