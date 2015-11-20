package checkpoint.andela.members;

import java.util.*;
import checkpoint.andela.main.*;

public class BorrowOrder {
  public static boolean addToBorrowQueue(Member member) {
    borrowingQueue.add(member); 
    return true;
  }
  
  public static boolean addToReturningQueue(Member member) {  
    returningQueue.add(member);
    return true;
  } 
  
  static CheckMemberStatus comparator = new CheckMemberStatus();
  public static  PriorityQueue<Member> borrowingQueue = new PriorityQueue<Member>(10, comparator);
  public static PriorityQueue<Member> returningQueue = new PriorityQueue<Member>(10, comparator);
}
   