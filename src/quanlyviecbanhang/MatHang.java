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
public class MatHang {
    private float gia;
    private int matHangID;
    private int soLuong;
    private String tenMatHang;
    private static ArrayList<MatHang> KhoMatHang = new ArrayList<>();

    public MatHang(int matHangID, String tenMatHang, float gia, int soLuong) {
        this.matHangID = matHangID;
        this.tenMatHang = tenMatHang;
        this.gia = gia;
        this.soLuong = soLuong;
    }

    public String getTenMatHang() {
        return tenMatHang;
    }

    public float getGia() {
        return gia;
    }

    public int getMatHangID() {
        return matHangID;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public static void themMatHangVaoKho(MatHang matHang) {
        KhoMatHang.add(matHang);
    }

    public static MatHang timMatHangTheoID(int id) {
        for (MatHang matHang : KhoMatHang) {
            if (matHang.getMatHangID() == id) {
                return matHang;
            }
        }
        return null;
    }
}
