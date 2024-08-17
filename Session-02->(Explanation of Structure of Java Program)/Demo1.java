//package Session-02->(Explanation of Structure of Java Program);

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }   
}

/*

----> class Hello 
      here class(keyword) is a userdefined blueprint 
      for creating object

      here Hello is a class name 
      =>{Here H is captial in class name because it follows
         convention}

        hello
        Hello
        hELLO

------> {Here it {curly brackets} represents opening of class definition
       
       }


-------> public static void main(string args[])
       
        public(keyword) : Access modifier (public, private, protected,
                   ,default(package private))

        why public -> so that JVM can call it from anywhere 

        static(keyword) : Modifier (abstract,final,synchronized,strictfp etc)

        why static -> If we make any variable or any method as a static , then 
                      in that case we do not need to create object of that class 
                      to access that variable or method,
                      that variable or method is directly accessed by class name 

        if we make as a static then in that case it will be overload but can't be 
          overridden
        
--------> void : represents return type 
            Here void means null (empty | which points to nothing | 
            unset reference)



--------> main : predefined word 
            it is an entry point of the java program 

--------> (string args[]) : Represents command line argument 
             it is responsible for taking argument for main method 
             at run time 

          String : class
          args : string array name 
          [] : represents array 

          (String args[])
          (String[] args)
          (String[] args)
          (String...args) : Here 3 dots represents varargs
          (variable arguments)


--------> { represents main method definition part 


--------> System.out.println("Hello World");

          System : class
          .      : operator {it works as reference b/w object n class
                                                  or 
                                            object n method        
                                            } 
           Println : method (modthod of PrintStream class)

           Internally, 
              class System{
                 static PrintStream out;
                 ---------
                 ---------  
              }
              here out is the object of PrintStream class, whereas
              static is a member of System class 

            Internally,
              class PrintStream{
                public void println(String s){
                   .........
                }
                public void println(String s){
                   .........
                }
                public void print(int s){
                   .........
                }
              }

------------> println() : here ln means new line 
------------> }         : represents closing of main method 
                          definition part 

------------> represents closing of class definition part 


Save : filename.java
compile : javc filename.java (here javac is a compiler)
run : java classname 


public class Hello{
   ........
   ........
}

filename : Hello.java
classname : Hello 

Here filename and classname must be same

*/
