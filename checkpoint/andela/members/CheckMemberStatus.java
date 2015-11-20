package checkpoint.andela.members;

import java.util.Comparator;

import checkpoint.andela.main.Member;

public class CheckMemberStatus implements Comparator<Member> {
  
  @Override
  public int compare(Member member1, Member member2) {
    if (member1.getClass() == member2.getClass()) { 
      return member1.getRegistrationDate().compareTo(member2.getRegistrationDate());
    }
    if(member1 instanceof Staff && member2 instanceof Student) {
      return -1;
    }
    return 1;
  }
}