import java.util.Arrays;

public class P662MaxWidthOfTree {

    public int widthOfBinaryTree(TreeNode root) {
        TreeNode layer[] = {root};
        int width = 0;
        while (layer != null){
            int x = getWidth(layer);
            if (width < x) width = x;
            System.out.println(Arrays.toString(layer));
            layer = getNextLayer(layer);
        }
        return width;
    }


    public TreeNode[] getNextLayer(TreeNode layer[]){
        TreeNode nodes[] = new TreeNode[layer.length * 2];

        int size = 0;
        for (int i = 0; i < layer.length; i++) {

            if(layer[i] != null){
                if (layer[i].left != null) {
                    nodes[i*2] = layer[i].left;
                    size++;
                }
                if (layer[i].right != null){
                    nodes[i*2 + 1] = layer[i].right;
                    size++;
                }
            }
        }
        if (size == 0) nodes = null;

        return nodes;
    }

    public int getWidth(TreeNode nodes[]){
        int max = -1;
        int min = -1;
        for (int i = 0; i < nodes.length; i++) {
            if (nodes[i] != null){
                max = i;
                if (min == -1) min = i;
            }

        }
        return max - min + 1;
    }
}
