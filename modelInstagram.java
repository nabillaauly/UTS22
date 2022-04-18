package Ig;

import java.util.ArrayList;


public class modelIG {
    public String profile;
    public String Username;
    public String lokasi;
    public String postingan;
    public String Caption;
    public int like;
    public ArrayList komentar = new ArrayList<>();
    
    public modelIG(){

    }

    public modelIG(String pProfil, String pUsername, String pLokasi, String pPostingan ,String pCaption ,int pSuka, ArrayList pKomen){
        this.profile = pProfil;
        this.Username = pUsername;
        this.lokasi = pLokasi;
        this.postingan = pPostingan;
        this.Caption= pCaption;
        this.like = pSuka;
        this.komentar = pKomen;
    }

    public void postKonten (){
        System.out.println();
        System.out.println("INSTAGRAM");
        System.out.println("-----------------------------------");
        System.out.println("\n");
        System.out.println(this.profile +"  "+ this.Username);
        System.out.println("location : "+this.lokasi);
        System.out.println("\n");
        System.out.println("------------------------");
        System.out.println("********************");
        System.out.println("*                  *");
        System.out.println("*                  *");
        System.out.println("*                  *");
        System.out.println("*                  *");
        System.out.println("*       "+this.postingan+"     *");
        System.out.println("*                  *");
        System.out.println("*                  *");
        System.out.println("*                  *");
        System.out.println("*                  *");
        System.out.println("********************");
        System.out.println(this.Caption);
        System.out.println("(1) LIKE : " + this.like+ "  (2) COMMENT  : "+this.komentar.size()+ "    (3) SHARE"+ "    (4) SAVE");
        System.out.println("(5) SHOW ALL COMMENTS");
        System.out.println("(0) Pilih postingan lain");
    }

    public void postingan(){
        System.out.println();
        System.out.println("INSTAGRAM");
        System.out.println("-----------------------------------");
        System.out.println("\n");
        System.out.println(this.profile +"  "+ this.Username);
        System.out.println("location : "+this.lokasi);
        System.out.println("\n");
        System.out.println("------------------------");
        System.out.println("********************");
        System.out.println("*                  *");
        System.out.println("*                  *");
        System.out.println("*                  *");
        System.out.println("*                  *");
        System.out.println("*       "+this.postingan+"     *");
        System.out.println("*                  *");
        System.out.println("*                  *");
        System.out.println("*                  *");
        System.out.println("*                  *");
        System.out.println("********************");
        System.out.println(this.Caption);
        System.out.println("(1) LIKE : " + this.like+ "  (2) COMMENT  : "+this.komentar.size()+ "    (3) SHARE"+ "    (4) SAVE");
        System.out.println("(5) SHOW ALL COMMENTS");
        System.out.println("(0) Pilih postingan lain");
    }

    public int LikePostingan (int likePost){
        like = like+1;
        return like;
    }
    public ArrayList IsiKomentar(String komenPost){
        for(int index = 0; index<1;index++){
            komentar.add(komenPost);
        }
        return komentar;
    }

    public void ShowComment(){
        for(int i=0;i<komentar.size();i++){
            System.out.println(komentar.get(i));
        }

    }
}
