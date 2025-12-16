public class CajaAhorromain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CajaAhorro c1=new CajaAhorro();
        System.out.println("---------------CUENTA1------------------");
        c1.depositar(100);
        System.out.println("El saldo despues del deposito: "+c1.obtenerSaldo());
          
        c1.girar(2);
       
        System.out.println("El saldo despues del giro es: "+c1.obtenerSaldo());
       
        System.out.println("El numero de transacciones es: "+c1.obtenerTransacciones());
        
         System.out.println("---------------CUENTA2------------------");
         CajaAhorro c2=new CajaAhorro(200);
         System.out.println("El saldo de la cuenta es: "+c2.obtenerSaldo());
         System.out.println("El numero de transacciones es: "+c2.obtenerTransacciones());
    }
    
}
