package com.jk.dao;

import com.jk.model.Tree;

import java.util.List;

/**
 * Created by lyc on 2018/4/8.
 */
public interface TreeMapper {

    List<Tree> queryTreeList(Tree tree);

}
