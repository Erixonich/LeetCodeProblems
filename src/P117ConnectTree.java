public class P117ConnectTree {
    public static void connect(TreeLinkNode root) {
        int lvl = 0;
        int id = 0;
        TreeLinkNode cur = root;
        TreeLinkNode pnt;


        while (cur != null){

        }






    }

        public static TreeLinkNode get(TreeLinkNode root,int lvl, int id){
            TreeLinkNode result = root;
            int x;

            //if (id < 0 || id > Math.pow(2,lvl) - 1) throw new IllegalArgumentException();

            for (int i = lvl - 1; i >= 0; i--){
                x = (int) Math.pow(2,i);

                if ((id & x) == x) {
                    if (result.right != null) result = result.right;
                    else return null;
                }
                else {
                    if (result.left != null) result = result.left;
                    else return null;
                }


            }
            return result;
        }


}
