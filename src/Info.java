// Implementing multiple inheritance in ja`va

// by using implementing interfeces
// date- 14/05/2021

        // implementing interface

class Info{
    String Name;
    String Id;


     interface Employee {
            void E_record();
        }
        interface Manager {
            void M_record();
        }

static class data extends Info implements Employee, Manager {
    public void E_record() {
        System.out.println("This method is accessible for E_record");
    }

    public void M_record() {
        System.out.println("This method is accessible for E_record");
    }
}

    public static void main(String[] args) {
        data d1 =new data();
        d1.E_record();
        d1.M_record();
        // display();
    }}