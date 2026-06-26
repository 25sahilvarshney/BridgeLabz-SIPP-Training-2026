class LibraryMember {
    String memberName;
    String memberId;

    LibraryMember(String memberName, String memberId) {
        this.memberName = memberName;
        this.memberId = memberId;
    }

    double calculateFine(int overdueDays) {
        return 0;
    }

    void printDetails() {
        System.out.println("Member Name: " + memberName);
        System.out.println("Member ID: " + memberId);
    }
}

class StudentMember extends LibraryMember {

    StudentMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    double calculateFine(int overdueDays) {
        return overdueDays * 2;
    }
}

class FacultyMember extends LibraryMember {

    FacultyMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    double calculateFine(int overdueDays) {
        return overdueDays * 1;
    }
}

class GuestMember extends LibraryMember {

    GuestMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    double calculateFine(int overdueDays) {
        return overdueDays * 5;
    }
}

public class SmartLibraryMembershipSystem {

    static void displayMembers(LibraryMember[] members, int overdueDays) {

        System.out.println("Library Members Details:\n");

        for (LibraryMember member : members) {
            member.printDetails();
            System.out.println("Fine for " + overdueDays +
                    " overdue days: Rs. " +
                    member.calculateFine(overdueDays));
            System.out.println();
        }
    }

    static void searchMemberById(LibraryMember[] members, String searchId) {

        boolean found = false;

        for (LibraryMember member : members) {
            if (member.memberId.equals(searchId)) {
                System.out.println("Member Found:");
                member.printDetails();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No member found with ID: " + searchId);
        }
    }

    public static void main(String[] args) {

        LibraryMember[] members = {
                new StudentMember("Sahil", "S101"),
                new FacultyMember("Dr. Sharma", "F201"),
                new GuestMember("Rahul", "G301"),
                new StudentMember("Priya", "S102")
        };

        int overdueDays = 5;

        displayMembers(members, overdueDays);

        System.out.println("Searching Member by ID:\n");
        searchMemberById(members, "F201");
    }
} 
