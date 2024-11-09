public class Main {
    public static void main(String[] args) {

        BinarySearchTree<String> tree = new BinarySearchTree<>();
        tree.add("Bella", "Los Angeles");
        tree.add("Carlos", "Chicago");
        tree.add("Diana", "Houston");
        tree.add("Ethan", "Phoenix");
        tree.add("Fiona", "Philadelphia");
        tree.add("George", "San Antonio");
        tree.add("Hannah", "San Diego");
        tree.add("Ivan", "Dallas");
        tree.add("Julia", "San Jose");
        tree.add("Kevin", "Austin");
        tree.add("Laura", "Jacksonville");
        tree.add("Michael", "Fort Worth");
        tree.add("Nina", "Columbus");
        tree.add("Oscar", "Charlotte");
        tree.add("Paula", "San Francisco");




        /* Implementation with array
        Node<String>[] tourists = new Node[14];

        tourists[0] = new Node<>();
        tourists[0].key = "Aldo";
        tourists[0].data = "New York";

        tourists[1] = new Node<>();
        tourists[1].key = "Baldo";
        tourists[1].data = "Los Angeles";

        tourists[2] = new Node<>();
        tourists[2].key = "Caldo";
        tourists[2].data = "Chicago";

        tourists[3] = new Node<>();
        tourists[3].key = "Daldo";
        tourists[3].data = "Houston";

        tourists[4] = new Node<>();
        tourists[4].key = "Faldo";
        tourists[4].data = "Philadelphia";

        tourists[5] = new Node<>();
        tourists[5].key = "Galdo";
        tourists[5].data = "San Antonio";

        tourists[6] = new Node<>();
        tourists[6].key = "Haldo";
        tourists[6].data = "San Diego";

        tourists[7] = new Node<>();
        tourists[7].key = "Jaldo";
        tourists[7].data = "San Jose";

        tourists[8] = new Node<>();
        tourists[8].key = "Kaldo";
        tourists[8].data = "Austin";

        tourists[9] = new Node<>();
        tourists[9].key = "Laldo";
        tourists[9].data = "Jacksonville";

        tourists[10] = new Node<>();
        tourists[10].key = "Maldo";
        tourists[10].data = "Fort Worth";

        tourists[11] = new Node<>();
        tourists[11].key = "Naldo";
        tourists[11].data = "Columbus";

        tourists[12] = new Node<>();
        tourists[12].key = "Paldo";
        tourists[12].data = "Pasadena";

        tourists[13] = new Node<>();
        tourists[13].key = "Waldo";
        tourists[13].data = "San Francisco";

        BinarySearchTree<String> bst = new BinarySearchTree<>();
        bst.Load(tourists);

        bst.display();

        try {
            System.out.println("\nMinimum value in the tree: " + bst.FindMin());
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Maximum value in the tree: " + bst.FindMax());
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Where's Waldo? He's in " + bst.getValue("Waldo") + "!");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

         */
    }

}