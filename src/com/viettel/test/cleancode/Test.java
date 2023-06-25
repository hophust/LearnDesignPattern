package com.viettel.test.cleancode;

import com.squareup.okhttp.*;
import org.apache.commons.codec.binary.Base64;

import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.UUID;
public class Test {
    public String generateToken(String basicToken) {
        basicToken = basicToken.replace("Basic ", "");
        String credentialHash = new String(org.apache.commons.codec.binary.Base64.decodeBase64(basicToken.getBytes()), Charset.forName("utf-8"));
        String[] arr = credentialHash.split(":");
        String username = arr[0];
        String password = arr[1];
// timestamp: Số giây từ mốc thời gian năm 1970, tháng 01, ngày 01, 00 giờ,
// 00 phút, 00 giây, 000 mili giây đến thời điểm hiện tại (tính theo giờ Utc).
        long timeStamp = System.currentTimeMillis()/1000L;
// nonce: Chuỗi ký tự ngẫu nhiên chỉ bao gồm chữ cái và chữ số (uuid)
        String nonce = UUID.randomUUID().toString().replace("-","");
        String signatureRawData = "POST" + timeStamp + nonce;
        MessageDigest md;
        String signature = null;
        try {
            md = MessageDigest.getInstance("MD5");
            byte[] array = md.digest(signatureRawData.getBytes("UTF-8"));
            signature = new String(Base64.encodeBase64(array));
        } catch (Exception ex) {
            ex.getMessage();
        }
        return signature + ":" + nonce + ":" + timeStamp + ":" + username + ":" + password;
    }




    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient();
        String authen = new Test().generateToken("Basic YXBpdmlldHRlbDphcGl2aWV0dGVsMTIzNDU2");

        com.squareup.okhttp.MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, "{\r\n \"xmlData\" : \"<Invoices><Inv><Invoice><Ikey>1683887131189</Ikey><CusCode></CusCode><Buyer/><CusName><![CDATA[Tổng công ty viễn thông quân đội Viettel]]></CusName><CusAddress><![CDATA[Số 5 Phạm Hùng, Từ Liêm, Hà Nội]]></CusAddress><CusBankName/><CusPhone/><CusBankNo/><CusTaxCode>0200572621</CusTaxCode><PaymentMethod></PaymentMethod><CurrencyUnit>VND</CurrencyUnit><ExchangeRate>1</ExchangeRate><PaymentStatus>1</PaymentStatus><Email></Email><EmailCC></EmailCC><Extra></Extra><Products><Product><Code><![CDATA[]]></Code><No></No><Feature>1</Feature><ProdName><![CDATA[Doanh thu thanh toán Dịch vụ thoại TEST theo hợp đồng 1900VOICE_HDCT_NHUNGTEST20204, giữa Trần Khởi My và Viettel, biên bản đối soát kỳ cước 01/04/2023]]></ProdName><ProdUnit><![CDATA[]]></ProdUnit><ProdQuantity></ProdQuantity><ProdPrice></ProdPrice><DiscountAmount>0</DiscountAmount>\\t<Total>12222</Total><VATRate>5</VATRate><VATAmount>111110</VATAmount><Amount>123332</Amount></Product></Products><Total>12222</Total><VATRate>5</VATRate><VATAmount>111110</VATAmount><Amount>123332</Amount><AmountInWords>{AmountInWords}</AmountInWords></Invoice></Inv></Invoices>\",\r\n \"pattern\" : \"1C23TYY\",\r\n \"serial\" : \"\",\r\n \"ikey\" : null,\r\n \"option\" : null\r\n}\r\n");
        Request request = new Request.Builder()
                .url("http://0105987432999.softdreams.vn/api/publish/importInvoice")
                .method("POST", body)
                .addHeader("Authentication", authen)
                .addHeader("Content-Type", "application/json")
                .addHeader("Cookie", "ASP.NET_SessionId=h0by22xldxenlasfpiejx2sg; culture=Vi-VN")
                .build();
        Response response = client.newCall(request).execute();
        System.out.println(response);


    }
}
