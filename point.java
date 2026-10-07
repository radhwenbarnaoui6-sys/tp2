package tp2;

public class point {
	int Abscisse;
    int Ordonnée;
    String Nom;
    point (String n,int x, int y){
   	 Nom=n;
   	 Abscisse=x;
   	 Ordonnée=y;
    } 
    point(int b,int a){
   	 Abscisse=b;
   	 Ordonnée=a;
    }
    point(String f){
   	 Nom=f;
    }
    void TranslHoriz(int t) {
   	 Abscisse=Abscisse+t;
    }
    void Translation(int t, int t1) {
   	 Abscisse=Abscisse+t;
   	 Ordonnée=Ordonnée+t1;
    }
    void TranslVert(int k) {
   	 Ordonnée=Ordonnée+k;
    }
    boolean Coincide(point d) {
   	 if (this.Ordonnée==d.Ordonnée && this.Abscisse==d.Abscisse)
   		 return true;
   	 else 
   	    return false;
    }
    void setNom(String m) {
   	 this.Nom=m;
    }
    void setAbscisse(int f) {
   	 this.Abscisse=f;
    }
    void setOrdonnée(int j) {
   	 this.Ordonnée=j;
    }
    String getNom() {
   	 return this.Nom;
    }
    int getAbscisse() {
   	 return this.Abscisse;
    }
    int getOrdonnée() {
   	 return this.Ordonnée;
    }
    
    void Affiche () {
        System.out.println("nom="+Nom);
   	 System.out.println("abs="+Abscisse);
   	 System.out.println("ord="+Ordonnée);
}

}
