package genericType.listDataGeneric;

import java.util.StringJoiner;

public class Organization {
    private String name;
    private String address;
    private int members;
    private Boolean office;

    public Organization(String name, String address, int members, Boolean office) {
        this.name = name;
        this.address = address;
        this.members = members;
        this.office = office;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    public Boolean getOffice() {
        return office;
    }

    public void setOffice(Boolean office) {
        this.office = office;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Organization.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("address='" + address + "'")
                .add("members=" + members)
                .add("office=" + office)
                .toString();
    }
}
