package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import static java.lang.System.out;

/**
 * @Author: Chuang
 * @Date: 2020/4/26 16:33
 */
public class Main {
    public static void main(String[] args) {
        BiNode<Integer> rootNode = new BiNode<>(1);
        BiNode<Integer> node2 = new BiNode<>(2);
        BiNode<Integer> node3 = new BiNode<>(3);
        BiNode<Integer> node4 = new BiNode<>(4);

        rootNode.leftChild = node2;
        rootNode.rightChild = node3;

        node2.rightChild = node4;

        /*
           1
        2    3
       x 4  x x
         */

        LevelOrder(rootNode);
        out.println();
        InOrder(rootNode);
    }
    static void PreOrder(BiNode root){
        out.print(root.data+",");
        if(root.leftChild!=null){
            PreOrder(root.leftChild);
        }
        if(root.rightChild!=null){
            PreOrder(root.rightChild);
        }
    }
    static void InOrder(BiNode node){
        if(node.leftChild!=null){
            InOrder(node.leftChild);
        }
        out.print(node.data+",");
        if(node.rightChild!=null){
            InOrder(node.rightChild);
        }
    }

    static void PostOrder(BiNode node){
        if(node.leftChild!=null) {
            InOrder(node.leftChild);
        }
        if(node.rightChild!=null){
            InOrder(node.rightChild);
        }
        out.print(node.data+",");
    }

    static void LevelOrder(BiNode node){
        Queue<BiNode> queue = new LinkedList<>();
        queue.offer(node);
        while(!queue.isEmpty()){
            BiNode head = queue.poll();
            out.print(head.data+",");
            if(head.leftChild!=null)
            queue.offer(head.leftChild);
            if(head.rightChild!=null)
            queue.offer(head.rightChild);
        }



    }
}
