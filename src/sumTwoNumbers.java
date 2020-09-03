public class sumTwoNumbers {



    public static void main(String[] args) {


    }




    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // getting the numbers ...
        int num1 = reverseLinkedListAndFormANumber(l1);
        int num2 = reverseLinkedListAndFormANumber(l2);
        int sum  = num1 + num2 ;

        // converting the result to a linked list ...(in reverse) ...
        String sumS = String.valueOf(sum) ;
        ListNode next = null ;
        ListNode head = null ;

        for(int i = sumS.length()  ; i >= 0;  i--) {
            // for the first time create the first node (so u don't get an empty node in the beginning)...
            if( i == sumS.length()) {
                head = new ListNode(Integer.parseInt(String.valueOf(sumS.charAt(i))) , null) ;
            } else {
                ListNode newNode = new ListNode(Integer.parseInt(String.valueOf(sumS.charAt(i))) , head) ;
                head = newNode ;
            }
        }

        return head ;
    }




    private int reverseLinkedListAndFormANumber(ListNode node ) {

        // reverse Linked List ...
        ListNode  prev = null ;
        ListNode  current = null ;
        ListNode next = null ;
        while(current != null ) {
            next = current.next ;
            current.next = prev;
            prev = current ;
            current = next ;
        }
        node = prev ;

        // returning a number...
        ListNode iterate  = node ;
        StringBuilder builder = new StringBuilder("") ;
        while(iterate != null) {
            builder.append(iterate.val) ;
            iterate = iterate.next  ;
        }


        return Integer.parseInt(builder.toString()) ;
    }



  public class ListNode {
        int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

}
