package genericType.listDataGeneric;

import java.util.StringJoiner;

public class School {
    private String name;
    private String address;
    private int rank;

    public School(String name, String address, int rank) {
        this.name = name;
        this.address = address;
        this.rank = rank;
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

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", School.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("address='" + address + "'")
                .add("rank=" + rank)
                .toString();
    }
}
