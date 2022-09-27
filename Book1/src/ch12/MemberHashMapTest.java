package ch12;

public class MemberHashMapTest {
	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member MemberLee = new Member(1001,"이지원");
		Member MemberSon = new Member(1002,"손민국");
		Member MemberPark = new Member(1003,"박서훤");
		Member MemberHong = new Member(1004,"홍길동");
		
		memberHashMap.addMember(MemberLee);
		memberHashMap.addMember(MemberSon);
		memberHashMap.addMember(MemberPark);
		memberHashMap.addMember(MemberHong);
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();
	}

}
