package com.example.pc.projectdoibong.Modols;

/**
 * Created by PC on 10/14/2017.
 */

public class DoiBong {
    private String tenCauLacBo;
    private String quocTich;
    private int loGo;

    public DoiBong() {
    }

    public DoiBong(String tenCauLacBo, String quocTich, int loGo) {
        this.tenCauLacBo = tenCauLacBo;
        this.quocTich = quocTich;
        this.loGo = loGo;
    }

    public String getTenCauLacBo() {
        return tenCauLacBo;
    }

    public void setTenCauLacBo(String tenCauLacBo) {
        this.tenCauLacBo = tenCauLacBo;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public int getLoGo() {
        return loGo;
    }

    public void setLoGo(int loGo) {
        this.loGo = loGo;
    }
}