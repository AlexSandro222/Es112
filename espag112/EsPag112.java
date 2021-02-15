
package espag112;


public class EsPag112{
    
    public static void main(String[] args) {
     AnotherClass Eterno = new AnotherClass("Dotto");
     AnotherClass Boh = new AnotherClass("Pisolo"); 
     AnotherClass Adios = new AnotherClass("Brontolo"); 
     AnotherClass CheNeSo = new AnotherClass("Mammolo"); 
     AnotherClass Terno = new AnotherClass("Gongolo"); 
     AnotherClass Perno = new AnotherClass("Eolo"); 
     AnotherClass Panno = new AnotherClass("Cucciolo");
     Eterno.start();
     Boh.start();
     Adios.start();
     CheNeSo.start();
     Terno.start();
     Perno.start();
     Panno.start();
     AgainClass Vano = new PortClass("Nani");
     ThreadClass Porto = new ThreadClass(Vano);
     Porto.start();
    }
    
}
