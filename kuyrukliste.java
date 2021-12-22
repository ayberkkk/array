public class kuyrukliste {
    private kuyrukdugum on ;
    private kuyrukdugum arka;

    public kuyrukliste(){
        on = null;
        arka = null;

    }
    public boolean bosMu(){
        return on == null;
    }

    //enqueue-ekle 
    public void ekle(int eleman){ 
        
        kuyrukdugum yeniDugum =  new kuyrukdugum(eleman);
        if(on == null){
            on = yeniDugum;
            arka = yeniDugum;
        }
        else{
            yeniDugum.sonraki = null;
            arka.sonraki=yeniDugum;
            arka = yeniDugum;
        }
    }

    public int cikart(){
        if(bosMu()){
            System.out.println("Kuyruk boş !");
            return -1;
        }
        int eleman = on.eleman;
        on = on.sonraki;
        return eleman;
    }


}
