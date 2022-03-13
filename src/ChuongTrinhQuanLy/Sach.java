/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChuongTrinhQuanLy;

/**
 *
 * @author Admin
 */
public class Sach {

    static boolean gettinhtrang;
    private String MaSach;
    private String TenSach;
    private int Nam;
    private String NhaXuatBan;
    private Double tien;
    private int TinhTrang;
    
    public Sach() {	
}
public Sach(String MaSach,String TenSach,int Nam,String NhaXuatBan,Double tien,int TinhTrang) {
	this.MaSach=MaSach;
	this.TenSach=TenSach;
	this.Nam=Nam;
	this.NhaXuatBan=NhaXuatBan;
	this.tien=tien;
	this.TinhTrang=TinhTrang;
}
 public void setName(String TenSach) {
	 this.TenSach=TenSach;
 }
 public void setId(String MaSach) {
	 this.MaSach=MaSach;
 }
 public void setnam(int Nam) {
	 this.Nam=Nam;
 }
 public void setnhaxuatban(String NhaXuatBan) {
	 this.NhaXuatBan=NhaXuatBan;
 }
 public void settien(Double tien) {
	 this.tien=tien;
 }
 public void setTinhTrang(int TinhTrang) {
	 this.TinhTrang=TinhTrang;
 }
 public String getName() {
	 return TenSach;
 }
 public int getNam() {
	 return Nam;
 }
 public String getNhaXuatBan() {
	 return NhaXuatBan;
 }
 public Double gettien() {
	 return tien;
 }
 public int gettinhtrang() {
	 return TinhTrang;
 }
 public String getsmaSach() {
	 return MaSach;
 }
}



