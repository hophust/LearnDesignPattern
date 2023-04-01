package com.viettel.test.OCA.chuong4.hocstatic;
// static được sử dụng để quản lý bộ nhớ tốt hơn và nó có thể được truy cập trực tiếp thông qua lớp mà không cần khởi tạo.
//Biến static có thể được sử dụng làm thuộc tính chung, để dùng chung dữ liệu cho tất cả objects (hoặc instances ) của lớp đó và điều đó giúp cho chương trình tiết kiệm bộ nhớ hơn
//Nếu một biến vừa khai báo từ khóa final vừa khai báo từ khóa static thì nó được xem như là một hằng số
//Phuong thuc static thuong dung la cac ham Utils
//Khoi static dung de khoi tao hoac thay doi gia tri bien static, duoc thuc thi truoc phuong thuc main, tai thoi diem tai lop
public class Counter {
    // int count=0;
    static int count=0;
    public int khaiTrongStatic;
    public final String khongKhoiTaoBienFianl;
    public static final String bienKhongTheThayDoiGiaTri;
    static {
        bienKhongTheThayDoiGiaTri ="hopnv";
    }

    public Counter() {
        khongKhoiTaoBienFianl = null;
    }
    public void visit(){
        count++;
        print();
    }
    public void print(){
        System.out.println("count = " +count);
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.visit();
        Counter counter1 = new Counter();
        counter1.visit();
        Counter counter2 = new Counter();
        counter2.visit();
    }
}
