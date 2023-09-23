// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Tree tree = new Tree();


        tree.insertValue(12);
        tree.insertValue(56);
        tree.insertValue(10);
        tree.insertValue(54);
        tree.insertValue(53);
        tree.insertValue(8);



        System.out.println(tree.root.getRight().getLeft().getLeft().getData());
        System.out.println(tree.root.getLeft().getLeft().getData());
    }
}