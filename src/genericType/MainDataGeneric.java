package genericType;

import genericType.listDataGeneric.*;

public class MainDataGeneric {
    public static void main(String[] args) {
        DataGeneric<String> data1 = new DataGeneric<String>();
        data1.setData("Ahmad Roni");
        System.out.println("data1 Value "+ data1.getData());

        //data1.setData(1234567); => error

        DataGeneric<Integer> data2 = new DataGeneric<Integer>();
        data2.setData(1234567);
        System.out.println("data2 Value "+ data2.getData());

        DataGeneric<Boolean> data3 = new DataGeneric<Boolean>();
        data3.setData(true);
        System.out.println("data2 Value "+ data3.getData());

        DataGeneric<Product> data4 = new DataGeneric<Product>();
        //data4.setData(new Product("Ajinomoto",2500.00));
        Product product = new Product("Obat Awet Muda",1000000.0);
        data4.setData(product);
        System.out.println("data4 Value "+ data4.getData());

        DataGeneric<Animal> data5 = new DataGeneric<Animal>();
        data5.setData(new Animal("Ajinomoto",2500));
        System.out.println("data5 Value "+ data5.getData());

        DataGeneric<Car> data6 = new DataGeneric<Car>();
        data6.setData(new Car("mini cooper",1000000.0, 5));
        System.out.println("data6 Value "+ data6.getData());

        DataGeneric<Person> data7 = new DataGeneric<Person>();
        data7.setData(new Person("Addyani","Bogor", 22));
        System.out.println("data7 Value "+ data7.getData());

        DataGeneric<School> data8 = new DataGeneric<School>();
        data8.setData(new School("SMAN 71","Jakarta", 5));
        System.out.println("data8 Value "+ data8.getData());

        DataGeneric<Organization> data9 = new DataGeneric<Organization>();
        data9.setData(new Organization("PZN","Bandung", 1, false));
        System.out.println("data8 Value "+ data9.getData());

        DataGeneric<Warehouse> data10 = new DataGeneric<Warehouse>();
        data10.setData(new Warehouse("WareHouse Unilever","Bogor"));
        System.out.println("data7 Value "+ data10.getData());

        DataGeneric<String> data11 = new DataGeneric<>("Data 11");
        System.out.println("data11 Value "+ data11.getData());

        //Setelah ada constructor di generic
        DataGeneric<Animal> data12 = new DataGeneric<>(new Animal("Kucing",4));
        System.out.println("Data12 Value : "+ data12.getData());

    }

}
