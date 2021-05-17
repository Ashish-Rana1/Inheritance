
    interface printable{

    void print();
}
    class Test implements printable{
        public void print(){System.out.println("Hello");}

        public static void main(String args[]){
            Test obj = new Test();
            obj.print();
        }
    }