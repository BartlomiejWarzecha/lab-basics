package pl.edu.wszib;


public class Punkt {

  protected int x;
  protected int y;
  protected int z;

   public Punkt(int x, int y){

      this.x = x;
      this.y = y;

   }

  public Punkt(int x, int y, int z) {

    this.x = x;
    this.y = y;
    this.z = z;
   }

  protected void zmienPolozenieX(int x){
     this.x +=  x;
   }

  protected void zmienPolozenieY(int y){
    this.y +=  y;
  }

  protected void zmienPolozenieZ(int z){
    this.z +=  z;
  }
}