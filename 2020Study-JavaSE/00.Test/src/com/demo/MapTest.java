package com.demo;

import java.util.Collection;
import java.util.TreeMap;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.demo
 * @Author: Dong Binyu
 * @CreateTime: 2022-01-08 15:39
 * @Description:
 */
public class MapTest {
   class ListNode {
       int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static void main(String[] args) {
        TreeMap<Integer,ListNode> map=new TreeMap<> ();
        Collection<ListNode> values = map.values ();


    }
}
