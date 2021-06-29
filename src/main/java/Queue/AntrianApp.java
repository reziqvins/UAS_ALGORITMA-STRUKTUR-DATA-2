package Queue;

public class AntrianApp {
    public static void main (String[]args){
    Antrian antrian= new Antrian (5);
    antrian.enqueue(20090127);
    antrian.display();
    antrian.enqueue(8);
    antrian.display();
        System.out.println("Yang diambil dari antrian = "+ antrian.dequeue());
        System.out.println("Nama Saya Muhammad Reziq Darusman");
    antrian.display();
        System.out.println("");
    antrian.enqueue(7);
    antrian.display();
    antrian.enqueue(6);
    antrian.display();
        System.out.println("Nilai yang paling depan = "+ antrian.peek());
    
        }
    
}
