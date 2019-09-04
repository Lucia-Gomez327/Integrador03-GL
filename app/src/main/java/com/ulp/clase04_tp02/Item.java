package com.ulp.clase04_tp02;

public class Item {
    private int estrella;
    private  int imagen;

   public Item(int imagen, int estrella){
this.imagen=imagen;
this.estrella=estrella;
    }
      public int getEstrella(){
        return estrella;
      };
    public  int getImagen()
    {
        return imagen;
    }
}
