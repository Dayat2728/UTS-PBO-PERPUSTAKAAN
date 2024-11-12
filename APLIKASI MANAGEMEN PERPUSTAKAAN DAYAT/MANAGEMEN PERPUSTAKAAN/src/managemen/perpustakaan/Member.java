public class Member {
    private String name;
    private String memberId;

    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public String getMemberId() {
        return memberId;
    }

    @Override
    public String toString() {
        return "Nama Anggota: " + name + ", ID Anggota: " + memberId;
    }
}
