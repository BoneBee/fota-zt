package com.intest.packageservice.service;

import com.intest.common.result.PagerDataBaseVO;
import com.intest.dao.entity.PartsTreeBto;
import com.intest.packageservice.request.MakeRequest;
import com.intest.packageservice.request.PartsTreeRequest;
import com.intest.packageservice.request.UpgradePackageRequest;
import com.intest.packageservice.request.VersionRequest;
import com.intest.packageservice.vo.UpgradePackageDetailVO;
import com.intest.packageservice.vo.VersionVO;

import java.util.List;

/**
 * @author ：intest
 * @description：TODO
 * @date ：2020/8/12 11:03
 */
public interface UpgradePackageService {
    /**
     * 升级包信息查询
     * @param request
     * @return
     */
    PagerDataBaseVO findAllUpgradePackage(UpgradePackageRequest request);

    /**
     * 升级包制作-零件列表
     * @param request
     * @return
     */
    List<PartsTreeBto> partsTree(PartsTreeRequest request);

    /**
     * 升级包制作-零件升级版本列表
     * @param request
     * @return
     */
    List<VersionVO> getVersion(VersionRequest request);

    /**
     * 升级包制作
     * @param request
     * @return
     */
    int make(MakeRequest request);

    /**
     * 升级包取消发布
     * @param ids
     * @return
     */
    int unpublish(String[] ids);

    /**
     * 升级包详情
     * @param packageTaskId
     * @return
     */
    UpgradePackageDetailVO upgradePackageDetails(String packageTaskId);
}
