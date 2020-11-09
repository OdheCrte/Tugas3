package com.tugas.ruang;
import com.tugas3.bidang.PersegiPanjang;
public class Balok extends PersegiPanjang implements MenghitungRuang{
    float tinggi;
    public Balok(){
      
    }
    public Balok(float panjang,float lebar,float tinggi){
      super(panjang,lebar);
      this.tinggi=tinggi;
    }
    private float volume(float panjang,float lebar){
      return this.panjang*this.lebar*this.tinggi;
    }
    private float permukaan(float panjang,float lebar){
      return (this.panjang*this.lebar+this.panjang*this.tinggi+this.tinggi*this.lebar)*2;
    }@Override
    public float Getvolume(){
      return volume(panjang,lebar);
    }@Override
    public float Getpermukaan(){
      return permukaan(panjang,lebar);
    }
}
