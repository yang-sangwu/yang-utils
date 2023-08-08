package com.yang.yangutils.utils;

/**
 * @author a1002
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    /**
     * 打印链表里面的数据
     */
    public void display(ListNode head) {
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.val + "\t");
            cur = cur.next;
        }
    }

    /**
     * 双向链表的长度
     * 长度@return
     */
    public int size(ListNode head) {
        int count = 0;
        ListNode cur = head;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }
}

