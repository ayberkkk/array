public class denemebagli {
    public static void main(String[] args) {       
            
    kuyrukliste kD = new kuyrukliste();

    kD.ekle(12);
    kD.ekle(23);
    kD.ekle(3);
           
    System.out.println("Kuyruktaki eleman syısı :  ");                 
                   
    System.out.println("Çıkartılan eleman :  " + kD.cikart());
                   
    System.out.println("Çıkartılan eleman :  " + kD.cikart());                   
           
    kD.ekle(5);                 
        
    System.out.println("Çıkartılan eleman :  " + kD.cikart());             
           
    System.out.println("Çıkartılan eleman :  " + kD.cikart());
                  
    System.out.println("Çıkartılan eleman :  " + kD.cikart());
        
    }         
    
}

