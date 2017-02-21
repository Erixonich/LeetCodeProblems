/**
 * Created by Erixon on 05.01.2017.
 */
public class Main {

    public static void main(String args[]){
        P2AddTwoNumbers ob = new P2AddTwoNumbers();
        ListNode ex = null;
        ListNode l1 = new ListNode(1);
        //l1.next  = new ListNode(1);
        //l1.next.next  = new ListNode(5);
        //l1.next.next.next  = new ListNode(1);

        ListNode l2 = new ListNode(9);
        l2.next  = new ListNode(9);
        System.out.println(ob.getInt(ob.addTwoNumbers(l1,l2)));
        //System.out.println(ob.getInt(ob.addNum(l2, 5)));
    }
}
