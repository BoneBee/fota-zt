package com.intest.carservice.Respone;

import java.util.List;

public class CarTypeEcuType {

    private String partTypeName;

    private List<CarTypeResponeEcu> ecus;

    public String getPartTypeName() {
        return partTypeName;
    }

    public void setPartTypeName(String partTypeName) {
        this.partTypeName = partTypeName;
    }

    public List<CarTypeResponeEcu> getEcus() {
        return ecus;
    }

    public void setEcus(List<CarTypeResponeEcu> ecus) {
        this.ecus = ecus;
    }
}
