package checkpoint.andela.members;

import java.util.Comparator;

import checkpoint.andela.main.Member;

public class CheckMemberStatus implements Comparator<Member> {
  
  @Override
  public int compare(Member member1, Member member2) {
    if(member1 instanceof Staff && member2 instanceof Student) {
      return -1; 
    }
    if(member1 instanceof Student && member2 instanceof Staff) {
      return 1;
    }
    if ((member1 instanceof Staff && member2 instanceof Staff ) || 
        (member1 instanceof Student && member2 instanceof Student )) { 
      return member1.getRegistrationDate().compareTo(member2.getRegistrationDate());
    }
    return 0; 
  }     
}  