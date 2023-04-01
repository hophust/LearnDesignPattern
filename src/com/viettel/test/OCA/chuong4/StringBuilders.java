package com.viettel.test.OCA.chuong4;

// nếu tác động lên chính đối tượng đó thì giá trị sẽ bị thay đổi
// nếu khởi tạo đối tượng mới thì
public class StringBuilders {
    public static StringBuilder work(StringBuilder s1,
                                     StringBuilder s2) {
        s1 = new StringBuilder("a");
        s2.append("b");
        return s1;
    }

    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("s1");
        StringBuilder s2 = new StringBuilder("s2");
        StringBuilder s3 = work(s1, s2);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
    }
}
