package LibraryManagement;

public class Member implements MemberActions {
    private String name;
    private String memberId;

    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getMemberId() {
        return memberId;
    }
}
