package indi.goddess.shoppingmall2.dao.manager;

import indi.goddess.shoppingmall2.beans.TbItemCat;
import indi.goddess.shoppingmall2.entity.PageResult;

import java.util.List;


public interface ZTbItemCatDao {

    /**
     * 返回全部列表
     * @return
     */
    public List<TbItemCat> findAll();


    /**
     * 返回分页列表
     * @return
     */
    public PageResult findPage(int pageNum, int pageSize);


    /**
     * 增加
     */
    public void add(TbItemCat itemCat);


    /**
     * 修改
     */
    public void update(TbItemCat itemCat);


    /**
     * 根据ID获取实体
     * @param id
     * @return
     */
    public TbItemCat findOne(Long id);


    /**
     * 批量删除
     * @param ids
     */
    public void delete(Long[] ids);

    /**
     * 分页
     * @param pageNum 当前页 码
     * @param pageSize 每页记录数
     * @return
     */
    public PageResult findPage(TbItemCat itemCat, int pageNum, int pageSize);

    /**
     * 根据父ID查询分类的方法
     * @param parentId
     * @return
     */
    public List<TbItemCat> findByParentId(Long parentId);
}
