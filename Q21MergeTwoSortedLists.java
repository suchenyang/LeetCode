import java.util.*;
import java.lang.*;

public class Q21MergeTwoSortedLists {
	public static void main(String[] args) {
		System.out.println("Enter the first and second sorted lists separated by ; :");
		Scanner dd = new Scanner(System.in).useDelimiter(";");		
		String strList1 = dd.next();
		String strList2 = dd.next();
		
		//debug: test strList1 and strList2
		System.out.println(strList1);
		System.out.println(strList2);
			
		
		dd.close();
		
		String[] strArray1 = strList1.split(" ");
		String[] strArray2 = strList2.split(" ");
		
		//debug: test strArray1 and strArray2
		System.out.println(strArray1.length);
		System.out.println(strArray2.length);
		
		
		ListNode l1, l2, tail;
		if (strArray1.length > 0) {
			l1 = new ListNode(Integer.parseInt(strArray1[0]));
			tail = l1;
			for (int i = 1; i <= strArray1.length - 1; i++) {
				tail.next = new ListNode(Integer.parseInt(strArray1[i]));
				tail = tail.next;
			}
			tail.next = null;
		} else {
			l1 = null;
		}
		if (strArray2.length > 0) {
			l2 = new ListNode(Integer.parseInt(strArray2[0]));
			tail = l2;
			for (int i = 1; i <= strArray2.length - 1; i++) {
				tail.next = new ListNode(Integer.parseInt(strArray2[i]));
				tail = tail.next;
			}
			tail.next = null;
		} else {
			l2 = null;
		}
		
		Solution s = new Solution();
		ListNode mergedList = s.mergeTwoLists(l1, l2);
		ListNode temp = mergedList;
		while (temp != null) {
			System.out.println(temp.val);
			temp = temp.next;
		}
	}
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class ListNode {
	int val;
    ListNode next;
    ListNode(int x) { val = x; }
} 
 
 
class Solution {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode mergedList, tail;
		mergedList = new ListNode(0);
		tail = mergedList;
		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				tail.next = l1;
				tail = l1;
				l1 = l1.next;				
			} else {
				tail.next = l2;
				tail = l2;
				l2 = l2.next;
			}
		}
		if (l1 != null) {
			tail.next = l1;
		} else {
			tail.next = l2;
		}
		mergedList = mergedList.next;
		return mergedList;
    }
}