import java.util.*;

class Node {
  int data;
  Node next;
}

class LinkedList {
  Node head;
  Node tail;
  int size;

  // count function
  public int count(int target_element) {
    int count = 0;

    Node temp = head;
    while (temp != null) {
      if (temp.data == target_element) {
        count++;
      }
      temp = temp.next;
    }
    return count;
  }

  // insertion
  public void insertion(int val) {
    Node temp = new Node();
    temp.data = val;
    temp.next = null;
    if (size == 0) {
      head = tail = temp;
    } else {
      tail.next = temp;
      tail = temp;
    }

    size++;
  }

  // print the values of the list;
  public void print() {
    Node temp = new Node();
    temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();

  }

  // return the size of list
  public int size() {
    return size;
  }

}

public class LinkedList_Count_Function {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    LinkedList list = new LinkedList();
    boolean flag = true;

    while (flag) {
      System.out.println("Enter The " + (list.size() + 1) + " Element of Linked List  ");
      int n = sc.nextInt();

      // insert element
      list.insertion(n);

    
      System.out.println("To end insertion Type *. \nFor Continue Insertion Type #");
      String str = sc.next();
      if (str.equals("*")) {
        flag = false;
      } else if (str.equals("#")) {
        flag = true;
      } else {
        System.out.println("Invalid Entry!");
        flag = false;
      }

    }

    System.out.println("Enter The search element ");
    int search = sc.nextInt();

    System.out.println("Your LinkedList ...");
    list.print();
    System.out.println("Search element = " + search);

    // count call
    int cnt = list.count(search);

    System.out.println("The frequency of element " + search + " is = " + cnt);

  }
}
