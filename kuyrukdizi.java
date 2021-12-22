/*
public class kuyrukdizi{
    private int n = 100;
    private int[] k;
    private int on;
    private int arka;
    private int elemanSayisi;

     public kuyrukdizi(){
         on = 0;
         arka =0;
         elemanSayisi =0;

         k = new int [n]; //dizi
     }
     public boolean bosMu(){
         return elemanSayisi ==0;
          
     }
     public boolean doluMu(){
         return elemanSayisi==n;

     }
     public int ekle(int yeniEleman){
        if(doluMu()){
            System.out.println("Kuyruk dolu.");
            return -1;
        }
        k[arka]=yeniEleman;
        arka++;
        if(arka==n){
            arka=0;
        }
        elemanSayisi++;
        return 0;
     }

     public int cikart(){
         int id = -1;
         if(bosMu()){
             System.out.println("Kuyruk boş çıkartma işlemi yapılamaz.");
             return -1;
         }
         id= on;
         on++;
         if(on==n){
             on = 0;
         }
         elemanSayisi--;
         return k[id];
     }

     public int getElemanSayisi(){
         return elemanSayisi;
     }
     public void kuyrukDurumunuYazdır(){
         int j = 1;
         for(int i = on; i<arka;i++){
             System.out.println( j + "- "+k[i]);
             j++;
         }
     }
}
*/