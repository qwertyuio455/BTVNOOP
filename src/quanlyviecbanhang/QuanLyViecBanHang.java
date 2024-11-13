/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quanlyviecbanhang;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class QuanLyViecBanHang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Thêm 3 mặt hàng vào kho
        MatHang matHangX = new MatHang(1, "X", 10000, 100);
        MatHang matHangY = new MatHang(2, "Y", 20000, 300);
        MatHang matHangZ = new MatHang(3, "Z", 15000, 200);

        MatHang.themMatHangVaoKho(matHangX);
        MatHang.themMatHangVaoKho(matHangY);
        MatHang.themMatHangVaoKho(matHangZ);

        // Tạo khách hàng "Nguyễn Văn A"
        KhachHang khachHangA = new KhachHang("Ha Noi", 1, "Nguyen Van A");

        // Tạo hóa đơn cho khách hàng "Nguyễn Văn A"
        HoaDon hoaDon = new HoaDon(1, khachHangA, "13/11/2024");

        // Tìm mặt hàng X và Y trong kho
        MatHang matHangTimDuocX = MatHang.timMatHangTheoID(1);
        MatHang matHangTimDuocY = MatHang.timMatHangTheoID(2);

        // Kiểm tra và thêm mặt hàng X vào hóa đơn với số lượng 2
        if (matHangTimDuocX != null && matHangTimDuocX.getSoLuong() >= 2) {
            hoaDon.themMatHangMua(new MatHangMua(101, matHangTimDuocX, 2));
            matHangTimDuocX.setSoLuong(matHangTimDuocX.getSoLuong() - 2); // Cập nhật lại số lượng trong kho
        }

        // Kiểm tra và thêm mặt hàng Y vào hóa đơn với số lượng 10
        if (matHangTimDuocY != null && matHangTimDuocY.getSoLuong() >= 10) {
            hoaDon.themMatHangMua(new MatHangMua(102, matHangTimDuocY, 10));
            matHangTimDuocY.setSoLuong(matHangTimDuocY.getSoLuong() - 10); // Cập nhật lại số lượng trong kho
        }

        // In hóa đơn để kiểm tra
        hoaDon.inHoaDon();
    }
    
}
