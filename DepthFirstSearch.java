/**
 * Class for performing Depth First Search on a binary tree.
 */
public class DepthFirstSearch {
    private int nodeCount;
    private int maxDepth;

    /**
     * Constructor for DepthFirstSearch.
     */
    public DepthFirstSearch() {
        this.nodeCount = 0;
        this.maxDepth = 0;
        System.out.println("Call DFS with root node to do a Depth First Search.");
    }

    /**
     * Starts a depth-first search on a tree starting from the given node.
     * 
     * @param node the starting node for the DFS
     */
    public void DFS(Node node) {
        if (node == null)
            return;
        System.out.println("Traversed Node: " + node.getData());
        nodeCount++;

        if (node.getlChild() != null) {
            DFS(node.getlChild());
        }
        if (node.getrChild() != null) {
            DFS(node.getrChild());
        }
    }

    /**
     * Calculates the height of the tree.
     * 
     * @param node the starting node for calculating the height
     * @return the height of the tree
     */
    private int calculateHeight(Node node) {
        if (node == null)
            return 0;
        int leftHeight = calculateHeight(node.getlChild());
        int rightHeight = calculateHeight(node.getrChild());
        return Math.max(leftHeight, rightHeight) + 1;
    }

    /**
     * Starts the DFS traversal
     * 
     * @param root the root node of the tree
     */
    public void startDFS(Node root) {
        DFS(root);
        this.maxDepth = calculateHeight(root);
        System.out.println("Total nodes traversed: " + nodeCount);
        System.out.println("Height of the tree: " + maxDepth);
    }
}
