public class Node {
    // Node properties
    public int nodeValue;
    public Node left;
    public Node right;

    // Constructor
    public Node(int value){
        nodeValue = value;
        left = null;
        right = null;
    }


    // Imported from "Kodeeksempel for at populere et binært søgetræ"
    public void AddChildNode(int newValue)
    {
        if (newValue < nodeValue)
        {
            if (left == null)
            {
                left = new Node(newValue);
            }
            else
            {
                // Recursion
                left.AddChildNode(newValue);
            }
        }
        else
        {
            if (right == null)
            {
                right = new Node(newValue);
            }
            else
            {
                // Recursion
                right.AddChildNode(newValue);
            }
        }
    }

}
