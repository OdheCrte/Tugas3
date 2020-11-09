package com.tugas3.bidang;

public class PersegiPanjang implements MenghitungBidang {
    protected float panjang;
    protected float lebar;
    public PersegiPanjang(){
      
    }
    public PersegiPanjang(float panjang,float lebar){
      this.panjang=panjang;
      this.lebar=lebar;
    }
    private float luas(float panjang, float lebar){
      return this.panjang*this.lebar;
    }
    private float keliling(float panjang,float lebar){
      return (this.panjang+this.lebar)*2;
    }@Override
    public float Getluas(){
      return luas(panjang,lebar);
    }@Override
    public float Getkeliling(){
      return keliling(panjang,lebar);
    }
}
