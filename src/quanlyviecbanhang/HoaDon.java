/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyviecbanhang;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class HoaDon {
    private int hoaDonID;
    private KhachHang khachHang;
    private String ngayBan;
    private float tongTien;
    private ArrayList<MatHangMua> danhSachMatHangMua;

    public HoaDon(int hoaDonID, KhachHang khachHang, String ngayBan) {
        this.hoaDonID = hoaDonID;
        this.khachHang = khachHang;
        this.ngayBan = ngayBan;
        this.danhSachMatHangMua = new ArrayList<>();
    }

    public void themMatHangMua(MatHangMua matHangMua) {
        this.danhSachMatHangMua.add(matHangMua);
        this.tongTien += matHangMua.tinhTien();
    }

    public void inHoaDon() {
        System.out.println("Hoa don ID: " + hoaDonID);
        System.out.println("Khach hang: " + khachHang.getTenKH());
        System.out.println("Ngay ban: " + ngayBan);
        System.out.println("Danh sach mat hang mua:");

        for (MatHangMua matHangMua : danhSachMatHangMua) {
            System.out.println("- Ten mat hang: " + matHangMua.getMatHang().getTenMatHang() + "\n" +
                               "+So luong: " + matHangMua.getSoLuong() + "\n" +
                               "+Don gia: " + matHangMua.getMatHang().getGia() + "\n" +
                               "+Thanh tien: " + matHangMua.tinhTien()); 
        }
        System.out.println("Tong tien: " + tongTien);
    }
}
