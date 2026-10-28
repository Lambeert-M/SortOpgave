public class Opgave1 {
    public static BinaryTree tree = new BinaryTree();
    public static int[] nodeValues = {60, 85, 70, 50, 55, 75, 40};

    public static void run() {
        for (int nodeValue : nodeValues) {
            tree.addValue(nodeValue);
        }

        getNewAction();
    }

    public static void getNewAction() {
        System.out.println("What do you want to do?");
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
        if (node.nodeValue == searchTarget) {
            System.out.println("Value found");
        }

        //  Traverse right
        inOrder(node.right, searchTarget);

    }
}
