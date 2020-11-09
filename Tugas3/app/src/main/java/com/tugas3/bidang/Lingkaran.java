package com.tugas3.bidang;

public class Lingkaran implements MenghitungBidang {
    protected float r;
    public Lingkaran(){
      
    }
    public Lingkaran(float r){
      this.r=r;
    }
    public float GetJari(){
      return r;
    }
    private float keliling(float r){
      return (float) (2*Math.PI*r);
    }
    private float luas(float r){
      return (float) (Math.PI*r*r);
    }@Override
    public float Getluas(){
      return luas(r);
    }@Override
    public float Getkeliling(){
      return keliling(r);
    }
}
