import java.util.List;

/**
 * Created by Erixon on 14.02.2017.
 */
public class P2AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode cur = new ListNode(0);
        ListNode ret = cur;
        ListNode l1cur = l1;
        ListNode l2cur = l2;
        int x;
        while (true) { // need to sum

            x = 0;

            cur.val += l1cur.val + l2cur.val;
            if (cur.val > 9) {
                x = 1;
                cur.val -= 10;
            }

            if (l1cur.next == null || l2cur.next == null) break;
            else {
                cur.next = new ListNode(x);
                cur = cur.next;
                l1cur = l1cur.next;
                l2cur = l2cur.next;
            }
        }
        if (l1cur.next == null && l2cur.next == null) {
            if(x>0) cur.next = new ListNode(x);
        }
        else {
            if(l1cur.next == null){
                cur.next = addNum(l2cur.next,x);
            }
            if(l2cur.next == null){
                cur.next = addNum(l1cur.next,x);
            }
        }
        return ret;
    }
    public int getInt (ListNode l){
        int ret = 0;
        int i = 0;
        ListNode q = l;
        do {

            ret += + q.val * (int) Math.pow(10,i++);
            q = q.next;

        } while (q != null);
        return ret;
    }

    public ListNode addNum(ListNode l, int x){
        l.val += x;
        if (l.val > 9){
            l.val -= 10;
            if (l.next == null) l.next = new ListNode(0);
            addNum(l.next,1);
        }
        return l;
    }

    public int getLen(ListNode l){
        int ret = 0;

        return ret;
    }
}
