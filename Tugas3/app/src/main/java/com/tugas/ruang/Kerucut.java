package com.tugas.ruang;
import com.tugas3.bidang.Lingkaran;
public class Kerucut extends Lingkaran implements MenghitungRuang{
    float tinggi;
    public Kerucut(){
      
    }
    public Kerucut(float r,float tinggi){
      super(r);
      this.tinggi=tinggi;
    }
    public float Pytagoras(){
      return (float) (Math.sqrt(Math.pow(super.GetJari(),2)+Math.pow(tinggi,2)));
    }
    private float volume(float r,float tinggi){
      return (float) (Math.PI*r*r*tinggi)/3;
    }
    private float permukaan(float r){
      return (float) (Math.PI*r*(r+Pytagoras()));
    }@Override
    public float Getvolume(){
      return volume(r,tinggi);
    }@Override
    public float Getpermukaan(){
      return permukaan(r);
    }
    
}
