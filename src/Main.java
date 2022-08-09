public class Main {
    public static void main(String[] args)
    {
        car cr = new car(123, "Range Rover ", 5, 125.0, false, false, 0);
        cr.getDeveloper();
        System.out.println(cr.getModel());
        System.out.println(cr.getNumber());
        System.out.println(cr.getSize());
        System.out.println(cr.getSpeed());
        System.out.println(cr.isDriver());
        System.out.println(cr.isOpen());
        System.out.println(cr.getSeating());

        char uni = '\u003C';
        char ani = '\u00AE';
    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> This is For Bike "+uni+uni+uni+uni+uni+uni+uni+uni+uni+uni+uni+uni+uni+uni+uni+uni+uni+uni+uni+uni+uni+uni+uni+uni+ani+ani+ani+ani+ani+ani+ani+ani+ani+ani+ani+ani+ani+ani+ani+ani+ani+ani+ani+ani+ani+ani+ani+ani+ani+ani+ani+ani+ani+ani+ani+ani+ani+ani+ani+ani+ani+ani+ani+ani+ani+ani+ani+ani+ani+ani+ani+ani+ani+ani+ani+ani+ani+ani+ani+ani+ani+ani+ani);

    Bike bk = new Bike(7896, "Royal Enfield", 350, 250, true, true, 2);
    System.out.println(bk.getModel());
    System.out.println(bk.getNumber());
    System.out.println(bk.getSize());
    System.out.println(bk.getSpeed());
    System.out.println(bk.getSeating());
    System.out.println(bk.isDriver());
    System.out.println(bk.isOpen());
    System.out.println(bk.getSeating());


    System.out.println("***************************************************************** This is for the Truck **********************************************************************************");
    Truck trk  = new Truck(6512, "AMW", 15000, 180, true, false, 3);
    System.out.println(trk.getModel());
    System.out.println(trk.getNumber());
    System.out.println(trk.getSize());
    System.out.println(trk.getSpeed());
    System.out.println(trk.getSeating());
    System.out.println(trk.isDriver());
    System.out.println(trk.isOpen());
    System.out.println(trk.getSeating());



    System.out.println("***************************************************************** This is for the BUS **********************************************************************************");
        Bus bs = new Bus(7610,"Mercedes",40000,200,true,false,51);
        System.out.println(bs.getModel());
        System.out.println(bs.getNumber());
        System.out.println(bs.getSize());
        System.out.println(bs.getSpeed());
        System.out.println(bs.getSeating());
        System.out.println(bs.isDriver());
        System.out.println(bs.isOpen());
        System.out.println(bs.getSeating());



        System.out.println("Thank you MR. Kadyan to provide the opportunity to the java Inhertance and getting hands on it. Have the brightest future.");


    }
}
