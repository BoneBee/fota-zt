package com.intest.packageservice.service;

import com.intest.common.result.PagerDataBaseVO;
import com.intest.dao.entity.PartsTreeBto;
import com.intest.packageservice.request.MakeRequest;
import com.intest.packageservice.request.PartsTreeRequest;
import com.intest.packageservice.request.UpgradePackageRequest;
import com.intest.packageservice.request.VersionRequest;
import com.intest.packageservice.vo.PartsVO;
import com.intest.packageservice.vo.UpgradePackageDetailVO;
import com.intest.packageservice.vo.UpgradePackageVO;
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
    int unpublish(String packageTaskId);

    /**
     * 升级包描述
     * @param packageTaskId
     * @return
     */
    UpgradePackageDetailVO upgradePackageDesc(String packageTaskId);

    /**
     * 获取升级零件
     * @param packageTaskId
     * @return
     */
    List<PartsVO> getParts(String packageTaskId);

    /**
     * 获取升级包信息
     * @param packageTaskId
     * @return
     */
    List<UpgradePackageVO> getUpgradePackage(String packageTaskId);
}
