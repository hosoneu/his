package edu.neu.hoso.model;

public class CommonlyUsedFmedical {
    private Integer commonlyUsedFmedicalId;

    private Integer doctorId;

    private Integer fmedicalItemsId;

    /* 对应的非药品对象 重载了构造方法 新建了getter和setter 同时修改Mapper @29-y 2019.06.14*/
    private FmedicalItems fmedicalItems;

    public CommonlyUsedFmedical(Integer commonlyUsedFmedicalId, Integer doctorId, Integer fmedicalItemsId) {
        this.commonlyUsedFmedicalId = commonlyUsedFmedicalId;
        this.doctorId = doctorId;
        this.fmedicalItemsId = fmedicalItemsId;
    }


    public CommonlyUsedFmedical(Integer commonlyUsedFmedicalId, Integer doctorId, Integer fmedicalItemsId, FmedicalItems fmedicalItems) {
        this.commonlyUsedFmedicalId = commonlyUsedFmedicalId;
        this.doctorId = doctorId;
        this.fmedicalItemsId = fmedicalItemsId;
        this.fmedicalItems = fmedicalItems;
    }

    public FmedicalItems getFmedicalItems() {
        return fmedicalItems;
    }

    public void setFmedicalItems(FmedicalItems fmedicalItems) {
        this.fmedicalItems = fmedicalItems;
    }

    public CommonlyUsedFmedical(Integer doctorId, Integer fmedicalItemsId) {
        this.doctorId = doctorId;
        this.fmedicalItemsId = fmedicalItemsId;
    }
    public CommonlyUsedFmedical() {
            super();
        }

        public Integer getCommonlyUsedFmedicalId () {
            return commonlyUsedFmedicalId;
        }

        public void setCommonlyUsedFmedicalId (Integer commonlyUsedFmedicalId){
            this.commonlyUsedFmedicalId = commonlyUsedFmedicalId;
        }

        public Integer getDoctorId () {
            return doctorId;
        }

        public void setDoctorId (Integer doctorId){
            this.doctorId = doctorId;
        }

        public Integer getFmedicalItemsId () {
            return fmedicalItemsId;
        }

        public void setFmedicalItemsId (Integer fmedicalItemsId){
            this.fmedicalItemsId = fmedicalItemsId;
        }
}