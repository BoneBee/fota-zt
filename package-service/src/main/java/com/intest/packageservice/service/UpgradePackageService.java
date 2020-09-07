package com.intest.packageservice.service;

import com.intest.common.result.PagerDataBaseVO;
import com.intest.dao.entity.PartsTreeBto;
import com.intest.packageservice.request.PartsTreeRequest;
import com.intest.packageservice.request.UpgradePackageRequest;
import com.intest.packageservice.request.VersionRequest;
import com.intest.packageservice.vo.VersionVO;

import java.util.List;

/**
 * @author ：intest
 * @description：TODO
 * @date ：2020/8/12 11:03
 */
public interface UpgradePackageService {
    PagerDataBaseVO findAllUpgradePackage(UpgradePackageRequest request);

    List<PartsTreeBto> partsTree(PartsTreeRequest request);

    List<VersionVO> getVersion(VersionRequest request);
}
