/*  It ensures a class only one instance, and global point of access to it.
    
    It has two types for initializtion :
   (1) Eager loading - before create a instance it will be initialized.
   (2) Lazy loading - After create an object it will be initialized.
*/

class Singleton{

    private static Singleton instance = new Singleton();
    private Singleton(){
        System.out.println("it will be call once \n");
    }

    public static Singleton getInstance(){
        return instance;
    }
}


class SingletonPatternDemo{
    public static void main(String[] args) {
        
       Singleton obj1 = Singleton.getInstance();

       Singleton obj2 = Singleton.getInstance();

       Singleton obj3 = Singleton.getInstance();


      // The address of object are same -
      System.out.println(obj1);
      System.out.println(obj2);
      System.out.println(obj3);


    }
}