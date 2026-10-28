public class Node {
    //  Node properties
    public int value;
    public String name;
    public Node left;
    public Node right;

    //  Constructor
    public Node(String name, int value){
        this.value = value;
        this.name = name;
        this.left = null;
        this.right = null;
    }

    //  Override constructor, when created from another node
    public Node(Node node){
        this.value = node.value;
        this.name = node.name;
        this.left = null;
        this.right = null;
    }


    // Imported from "Kodeeksempel for at populere et binært søgetræ"
    public void AddChildNode(Node newNode)
    {
        if (newNode.value < value)
        {
            if (left == null)
            {
                left = new Node(newNode);
            }
            else
            {
                // Recursion
                left.AddChildNode(newNode);
            }
        }
        else
        {
            if (right == null)
            {
                right = new Node(newNode);
            }
            else
            {
                // Recursion
                right.AddChildNode(newNode);
            }
        }
    }

    // Imported and adjusted from Stack Overflow (I think)
    public void printTree() {
        printTree("", true);
    }

    private void printTree(String prefix, boolean isTail) {
        if (right != null) {
            right.printTree(prefix + (isTail ? "│   " : "    "), false);
        }

        System.out.println(prefix + (isTail ? "└── " : "┌── ") + name + ": " + value);

        if (left != null) {
            left.printTree(prefix + (isTail ? "    " : "│   "), true);
        }

    }

}
