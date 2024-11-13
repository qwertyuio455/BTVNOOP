/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyviecbanhang;

/**
 *
 * @author Administrator
 */
public class MatHangMua {
    private HoaDon hd;
    private int matHangMuaID;
    private MatHang matHang;
    private int soLuong;

    public MatHangMua(int matHangMuaID, MatHang matHang, int soLuong) {
        this.matHangMuaID = matHangMuaID;
        this.matHang = matHang;
        this.soLuong = soLuong;
    }

    public MatHang getMatHang() {
        return matHang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public float tinhTien() {
        return matHang.getGia() * soLuong;
    }

    public void themMatHangMuaCuaHoaDon(HoaDon hd) {
        hd.themMatHangMua(this);
    }
}
