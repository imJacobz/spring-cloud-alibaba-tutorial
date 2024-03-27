package com.jacobz.nxauto.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jacobz.nxauto.model.entity.Node;
import com.jacobz.nxauto.service.NodeService;
import com.jacobz.nxauto.mapper.NodeMapper;
import org.springframework.stereotype.Service;

@Service
public class NodeServiceImpl extends ServiceImpl<NodeMapper, Node>
    implements NodeService{

}




