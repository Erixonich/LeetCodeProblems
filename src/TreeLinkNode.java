public class TreeLinkNode {
    int val;

    TreeLinkNode left, right, next;

    TreeLinkNode(int x) { val = x; }

    TreeLinkNode(int x, TreeLinkNode left, TreeLinkNode right){
        val = x;
        this.left = left;
        this.right = right;
    }


}