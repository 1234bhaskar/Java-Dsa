package javaBasics.Trees;

import java.util.Scanner;

public class BinaryTree2 {
    Node root;
      class Node {
        int value;
        Node left;
        Node right;


         Node(int value) {
            this.value = value;
        }
    }

          BinaryTree2() {
              Scanner sc = new Scanner(System.in);
              root = createTree(sc);
          }

        Node createTree(Scanner sc){
            int data=sc.nextInt();

            if(data == -1){
                return null;
            }

            Node n=new Node(data);
            n.left=createTree(sc);
            n.right=createTree(sc);
            return n;
        }
           void display(){
            preorderPrint(root);
           }
           void preorderPrint(Node root){
            if(root == null){
                return;
            }
               System.out.println(root.value);
               preorderPrint(root.left);
               preorderPrint(root.right);
           }
    }


