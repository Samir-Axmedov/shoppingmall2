package indi.goddess.shoppingmall2.dao.seller;

import indi.goddess.shoppingmall2.beans.TbGoods;
import indi.goddess.shoppingmall2.beans.TbItem;
import indi.goddess.shoppingmall2.beans.group.Goods;
import indi.goddess.shoppingmall2.entity.PageResult;

import java.util.List;

public interface TbGoodsDao {
    /**
     * 返回全部列表
     * @return
     */
    public List<TbGoods> findAll();


    /**
     * 返回分页列表
     * @return
     */
    public PageResult findPage(int pageNum, int pageSize, int auditStatus);


    /**
     * 增加
     */
    public void add(TbGoods goods);


    /**
     * 修改
     */
    public void update(TbGoods goods);


    /**
     * 根据ID获取实体
     * @param id
     * @return
     */
    public TbGoods findOne(Long id);


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
    public PageResult findPage(TbGoods goods, int pageNum, int pageSize);

    public void updateStatus(Long[] ids, String status);


    /**
     * 根据SPU的ID集合查询SKU列表
     * @param goodsIds
     * @param status
     * @return
     */
    public List<TbItem>	findItemListByGoodsIdListAndStatus(Long[] goodsIds, String status);
}
