public class Opgave1 {
    public static BinaryTree tree = new BinaryTree();
    public static Node[] nodes = {
            new Node("Move to cover", 60),
            new Node("Shoot from cover", 85),
            new Node("Overwatch", 70),
            new Node("Shoot from current position", 50),
            new Node("Suppressionfire", 55),
            new Node("Critical shot", 75),
            new Node("Reload weapon", 40)
    };

    public static void run() {
        for (Node node : nodes) {
            tree.addNode(node);
        }

        getNewAction();
    }

    public static void getNewAction() {
        System.out.println("\nWhat do you want to do?");
        System.out.println("1 : Print tree");
        System.out.println("2 : Search for highest value with In-Order");
        System.out.println("3 : Quit");
        int action = Utils.reader(1, 3);

        switch (action) {
            case 1:
                tree.root.printTree();
                getNewAction();
                break;
            case 2:
                inOrder(tree.root, 85);
                getNewAction();
                break;
            case 3:
                System.exit(0);
        }
    }

    public static void inOrder(Node node,int searchTarget) {
        if (node == null) return;

        //  Traverse left
        inOrder(node.left, searchTarget);

        //  Check value
        if (node.value == searchTarget) {
            System.out.println("Best action: " + node.name + ": " + node.value);
        }

        //  Traverse right
        inOrder(node.right, searchTarget);
    }
}
