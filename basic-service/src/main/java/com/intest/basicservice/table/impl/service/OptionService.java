package com.intest.basicservice.table.impl.service;


import com.intest.dao.entity.OptionBto;

public interface OptionService {
    OptionBto getOptionById(String optionId);

    int addOption(OptionBto OptionBto);

    int updateOption(OptionBto OptionBto);

    int deleteOption(String optionId);
}
