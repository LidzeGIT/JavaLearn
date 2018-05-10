package javaapplication79;
//дерево
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;


public class JavaApplication79 {
    
    static Random r = new Random();
    static int checkSum=0;
    static final int levels = 24;
       
    public static void main(String[] args) {
        
        System.out.println("generating tree... ");
        TreeNode root = new TreeNode();
        createTree(root,levels);
        System.out.println("tree is ready,weight = " + checkSum);
        
        long t1= System.currentTimeMillis();
        int weight1 = countTreeWeight(root);
        
        long t2= System.currentTimeMillis();
        System.out.println("simple weight count = " + weight1 
                + ", working time: "+(t2-t1));
        
        long t3 =System.currentTimeMillis();
        int weight2 = countTreeWeightFJ(root);
        long t4 = System.currentTimeMillis();
        System.out.println("FJ weight = " +weight2 
                + ", working tome: " +(t4-t3));
        
        
        
    }

    private static void createTree(TreeNode node, int level) {
        node.left = new TreeNode();
        node.right = new TreeNode();
        node.weight = r.nextInt(2);
        checkSum += node.weight;
        level--;
        if( level == 0){
            node.left.weight = r.nextInt(2);
            node.right.weight = r.nextInt(2);
            checkSum += node.left.weight;
            checkSum += node.right.weight;
            return;
        }
        createTree(node.left, level);
        createTree(node.right, level);
    
    }

    private static int countTreeWeight(TreeNode node) {
        //если лефт не равен null то перейти в лево
        return node.weight + (node.left !=null?countTreeWeight(node.left):0)
                +(node.right!=null?countTreeWeight(node.right):0);

    }

    private static int countTreeWeightFJ(TreeNode root) {
        class FJCounter extends RecursiveTask<Integer>{
            TreeNode root;
            public FJCounter(TreeNode root){
                this.root = root;
            }
            @Override
            protected Integer compute() {
                FJCounter workLeft = null;
                FJCounter workRight= null;
                int s = root.weight;
                if(root.left != null){
                    workLeft = new FJCounter(root.left);
                    workLeft.fork();
                    }
                if(root.right != null){
                    workRight = new FJCounter(root.right);
                    workRight.fork();
                }
                if(workLeft!= null)s+=workLeft.join();
                if(workRight!=null)s+=workRight.join();
                return s;
            }
            
        }
        return new ForkJoinPool().invoke(new FJCounter(root));
    }
    
}
    
class TreeNode {
    public TreeNode left;
    public TreeNode right;
    public int weight;
    
}