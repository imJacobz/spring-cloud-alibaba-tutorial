package com.jacobz.nxauto.common.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jacobz.nxauto.common.entity.Node;
import com.jacobz.nxauto.common.service.NodeService;
import com.jacobz.nxauto.common.mapper.NodeMapper;
import org.springframework.stereotype.Service;

/**
* @author jacob
* @description 针对表【sys_node】的数据库操作Service实现
* @createDate 2023-07-18 10:56:16
*/
@Service
public class NodeServiceImpl extends ServiceImpl<NodeMapper, Node>
    implements NodeService{

}




