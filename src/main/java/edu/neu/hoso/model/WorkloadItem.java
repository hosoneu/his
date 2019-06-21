package edu.neu.hoso.model;

public class WorkloadItem {
    private int ItemID;
    private String Itemname;
    private int Paitents;
    private int InvoiceNumber;
    private double GHF;	//挂号费
    private double ZLF;//	诊疗费
    private double JYF;//	检验费
    private double JYCLF;//	检验材料费
    private double CSJCF;//	超声检查费
    private double CSCLF;//	超声材料费
    private double FSJCF;//	放射检查费
    private double FSCLF;//	放射材料费
    private double MRIJCF;//MRI检查费
    private double MRICLF;//MRI材料费
    private double CTJCF;//	CT检查费
    private double CTCLF;//	CT材料费
    private double XYF;//	西药费
    private double ZCPYF;//	中成药费
    private double ZCYF;//	中草药费
    private double CZF;//	处置费
    private double CZCLF;//	处置材料费
    private double MZF;//	麻醉费
    private double MZYF	;//麻醉药费
    private double MZSSF;//	门诊手术费
    private double QT;//	其他

    public WorkloadItem() {
        this.Paitents = 0;
        this.InvoiceNumber =0;
        this.GHF = 0;
        this.ZLF = 0;
        this.JYF = 0;
        this.JYCLF = 0;
        this.CSJCF = 0;
        this.CSCLF = 0;
        this.FSJCF = 0;
        this.FSCLF = 0;
        this.MRIJCF = 0;
        this.MRICLF = 0;
        this.CTJCF = 0;
        this.CTCLF = 0;
        this.XYF = 0;
        this.ZCPYF = 0;
        this.ZCYF = 0;
        this.CZF = 0;
        this.CZCLF = 0;
        this.MZF = 0;
        this.MZYF = 0;
        this.MZSSF = 0;
        this.QT = 0;
    }
    public int getInvoiceNumber() {
        return InvoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        InvoiceNumber = invoiceNumber;
    }
    public int getPaitents() {
        return Paitents;
    }

    public void setPaitents(int Paitents) {
        this.Paitents = Paitents;
    }

    public double getGHF() {
        return GHF;
    }

    public void setGHF(double GHF) {
        this.GHF = GHF;
    }

    public double getZLF() {
        return ZLF;
    }

    public void setZLF(double ZLF) {
        this.ZLF = ZLF;
    }

    public double getJYF() {
        return JYF;
    }

    public void setJYF(double JYF) {
        this.JYF = JYF;
    }

    public double getJYCLF() {
        return JYCLF;
    }

    public void setJYCLF(double JYCLF) {
        this.JYCLF = JYCLF;
    }

    public double getCSJCF() {
        return CSJCF;
    }

    public void setCSJCF(double CSJCF) {
        this.CSJCF = CSJCF;
    }

    public double getCSCLF() {
        return CSCLF;
    }

    public void setCSCLF(double CSCLF) {
        this.CSCLF = CSCLF;
    }

    public double getFSJCF() {
        return FSJCF;
    }

    public void setFSJCF(double FSJCF) {
        this.FSJCF = FSJCF;
    }

    public double getFSCLF() {
        return FSCLF;
    }

    public void setFSCLF(double FSCLF) {
        this.FSCLF = FSCLF;
    }

    public double getMRIJCF() {
        return MRIJCF;
    }

    public void setMRIJCF(double MRIJCF) {
        this.MRIJCF = MRIJCF;
    }

    public double getMRICLF() {
        return MRICLF;
    }

    public void setMRICLF(double MRICLF) {
        this.MRICLF = MRICLF;
    }

    public double getCTJCF() {
        return CTJCF;
    }

    public void setCTJCF(double CTJCF) {
        this.CTJCF = CTJCF;
    }

    public double getCTCLF() {
        return CTCLF;
    }

    public void setCTCLF(double CTCLF) {
        this.CTCLF = CTCLF;
    }

    public double getXYF() {
        return XYF;
    }

    public void setXYF(double XYF) {
        this.XYF = XYF;
    }

    public double getZCPYF() {
        return ZCPYF;
    }

    public void setZCPYF(double ZCPYF) {
        this.ZCPYF = ZCPYF;
    }

    public double getZCYF() {
        return ZCYF;
    }

    public void setZCYF(double ZCYF) {
        this.ZCYF = ZCYF;
    }

    public double getCZF() {
        return CZF;
    }

    public void setCZF(double CZF) {
        this.CZF = CZF;
    }

    public double getCZCLF() {
        return CZCLF;
    }

    public void setCZCLF(double CZCLF) {
        this.CZCLF = CZCLF;
    }

    public double getMZF() {
        return MZF;
    }

    public void setMZF(double MZF) {
        this.MZF = MZF;
    }

    public double getMZYF() {
        return MZYF;
    }

    public void setMZYF(double MZYF) {
        this.MZYF = MZYF;
    }

    public double getMZSSF() {
        return MZSSF;
    }

    public void setMZSSF(double MZSSF) {
        this.MZSSF = MZSSF;
    }

    public double getQT() {
        return QT;
    }

    public void setQT(double QT) {
        this.QT = QT;
    }

    public int getItemID() {
        return ItemID;
    }

    public void setItemID(int itemID) {
        ItemID = itemID;
    }

    public String getItemname() {
        return Itemname;
    }

    public void setItemname(String itemname) {
        Itemname = itemname;
    }
}
