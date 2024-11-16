

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

//    String spec = "https://dou.ua/";
//    String code = "UTF-8";
//
//    String html = "";
//
//    try {
//      html = NetworkService.getStringFromURL(spec, code);
//    } catch (IOException | URISyntaxException e) {
//      // TODO Auto-generated catch block
//      e.printStackTrace();
//    }
//
//    System.out.println(html);

        String spec = "https://s.dou.ua/CACHE/images/img/announces/Group_304_4/c3fb3eaf61037970a3c06852bc29dff1.jpg";
//
//    File folder = new File("ABC");
//    folder.mkdirs();
//
//    try {
//      System.out.println(NetworkService.getFileFromURL(spec, folder));
//    } catch (IOException | URISyntaxException e) {
//      // TODO Auto-generated catch block
//      e.printStackTrace();
//    }

        try {
            Map<String, List<String>> headers = NetworkService.getHeaders(spec);
            for (String k : headers.keySet()) {
                System.out.println(k + " - " + headers.get(k));
            }
        } catch (IOException | URISyntaxException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
        /*      Monitor monitor = new Monitor();
        Cashier cashier = new Cashier(monitor);

        Customer customer1 = new Customer("Alex", 8, cashier);
        Customer customer2 = new Customer("Bob", 9, cashier);

        Thread t1 = new Thread(customer1);
        Thread t2 = new Thread(customer2);

        t1.start();
        t2.start();*/
     /*   Dock dock1 = new Dock(1);
        Dock dock2 = new Dock(2);

        Ship ship1 = new Ship(1, dock1, dock2);
        Ship ship2 = new Ship(2, dock1, dock2);
        Ship ship3 = new Ship(3, dock1, dock2);

        Thread t1 = new Thread(ship1);
        Thread t2 = new Thread(ship2);
        Thread t3 = new Thread(ship3);

        t1.start();
        t2.start();
        t3.start();*/

        //Ship ship2=new Ship();
       // Ship ship3=new Ship();
      // LoadingShip loading1=new LoadingShip(ship1);
       // LoadingShip loading2=new LoadingShip();
        //Thread thread1=new Thread(loading1);
       // thread1.start();
        //Thread thread2=new Thread(loading1);
       // thread2.start();


 /* Thread[] threads = new Thread[100];


         for (int i=0;i<100;i++){
threads[i]=new Thread(new factorial(i));
    threads[i].start();
}

        for (int i=0;i<100;i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/

/*Print print1=new Print();
PrintTask task1=new PrintTask(print1,"Hello");
PrintTask task2=new PrintTask(print1,"Java");
        Thread thread1=new Thread(task1);
        Thread thread2=new Thread(task2);
        thread1.start();
        thread2.start();*/


/*    ÑlothingSeLL jacket=new ÑlothingSeLL(1000,"Îñ³íü", 0.245, "Áîìáåð");
            ÑlothingSeLL sleeveless=new ÑlothingSeLL(900,"Îñ³íü", 0.245, "Áåçðóêàâêà");
System.out.println(jacket);
        *///Çàâäàííÿ 1
          /*  Triangle triangle1=new Triangle(3,4,3);
            Triangle triangle2=new Triangle(5,4,3);
            Triangle triangle3=new Triangle(9,4,3);
            triangle1.Sq(triangle1);
            triangle2.Sq(triangle2);
            triangle3.Sq(triangle3);*/ //Çàâäàííÿ 2


                /*Cat cat1=new Cat("Ìèø³","×åðâîíèé",12,"Barsik");
                Veterinarian veterinarian=new Veterinarian("Joe");
                veterinarian.treatment(cat1);*/

/*String text="Text";
                File file1=new File("r.txt");
            byte[] bytes1=text.getBytes();

                try( OutputStream os =new FileOutputStream(file1)) {

                        os.write(bytes1);
                }
                catch (IOException e){
                        e.printStackTrace();
                }*/

/*Employee employee=new Employee("Lol","LOL",12,"depa");
System.out.println(employee.toString());*/


                /*File file=new File("cat.jpg");
                byte[] bytes=new byte[100];
              try( InputStream is =new FileInputStream(file)) {
              int readByte=is.read(bytes);
              System.out.println(readByte+"  ");
              }
              catch (IOException e){
                      e.printStackTrace();
              }
              }*/

/*
            File fileIn= new File("cat.jpg");
            File folder= new File("Cat");
            folder.mkdirs();
            File fileOut= new File(folder,fileIn.getName());
            try {
                System.out.println(FileService.copyFile(fileIn,fileOut));
            } catch (IOException e) {
              e.printStackTrace();
            }*/
       /*     File fileIn= new File("C:/Users/Bohdana/Desktop/IST-41/2/Êóðñîâà4/");
            File folderOut= new File("Inte");
            folderOut.mkdirs();
          System.out.println(FileService.copyFiles(fileIn,folderOut,100000000));
*/
