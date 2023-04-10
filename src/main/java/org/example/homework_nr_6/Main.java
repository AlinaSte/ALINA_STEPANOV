package org.example.homework_nr_6;

public class Main {
    public static void main(String[] ags){
        Employee agent1 = new Employee("Bob", 32,"IT");
        System.out.println(agent1.getName() + " is from " +agent1.getDepartment()+" department");
        System.out.println(agent1.getAge()+ " years old");
        Invoice invoice1 = new Invoice("Rio2", "coltar", 2, 12.5);
  //      invoice1.setPrice(-4);
        System.out.println(invoice1.getAmount());
        Invoice invoice2 = new Invoice("Rio3", "canapea", -2, 13.5);
        System.out.println(invoice2.getAmount());
        Invoice invoice3 = new Invoice("Aurora", "dulap", 3, -11.75);
        System.out.println(invoice3.getAmount());
        System.out.println("======Data Class======");
        Date data= new Date(34,32,22);
        System.out.println(data.displayDate());
        Date data2= new Date(14,2,2022);
        System.out.println(data2.displayDate());
        Date data3= new Date(20,10,-44);
        System.out.println(data3.displayDate());
    }
}
