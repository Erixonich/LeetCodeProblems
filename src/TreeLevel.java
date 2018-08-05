public class TreeLevel {
    int lvl;
    TreeLevel next;
    TreeNode nodes[];

    public TreeLevel(TreeNode root) {
        lvl = 0;
        nodes = new TreeNode[1];
        nodes[0] = root;
        next = new TreeLevel(nodes);
    }

    public TreeLevel(TreeNode[] prevLvl) {
        if (prevLvl != null) {
            int size = 0;
            nodes = new TreeNode[prevLvl.length * 2];
            for (int i = 0; i < prevLvl.length; i++) {

                if(prevLvl[i] != null){
                    if (prevLvl[i].left != null) {
                        nodes[i*2] = prevLvl[i].left;
                        size++;
                    }
                    if (prevLvl[i].right != null){
                        nodes[i*2 + 1] = prevLvl[i].right;
                        size++;
                    }
                }
            }
            if (size == 0) nodes = null;
            next = new TreeLevel(nodes);
        }
    }

    public int getWidth(){
        int max = -1;
        int min = -1;
        for (int i = 0; i < nodes.length; i++) {
            if (nodes[i] != null){
                max = i;
                if (min == -1) min = i;
            }

        }
        return max - min;
    }
}
